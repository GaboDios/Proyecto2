import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PatrocinadorFactory {
    private List<Patrocinador> patrocinadores; // Lista de patrocinadores

    public PatrocinadorFactory() {
        this.patrocinadores = new ArrayList<>();
    }

    public void inicializarPatrocinadores() {
        Random random = new Random();
        for (int i = 1; i <= 15; i++) {
            String nombrePatrocinador = "Patrocinador" + i;
            LocalDate fechaInicio = LocalDate.now().minusMonths(random.nextInt(12)); // Fecha de inicio aleatoria en el último año
            int duracionContrato = 5 + random.nextInt(3); // Duración entre 5 y 7 años
            LocalDate fechaFin = fechaInicio.plusYears(duracionContrato);

            Patrocinador patrocinador = new Patrocinador(nombrePatrocinador,fechaInicio,fechaFin);
            ContratoPatrocinio contrato = patrocinador.getContrato();

            contrato.crearFirma(i);
            contrato.crearAutorizacion(i);
            contrato.crearIdentificacionFiscal(i);
            contrato.crearDuracionDeContrato(duracionContrato * 12); // Duración en meses
            contrato.crearFechaDeComienzo(0); // La fecha de comienzo ya está configurada en este caso
            contrato.crearFechaDeExpiracion(duracionContrato * 12); // Expiración calculada automáticamente
            contrato.crearLugarDeTrabajo(i);
            contrato.crearRemuneracion(10 + random.nextInt(40)); // Remuneración entre $1M y $50M
            contrato.crearFechaDePago(random.nextInt(30)); // Fecha de pago aleatoria en el primer mes

            patrocinadores.add(patrocinador);
            System.out.println("Patrocinador inicializado: " + nombrePatrocinador);
        }
    }

    public List<Patrocinador> getPatrocinadores() {
        return patrocinadores;
    }
}
