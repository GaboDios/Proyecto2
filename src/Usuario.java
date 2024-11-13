/**
 * Clase que representa un usuario en el sistema.
 * Los usuarios tienen un nombre, contraseña y un tipo que define su rol en el sistema.
 */
public class Usuario {
    private String nombre; // Nombre del usuario
    private String password; // Contraseña del usuario
    private String tipo; // Tipo de usuario: Ejecutivo, Finanzas, etc.

    /**
     * Constructor para inicializar los atributos del usuario.
     *
     * @param nombre   Nombre del usuario.
     * @param password Contraseña del usuario.
     * @param tipo     Tipo de usuario, que define su rol en el sistema (e.g., Ejecutivo, Finanzas).
     */
    public Usuario(String nombre, String password, String tipo) {
        this.nombre = nombre;
        this.password = password;
        this.tipo = tipo;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la contraseña del usuario.
     *
     * @return La contraseña del usuario.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Obtiene el tipo de usuario.
     *
     * @return El tipo de usuario, que define su rol en el sistema.
     */
    public String getTipo() {
        return tipo;
    }
}
