import java.util.ArrayList;
import java.util.List;

/**
 * Clase Notificador que implementa la interfaz Sujeto.
 * Actúa como un sujeto en el patrón Observer, permitiendo la gestión
 * de observadores (personal) y la notificación de cambios.
 */
public class Notificador implements Sujeto {
    private List<Observador> observadores = new ArrayList<>();

    /**
     * Método para notificar a todos los observadores registrados.
     * Se invoca cuando hay un cambio significativo en el sujeto.
     */
    @Override
    public void notificarPersonal() {
        for (Observador observador : observadores) {
            observador.actualizar();
        }
    }

    /**
     * Método para remover observadores o aplicar una lógica específica
     * relacionada con la eliminación de personal.
     */
    @Override
    public void removerPersonal() {
        // Implementación específica de removerPersonal si es necesario.
        // Ejemplo: observadores.clear();
        System.out.println("Lógica de remoción de personal no implementada aún.");
    }

    /**
     * Método para registrar personal o aplicar lógica adicional
     * relacionada con el registro de nuevos observadores.
     */
    @Override
    public void registrarPersonal() {
        // Implementación específica de registrarPersonal si es necesario.
        // Ejemplo: lógica personalizada para gestionar observadores.
        System.out.println("Lógica de registro de personal no implementada aún.");
    }

    /**
     * Método para agregar un observador a la lista.
     *
     * @param observador Observador que se desea registrar.
     */
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    /**
     * Método para eliminar un observador de la lista.
     *
     * @param observador Observador que se desea eliminar.
     */
    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }
}
