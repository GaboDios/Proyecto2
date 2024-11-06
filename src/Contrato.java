import java.util.Date;

public class Contrato {
    private Date fechaInicio;
    private Date fechaVencimiento;
    private String estado;

    public Contrato(Date fechaInicio, Date fechaVencimiento) {
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.estado = "Vigente";
    }

    public void renovarContrato() {
        // Lógica para renovar el contrato (actualizar la fecha de vencimiento)
        this.estado = "En Renovación";
        System.out.println("El contrato está en renovación.");
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("El contrato ha cambiado a estado: " + nuevoEstado);
    }

    public String getEstado() {
        return estado;
    }
}
