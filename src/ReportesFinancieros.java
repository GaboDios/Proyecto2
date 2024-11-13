/**
 * Clase abstracta que define la estructura para los reportes financieros de McLaren.
 * Implementa la interfaz {@link Sujeto} para gestionar la notificación de observadores.
 */
public abstract class ReportesFinancieros implements Sujeto {

    /**
     * Aplica cálculos o genera reportes financieros específicos para un objeto de Finanzas.
     *
     * @param finanzas Objeto de tipo Finanzas para el cual se generan los reportes.
     * @return Resultado del cálculo o reporte financiero aplicado.
     */
    public abstract double aplicarReportesFinancieros(Finanzas finanzas);

    /**
     * Genera un reporte del saldo actual de McLaren.
     */
    public abstract void saldo();

    /**
     * Genera un reporte del número total de patrocinios actuales.
     */
    public abstract void numeroDePatrocinios();

    /**
     * Calcula y reporta el total de gastos asociados al personal.
     */
    public abstract void totalDeGastosPersonal();

    /**
     * Calcula y reporta el total de gastos operativos de McLaren.
     */
    public abstract void totalDeGastosMcLaren();

    /**
     * Proporciona un reporte detallado sobre los patrocinios, incluyendo contratos y montos.
     */
    public abstract void datosDePatrocinio();

    /**
     * Genera un reporte relacionado con las actividades de marketing y sus costos asociados.
     */
    public abstract void marketing();

    /**
     * Agrega un observador al sistema para ser notificado de actualizaciones.
     *
     * @param observador Instancia de {@link Observador} que será agregada.
     */
    public void agregarObservador(Observador observador) {
        // Implementar lógica para agregar un observador
    }

    /**
     * Elimina un observador del sistema.
     *
     * @param observador Instancia de {@link Observador} que será eliminada.
     */
    public void eliminarObservador(Observador observador) {
        // Implementar lógica para eliminar un observador
    }

    /**
     * Notifica a los observadores registrados sobre actualizaciones en el sistema.
     */
    @Override
    public void notificarPersonal() {
        // Implementar lógica para notificar a los observadores
    }
}
