import java.util.List;

public class GeneradorReportes {

    public void generarReporteFinanciero(List<Transaccion> transacciones, String periodo) {
        System.out.println("Generando reporte financiero para el periodo: " + periodo);
        for (Transaccion t : transacciones) {
            System.out.println("Tipo: " + t.getTipo() + ", Monto: " + t.getMonto() + ", Descripción: " + t.getDescripcion());
        }
    }

    public void generarReportePatrocinios(List<Patrocinador> patrocinios, String periodo) {
        System.out.println("Generando reporte de patrocinios para el periodo: " + periodo);
        for (Patrocinador p : patrocinios) {
            System.out.println("Patrocinador: " + p.getNombre() + ", Monto: " + p.getContratoPatrocinio().getMonto());
        }
    }

    public void generarReporteInventario(List<Auto> autos) {
        System.out.println("Generando reporte de inventario de autos:");
        for (Auto auto : autos) {
            System.out.println("Modelo: " + auto.getModelo() + ", Estado: " + auto.getEstado());
        }
    }
}
