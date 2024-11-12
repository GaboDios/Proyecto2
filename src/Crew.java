public class Crew extends BaseTipoDePersonal {

    @Override
    public void crearNombre(int index) {
        System.out.println("Creando nombre para el miembro del crew con índice: " + index);
    }

    public void prepararPits() {
        System.out.println("Preparando pits para la parada.");
    }

    public void asistirEnCambioDeNeumaticos() {
        System.out.println("Asistiendo en el cambio de neumáticos.");
    }
}
