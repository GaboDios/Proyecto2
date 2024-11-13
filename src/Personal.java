/**
 * Clase que representa a un miembro del personal en el sistema.
 * Implementa la interfaz {@link Observador} para recibir notificaciones.
 */
public class Personal implements Observador {
    private String nombre;
    private String identificador;
    private String usuario;
    private double sueldo;

    /**
     * Constructor para inicializar los atributos del personal.
     *
     * @param nombre        Nombre del miembro del personal.
     * @param identificador Identificador único del miembro del personal.
     * @param usuario       Nombre de usuario del miembro del personal.
     * @param sueldo        Sueldo asignado al miembro del personal.
     */
    public Personal(String nombre, String identificador, String usuario, double sueldo) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.usuario = usuario;
        this.sueldo = sueldo;
    }

    // Getters

    /**
     * Obtiene el nombre del miembro del personal.
     *
     * @return Nombre del miembro del personal.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el identificador único del miembro del personal.
     *
     * @return Identificador único del miembro del personal.
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Obtiene el nombre de usuario del miembro del personal.
     *
     * @return Nombre de usuario del miembro del personal.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Obtiene el sueldo del miembro del personal.
     *
     * @return Sueldo del miembro del personal.
     */
    public double getSueldo() {
        return sueldo;
    }

    // Setters

    /**
     * Establece el nombre del miembro del personal.
     *
     * @param nombre Nuevo nombre del miembro del personal.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el identificador único del miembro del personal.
     *
     * @param identificador Nuevo identificador único del miembro del personal.
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * Establece el nombre de usuario del miembro del personal.
     *
     * @param usuario Nuevo nombre de usuario del miembro del personal.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Establece el sueldo del miembro del personal.
     *
     * @param sueldo Nuevo sueldo del miembro del personal.
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Método de actualización

    /**
     * Método llamado cuando se recibe una notificación desde el sujeto.
     * Implementación de la interfaz {@link Observador}.
     */
    @Override
    public void actualizar() {
        System.out.println("Actualización recibida para " + nombre);
    }
}
