import java.util.ArrayList;
import java.util.List;

public class Notificador implements Sujeto {
    private List<Observador> observadores = new ArrayList<>();

    @Override
    public void notificarPersonal() {
        for (Observador observador : observadores) {
            observador.actualizar();
        }
    }

    @Override
    public void removerPersonal() {
        // Implementación de removerPersonal si es necesario.
        // Aquí podría vaciarse la lista de observadores o aplicar una lógica específica.
    }

    @Override
    public void registrarPersonal() {
        // Implementación de registrarPersonal si es necesario.
        // Aquí podrías agregar lógica para manejar el registro de personal.
    }

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }
}
