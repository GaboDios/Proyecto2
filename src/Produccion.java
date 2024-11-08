public class Produccion implements TipoDePersonal {

    @Override
    public void crearNombre(int index) {
        System.out.println("Creando nombre " + index + " para personal de Producción.");
    }

    @Override
    public void crearIdentificador(int index) {
        System.out.println("Creando identificador " + index + " para personal de Producción.");
    }

    @Override
    public void crearUsuario(int index) {
        System.out.println("Creando usuario " + index + " para personal de Producción.");
    }

    @Override
    public void crearSueldo(int index) {
        System.out.println("Creando sueldo " + index + " para personal de Producción.");
    }

    @Override
    public void crearGPU(int index) {
        System.out.println("Creando GPU " + index + " para personal de Producción.");
    }

    @Override
    public void crearMotherboard(int index) {
        System.out.println("Creando motherboard " + index + " para personal de Producción.");
    }
}
