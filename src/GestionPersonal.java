import java.util.ArrayList;
import java.util.List;

public class GestionPersonal {
    private List<TipoDePersonal> personal;

    public GestionPersonal() {
        this.personal = new ArrayList<>();
    }

    public void agregarPersonal(TipoDePersonal persona) {
        personal.add(persona);
    }

    public void asignarTareaGeneral() {
        for (TipoDePersonal persona : personal) {
            persona.crearNombre(0);
        }
    }

    public void mostrarDetalleEquipo() {
        for (TipoDePersonal persona : personal) {
            persona.crearNombre(0); // Ejemplo, cada rol tendría su propio comportamiento.
        }
    }
}
