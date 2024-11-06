public class AccesoProxy {
    private Usuario usuario;

    public AccesoProxy(Usuario usuario) {
        this.usuario = usuario;
    }

    public void verificarAcceso() {
        if (usuario.tienePermiso("FINANZAS")) {
            System.out.println("Acceso permitido para ver los reportes financieros.");
            // Lógica para mostrar reportes financieros
        } else {
            System.out.println("Acceso denegado. Usuario no autorizado.");
        }
    }
}
