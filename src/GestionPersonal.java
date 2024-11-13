/**
 * Clase que gestiona una lista de personal dentro de un equipo u organización.
 * Proporciona métodos para agregar personal, asignar tareas generales
 * y mostrar detalles del equipo.
 */
import java.util.ArrayList;
import java.util.List;

public class GestionPersonal {

    /**
     * Lista que almacena las instancias del personal gestionado.
     */
    private List<TipoDePersonal> personal;

    /**
     * Constructor que inicializa la lista de personal.
     */
    public GestionPersonal() {
        this.personal = new ArrayList<>();
    }

    /**
     * Agrega un miembro de personal a la lista gestionada.
     *
     * @param persona Instancia de TipoDePersonal que se agregará a la lista.
     */
    public void agregarPersonal(TipoDePersonal persona) {
        personal.add(persona);
    }

    /**
     * Asigna una tarea general a todo el personal gestionado.
     * En este caso, se muestra el nombre de cada miembro.
     */
    public void asignarTareaGeneral() {
        for (TipoDePersonal persona : personal) {
            persona.crearNombre(0);
        }
    }

    /**
     * Muestra los detalles de todo el personal gestionado.
     * Cada rol implementa su propio comportamiento para mostrar detalles.
     */
    public void mostrarDetalleEquipo() {
        for (TipoDePersonal persona : personal) {
            persona.crearNombre(0); // Ejemplo: comportamiento personalizado por rol.
        }
    }
}
