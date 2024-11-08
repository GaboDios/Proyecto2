public abstract class ReportesFinancieros implements Sujeto {
    public abstract double aplicarReportesFinancieros(Finanzas finanzas);
    public abstract void saldo();
    public abstract void numeroDePatrocinios();
    public abstract void totalDeGastosPersonal();
    public abstract void totalDeGastosMcLaren();
    public abstract void datosDePatrocinio();
    public abstract void marketing();

    // Implementación de métodos de la interfaz Sujeto
    public void agregarObservador(Observador observador) {
        // Implementar lógica para agregar un observador
    }

    public void eliminarObservador(Observador observador) {
        // Implementar lógica para eliminar un observador
    }

    public void notificarPersonal() {
        // Implementar lógica para notificar a los observadores
    }
}
