public class ReportesAltaDireccion extends ReportesFinancieros {

    @Override
    public void notificarPersonal() {
        // Implementación de notificación si es necesaria para ReporteAltaDireccion.
    }

    @Override
    public void removerPersonal() {
        // Implementación de removerPersonal si es necesaria para ReporteAltaDireccion.
    }

    @Override
    public void registrarPersonal() {
        // Implementación de registrarPersonal si es necesaria para ReporteAltaDireccion.
    }

    @Override
    public double aplicarReportesFinancieros(Finanzas finanzas) {
        // Implementación específica de alta dirección
        return 0;
    }

    @Override
    public void saldo() {
        System.out.println("Reporte de saldo para alta dirección.");
    }

    @Override
    public void numeroDePatrocinios() {
        System.out.println("Reporte del número de patrocinios para alta dirección.");
    }

    @Override
    public void totalDeGastosPersonal() {
        System.out.println("Reporte de gastos de personal para alta dirección.");
    }

    @Override
    public void totalDeGastosMcLaren() {
        System.out.println("Reporte de gastos de McLaren para alta dirección.");
    }

    @Override
    public void datosDePatrocinio() {
        System.out.println("Reporte de datos de patrocinio para alta dirección.");
    }

    @Override
    public void marketing() {
        System.out.println("Reporte de marketing para alta dirección.");
    }
}
