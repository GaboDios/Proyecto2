/**
 * Interfaz Observador que define el método para recibir actualizaciones.
 * Implementa el patrón de diseño Observer, permitiendo que las clases que
 * implementen esta interfaz reaccionen a cambios en un objeto observado.
 */
public interface Observador {

    /**
     * Método que se invoca cuando el sujeto observado notifica a sus observadores.
     * Cada clase que implemente esta interfaz deberá definir la lógica para
     * manejar la actualización.
     */
    void actualizar();
}
