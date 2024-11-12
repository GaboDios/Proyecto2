public class Finanzas extends BaseTipoDePersonal {

    public Finanzas(String nombre, String identificador, double sueldo, String equipo) {
        super(nombre, identificador, sueldo, equipo);
    }

    @Override
    public void crearNombre(int index) {
        System.out.println("Nombre del personal de Finanzas: " + nombre + " con índice: " + index);
    }

    @Override
    public void crearIdentificador(int index) {
        System.out.println("Identificador del personal de Finanzas: " + identificador + " con índice: " + index);
    }

    @Override
    public void crearUsuario(int index) {
        System.out.println("Creando usuario para el personal de Finanzas en el equipo: " + equipo);
    }

    @Override
    public void crearSueldo(int index) {
        System.out.println("Estableciendo sueldo para el personal de Finanzas: $" + sueldo);
    }
}
