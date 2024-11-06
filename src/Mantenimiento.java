import java.util.Date;

public class Mantenimiento {
    private String descripcion;
    private Date fechaProgramada;
    private String estado;

    public Mantenimiento(String descripcion, Date fechaProgramada) {
        this.descripcion = descripcion;
        this.fechaProgramada = fechaProgramada;
        this.estado = "Pendiente";
    }

    public void programar(Date nuevaFecha) {
        this.fechaProgramada = nuevaFecha;
        System.out.println("Mantenimiento reprogramado para la fecha: " + nuevaFecha);
    }

    public void marcarCompletado() {
        this.estado = "Completado";
        System.out.println("Mantenimiento marcado como completado.");
    }
}
