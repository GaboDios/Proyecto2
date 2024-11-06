import java.util.List;

public class ReportePatrocinios {
    private String periodo;
    private List<ContratoPatrocinio> contratosPatrocinio;

    public ReportePatrocinios(String periodo, List<ContratoPatrocinio> contratosPatrocinio) {
        this.periodo = periodo;
        this.contratosPatrocinio = contratosPatrocinio;
    }

    public void generarReporte() {
        System.out.println("Reporte de Patrocinios para el periodo: " + periodo);
        for (ContratoPatrocinio contrato : contratosPatrocinio) {
            contrato.mostrarDetalles();
        }
    }

    public void exportarPDF() {
        System.out.println("Exportando reporte de patrocinios a PDF...");
        // Lógica para exportar el reporte en formato PDF
    }

    public void exportarExcel() {
        System.out.println("Exportando reporte de patrocinios a Excel...");
        // Lógica para exportar el reporte en formato Excel
    }
}
