public class Mecanico extends BaseTipoDePersonal {

    public Mecanico(String nombre, String identificador, double sueldo, String equipo) {
        super(nombre, identificador, sueldo, equipo);
    }

    @Override
    public void crearNombre(int index) {
        System.out.println("Creando nombre para el mecánico con índice: " + index);
    }

    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento en el vehículo.");
    }

    public void repararParte(String parte) {
        System.out.println("Reparando la parte: " + parte);
    }
}
