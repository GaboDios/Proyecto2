/**
 * Interfaz que define los métodos necesarios para la creación y gestión de contratos.
 * Proporciona métodos para establecer detalles clave como firma, identificación fiscal,
 * duración, fechas y remuneración asociada al contrato.
 */
public interface Contratos {

    /**
     * Crea y asigna una firma al contrato.
     *
     * @param index Índice utilizado para diferenciar firmas.
     */
    void crearFirma(int index);

    /**
     * Crea y asigna una autorización al contrato.
     *
     * @param index Índice utilizado para diferenciar autorizaciones.
     */
    void crearAutorizacion(int index);

    /**
     * Crea y asigna una identificación fiscal al contrato.
     *
     * @param index Índice utilizado para diferenciar identificaciones fiscales.
     */
    void crearIdentificacionFiscal(int index);

    /**
     * Define la duración del contrato en unidades específicas (meses, años, etc.).
     *
     * @param index Índice utilizado para calcular la duración.
     */
    void crearDuracionDeContrato(int index);

    /**
     * Establece la fecha de inicio del contrato.
     *
     * @param index Índice utilizado para calcular la fecha de inicio.
     */
    void crearFechaDeComienzo(int index);

    /**
     * Establece la fecha de expiración del contrato basada en la duración.
     *
     * @param index Índice utilizado para calcular la fecha de expiración.
     */
    void crearFechaDeExpiracion(int index);

    /**
     * Define el lugar de trabajo asociado al contrato.
     *
     * @param index Índice utilizado para diferenciar lugares de trabajo.
     */
    void crearLugarDeTrabajo(int index);

    /**
     * Establece la remuneración asociada al contrato.
     *
     * @param index Índice utilizado para calcular la remuneración.
     */
    void crearRemuneracion(int index);

    /**
     * Establece la fecha de pago asociada al contrato.
     *
     * @param index Índice utilizado para calcular la fecha de pago.
     */
    void crearFechaDePago(int index);
}
