import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Clase que actúa como fábrica para inicializar y gestionar una lista de patrocinadores.
 */
public class PatrocinadorFactory {
    private List<Patrocinador> patrocinadores; // Lista de patrocinadores

    /**
     * Constructor que inicializa la lista de patrocinadores.
     */
    public PatrocinadorFactory() {
        this.patrocinadores = new ArrayList<>();
    }

    /**
     * Método para inicializar una lista de patrocinadores con contratos aleatorios.
     * Crea 15 patrocinadores con contratos de duración aleatoria entre 5 y 7 años,
     * incluyendo datos como fechas, remuneraciones y detalles del contrato.
     */
    public void inicializarPatrocinadores() {
        Random random = new Random();
        for (int i = 1; i <= 15; i++) {
            String nombrePatrocinador = "Patrocinador" + i;
            LocalDate fechaInicio = LocalDate.now().minusMonths(random.nextInt(12)); // Fecha de inicio aleatoria en el último año
            int duracionContrato = 5 + random.nextInt(3); // Duración entre 5 y 7 años
            LocalDate fechaFin = fechaInicio.plusYears(duracionContrato);

            Patrocinador patrocinador = new Patrocinador(nombrePatrocinador, fechaInicio, fechaFin);
            ContratoPatrocinio contrato = patrocinador.getContrato();

            contrato.crearFirma(i);
            contrato.crearAutorizacion(i);
            contrato.crearIdentificacionFiscal(i);
            contrato.crearDuracionDeContrato(duracionContrato * 12); // Duración en meses
            contrato.crearFechaDeComienzo(0); // La fecha de comienzo ya está configurada en este caso
            contrato.crearFechaDeExpiracion(duracionContrato * 12); // Expiración calculada automáticamente
            contrato.crearLugarDeTrabajo(i);
            contrato.crearRemuneracion(10 + random.nextInt(40)); // Remuneración entre $10M y $50M
            contrato.crearFechaDePago(random.nextInt(30)); // Fecha de pago aleatoria en el primer mes

            patrocinadores.add(patrocinador);
            System.out.println("Patrocinador inicializado: " + nombrePatrocinador);
        }
    }

    /**
     * Devuelve la lista de patrocinadores inicializados.
     *
     * @return Lista de objetos {@link Patrocinador}.
     */
    public List<Patrocinador> getPatrocinadores() {
        return patrocinadores;
    }
}
