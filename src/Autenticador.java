import java.util.HashMap;
import java.util.Map;

public class Autenticador {
    private Map<String, Usuario> usuariosRegistrados = new HashMap<>();

    public boolean iniciarSesion(String nombreUsuario, String contrasena) {
        Usuario usuario = usuariosRegistrados.get(nombreUsuario);
        if (usuario != null && usuario.getContrasena().equals(contrasena)) {
            System.out.println("Inicio de sesión exitoso para " + nombreUsuario);
            return true;
        }
        System.out.println("Inicio de sesión fallido para " + nombreUsuario);
        return false;
    }

    public void registrarUsuario(Usuario usuario) {
        usuariosRegistrados.put(usuario.getNombreUsuario(), usuario);
        System.out.println("Usuario registrado: " + usuario.getNombreUsuario());
    }
}
