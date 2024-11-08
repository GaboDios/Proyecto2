public class ReporteMarketing extends ReportesFinancieros {

    @Override
    public void notificarPersonal() {
        // Implementación de notificación si es necesaria para ReporteMarketing.
    }

    @Override
    public void removerPersonal() {
        // Implementación de removerPersonal si es necesaria para ReporteMarketing.
    }

    @Override
    public void registrarPersonal() {
        // Implementación de registrarPersonal si es necesaria para ReporteMarketing.
    }

    @Override
    public double aplicarReportesFinancieros(Finanzas finanzas) {
        // Implementación específica de marketing
        return 0;
    }

    @Override
    public void saldo() {
        System.out.println("Reporte de saldo para marketing.");
    }

    @Override
    public void numeroDePatrocinios() {
        System.out.println("Reporte del número de patrocinios para marketing.");
    }

    @Override
    public void totalDeGastosPersonal() {
        System.out.println("Reporte de gastos de personal para marketing.");
    }

    @Override
    public void totalDeGastosMcLaren() {
        System.out.println("Reporte de gastos de McLaren para marketing.");
    }

    @Override
    public void datosDePatrocinio() {
        System.out.println("Reporte de datos de patrocinio para marketing.");
    }

    @Override
    public void marketing() {
        System.out.println("Reporte de marketing para marketing.");
    }
}
