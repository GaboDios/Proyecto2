import java.time.LocalDate;

/**
 * Clase que representa un patrocinador con un contrato de patrocinio asociado.
 * Permite gestionar la información del patrocinador y su contrato.
 */
public class Patrocinador {
    private String nombre;
    private ContratoPatrocinio contrato;

    /**
     * Constructor que inicializa un patrocinador con su nombre y un contrato de patrocinio.
     *
     * @param nombre      Nombre del patrocinador.
     * @param fechaInicio Fecha de inicio del contrato (sin uso directo en esta implementación).
     * @param fechaFin    Fecha de fin del contrato (sin uso directo en esta implementación).
     */
    public Patrocinador(String nombre, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.contrato = new ContratoPatrocinio();
    }

    /**
     * Inicializa el contrato de patrocinio con valores predeterminados y personalizados.
     * Este método crea los detalles del contrato basado en un índice proporcionado.
     *
     * @param index Índice utilizado para generar valores únicos para el contrato.
     */
    public void inicializarContrato(int index) {
        contrato.crearFirma(index);
        contrato.crearAutorizacion(index);
        contrato.crearIdentificacionFiscal(index);
        contrato.crearDuracionDeContrato(12); // Duración fija de ejemplo
        contrato.crearFechaDeComienzo(index);
        contrato.crearFechaDeExpiracion(12); // Duración fija de 12 meses
        contrato.crearLugarDeTrabajo(index);
        contrato.crearRemuneracion(index);
        contrato.crearFechaDePago(index);
    }

    /**
     * Obtiene el nombre del patrocinador.
     *
     * @return Nombre del patrocinador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el contrato de patrocinio asociado al patrocinador.
     *
     * @return Objeto de tipo {@link ContratoPatrocinio}.
     */
    public ContratoPatrocinio getContrato() {
        return contrato;
    }
}
