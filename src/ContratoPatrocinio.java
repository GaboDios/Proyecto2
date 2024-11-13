/**
 * Clase que representa un contrato de patrocinio, implementando la interfaz Contratos.
 * Incluye detalles como firma, identificación fiscal, duración, lugar de trabajo,
 * remuneración y fechas relacionadas.
 */
import java.time.LocalDate;

public class ContratoPatrocinio implements Contratos {

    /**
     * Firma asociada al contrato.
     */
    private String firma;

    /**
     * Autorización vinculada al contrato.
     */
    private String autorizacion;

    /**
     * Identificación fiscal de la entidad patrocinadora.
     */
    private String identificacionFiscal;

    /**
     * Duración del contrato en meses.
     */
    private int duracionMeses;

    /**
     * Fecha de comienzo del contrato.
     */
    private LocalDate fechaComienzo;

    /**
     * Fecha de expiración del contrato.
     */
    private LocalDate fechaExpiracion;

    /**
     * Lugar de trabajo especificado en el contrato.
     */
    private String lugarDeTrabajo;

    /**
     * Remuneración o monto del patrocinio.
     */
    private double remuneracion;

    /**
     * Fecha de pago del patrocinio.
     */
    private LocalDate fechaDePago;

    /**
     * Constructor vacío para inicialización manual de los atributos si es necesario.
     */
    public ContratoPatrocinio() {
        // Constructor por defecto
    }

    /**
     * Genera una firma identificativa para el contrato.
     *
     * @param index Índice utilizado para diferenciar firmas.
     */
    @Override
    public void crearFirma(int index) {
        this.firma = "Firma #" + index;
    }

    /**
     * Genera una autorización para el contrato.
     *
     * @param index Índice utilizado para diferenciar autorizaciones.
     */
    @Override
    public void crearAutorizacion(int index) {
        this.autorizacion = "Autorización #" + index;
    }

    /**
     * Genera una identificación fiscal para el contrato.
     *
     * @param index Índice utilizado para diferenciar identificaciones fiscales.
     */
    @Override
    public void crearIdentificacionFiscal(int index) {
        this.identificacionFiscal = "ID Fiscal #" + index;
    }

    /**
     * Establece la duración del contrato en meses.
     *
     * @param index Índice utilizado para definir la duración.
     */
    @Override
    public void crearDuracionDeContrato(int index) {
        this.duracionMeses = index;
    }

    /**
     * Establece la fecha de comienzo del contrato basándose en el índice.
     *
     * @param index Índice utilizado para calcular la fecha de comienzo.
     */
    @Override
    public void crearFechaDeComienzo(int index) {
        this.fechaComienzo = LocalDate.now().plusDays(index);
    }

    /**
     * Calcula la fecha de expiración del contrato basándose en la duración en meses.
     *
     * @param index Índice utilizado para calcular la fecha de expiración.
     */
    @Override
    public void crearFechaDeExpiracion(int index) {
        this.fechaExpiracion = this.fechaComienzo.plusMonths(index);
    }

    /**
     * Establece el lugar de trabajo asociado al contrato.
     *
     * @param index Índice utilizado para diferenciar lugares de trabajo.
     */
    @Override
    public void crearLugarDeTrabajo(int index) {
        this.lugarDeTrabajo = "Lugar de Trabajo #" + index;
    }

    /**
     * Establece la remuneración del contrato.
     *
     * @param index Índice utilizado para calcular el monto de la remuneración.
     */
    @Override
    public void crearRemuneracion(int index) {
        this.remuneracion = index * 100000; // Ejemplo: remuneración basada en el índice
    }

    /**
     * Calcula y establece la fecha de pago del contrato.
     *
     * @param index Índice utilizado para calcular la fecha de pago.
     */
    @Override
    public void crearFechaDePago(int index) {
        this.fechaDePago = this.fechaComienzo.plusDays(index);
    }

    // Getters

    public String getFirma() {
        return firma;
    }

    public String getAutorizacion() {
        return autorizacion;
    }

    public String getIdentificacionFiscal() {
        return identificacionFiscal;
    }

    public int getDuracionMeses() {
        return duracionMeses;
    }

    public LocalDate getFechaComienzo() {
        return fechaComienzo;
    }

    public LocalDate getFechaExpiracion() {
        return fechaExpiracion;
    }

    public String getLugarDeTrabajo() {
        return lugarDeTrabajo;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public LocalDate getFechaDePago() {
        return fechaDePago;
    }
}
