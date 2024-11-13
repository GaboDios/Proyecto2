/**
 * Interfaz que define las operaciones básicas para un sujeto en el patrón de diseño Observer.
 * El sujeto mantiene una lista de observadores y permite notificarles cambios, agregar o remover observadores.
 */
public interface Sujeto {

    /**
     * Notifica a todos los observadores registrados sobre un cambio en el estado del sujeto.
     * Los observadores reaccionarán según su implementación específica del método `actualizar`.
     */
    void notificarPersonal();

    /**
     * Remueve un observador de la lista de observadores registrados.
     * Esto asegura que el observador ya no reciba notificaciones del sujeto.
     */
    void removerPersonal();

    /**
     * Registra un nuevo observador para que reciba notificaciones del sujeto.
     * Este método se utiliza para agregar observadores a la lista.
     */
    void registrarPersonal();
}
