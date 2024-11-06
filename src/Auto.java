import java.util.ArrayList;
import java.util.List;

public class Auto {
    private String modelo;
    private String numeroSerie;
    private String estado;
    private List<String> caracteristicasTecnicas;
    private String equipoAsignado;
    private List<Mantenimiento> historialMantenimiento;

    public Auto(String modelo, String numeroSerie, String estado, String equipoAsignado) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.estado = estado;
        this.equipoAsignado = equipoAsignado;
        this.caracteristicasTecnicas = new ArrayList<>();
        this.historialMantenimiento = new ArrayList<>();
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Estado del auto actualizado a " + nuevoEstado);
    }

    public void registrarMantenimiento(Mantenimiento mantenimiento) {
        historialMantenimiento.add(mantenimiento);
        System.out.println("Mantenimiento registrado para el auto " + modelo);
    }

    public List<Mantenimiento> obtenerHistorial() {
        return historialMantenimiento;
    }

    public String getModelo(){
        return modelo;
    }

    public String getEstado(){
        return estado;
    }
}
