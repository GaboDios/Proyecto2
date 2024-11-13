/**
 * Interfaz que define el comportamiento para las operaciones relacionadas con el estado de los contratos.
 * Cada método representa una acción específica que debe ser implementada por las clases que manejen estados de contratos.
 */
public interface StateContratos {

    /**
     * Realiza la validación legal de un contrato.
     * Verifica que el contrato cumpla con todos los requisitos legales.
     */
    void validaciónLegal();

    /**
     * Identifica alteraciones o inconsistencias en el contrato.
     * Permite detectar modificaciones no autorizadas o errores en la información del contrato.
     */
    void identificacionDeAlteraciones();

    /**
     * Genera un reporte detallado de la información contenida en el contrato.
     * Este reporte puede incluir datos de las partes involucradas, plazos, y obligaciones.
     */
    void reporteDeInformacion();

    /**
     * Verifica modificaciones realizadas en el contrato.
     * Evalúa los cambios para determinar si son válidos o requieren mayor revisión.
     */
    void verificacionDeModificaciones();

    /**
     * Comprueba los datos de aprobación asociados al contrato.
     * Verifica que todas las partes hayan firmado y aprobado los términos del contrato.
     */
    void comprobarDatosDeAprobacion();

    /**
     * Verifica si el contrato cumple con las condiciones para una posible renovación.
     * Analiza los términos actuales y la vigencia para determinar si el contrato es elegible para renovación.
     */
    void verificarRenovacion();

    /**
     * Proporciona un resumen de los datos recaudados del contrato.
     * Este resumen puede incluir información general y métricas relevantes para la gestión del contrato.
     */
    void resumenDeDatosRecaudados();
}
