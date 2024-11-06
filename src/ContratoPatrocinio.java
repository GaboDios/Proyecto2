import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContratoPatrocinio {
    private double monto;
    private Date fechaInicio;
    private Date fechaVencimiento;
    private String estado;
    private List<Date> historialRenovaciones;

    public ContratoPatrocinio(double monto, Date fechaInicio, Date fechaVencimiento) {
        this.monto = monto;
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.estado = "Vigente";
        this.historialRenovaciones = new ArrayList<>();
    }

    public void renovarContrato(Date nuevaFechaVencimiento) {
        this.historialRenovaciones.add(this.fechaVencimiento);
        this.fechaVencimiento = nuevaFechaVencimiento;
        this.estado = "En Renovación";
        System.out.println("Contrato renovado hasta " + nuevaFechaVencimiento);
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Estado del contrato cambiado a: " + estado);
    }

    public void mostrarDetalles() {
        System.out.println("Monto: $" + monto);
        System.out.println("Fecha de Inicio: " + fechaInicio);
        System.out.println("Fecha de Vencimiento: " + fechaVencimiento);
        System.out.println("Estado: " + estado);
    }

    // Getters opcionales
    public double getMonto() {
        return monto;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getEstado() {
        return estado;
    }

    public List<Date> getHistorialRenovaciones() {
        return historialRenovaciones;
    }
}
