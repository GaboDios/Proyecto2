public class Usuario {
    private String nombre;
    private String password;
    private String tipo; // Tipo de usuario: Ejecutivo, Finanzas, etc.

    public Usuario(String nombre, String password, String tipo) {
        this.nombre = nombre;
        this.password = password;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public String getTipo() {
        return tipo;
    }
}
