public class Calidad extends BaseTipoDePersonal {

    public Calidad(String nombre, String identificador, double sueldo, String equipo) {
        super(nombre, identificador, sueldo, equipo);
    }

    @Override
    public void crearNombre(int index) {
        System.out.println("Creando nombre " + index + " para personal de Calidad.");
    }

    @Override
    public void crearIdentificador(int index) {
        System.out.println("Creando identificador " + index + " para personal de Calidad.");
    }

    @Override
    public void crearUsuario(int index) {
        System.out.println("Creando usuario " + index + " para personal de Calidad.");
    }

    @Override
    public void crearSueldo(int index) {
        System.out.println("Creando sueldo " + index + " para personal de Calidad.");
    }


}
