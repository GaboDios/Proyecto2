public class Personal implements Observador {
    private String nombre;
    private String identificador;
    private String usuario;
    private double sueldo;

    public Personal(String nombre, String identificador, String usuario, double sueldo) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.usuario = usuario;
        this.sueldo = sueldo;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getUsuario() {
        return usuario;
    }

    public double getSueldo() {
        return sueldo;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Método para actualización cuando hay una notificación
    @Override
    public void actualizar() {
        System.out.println("Actualización recibida para " + nombre);
    }
}
