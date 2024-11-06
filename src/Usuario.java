public class Usuario {
    private String nombreUsuario;
    private String contrasena;
    private String rol;

    public Usuario(String nombreUsuario, String rol) {
        this.nombreUsuario = nombreUsuario;
        this.rol = rol;
    }

    public boolean tienePermiso(String area) {
        // Lógica para verificar si el usuario tiene acceso a un área específica
        return rol.equalsIgnoreCase("ADMIN") || rol.equalsIgnoreCase(area);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }
}
