public class ReporteContabilidad extends ReportesFinancieros {

    @Override
    public void notificarPersonal() {
        // Implementación de notificación si es necesaria para ReporteContabilidad.
    }

    @Override
    public void removerPersonal() {
        // Implementación de removerPersonal si es necesaria para ReporteContabilidad.
    }

    @Override
    public void registrarPersonal() {
        // Implementación de registrarPersonal si es necesaria para ReporteContabilidad.
    }

    @Override
    public double aplicarReportesFinancieros(Finanzas finanzas) {
        // Implementación específica de contabilidad
        return 0;
    }

    @Override
    public void saldo() {
        System.out.println("Reporte de saldo para contabilidad.");
    }

    @Override
    public void numeroDePatrocinios() {
        System.out.println("Reporte del número de patrocinios para contabilidad.");
    }

    @Override
    public void totalDeGastosPersonal() {
        System.out.println("Reporte de gastos de personal para contabilidad.");
    }

    @Override
    public void totalDeGastosMcLaren() {
        System.out.println("Reporte de gastos de McLaren para contabilidad.");
    }

    @Override
    public void datosDePatrocinio() {
        System.out.println("Reporte de datos de patrocinio para contabilidad.");
    }

    @Override
    public void marketing() {
        System.out.println("Reporte de marketing para contabilidad.");
    }
}
