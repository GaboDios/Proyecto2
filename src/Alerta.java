import java.util.Date;

public class Alerta {
    private String tipo;
    private String descripcion;
    private Date fechaGeneracion;

    public Alerta(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fechaGeneracion = new Date();
    }

    public void enviarNotificacion() {
        System.out.println("Alerta [" + tipo + "]: " + descripcion + " - Generada el " + fechaGeneracion);
    }
}
