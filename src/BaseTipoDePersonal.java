public abstract class BaseTipoDePersonal implements TipoDePersonal {

    @Override
    public void crearNombre(int index) {
        System.out.println("Creando nombre para personal con índice: " + index);
    }

    @Override
    public void crearIdentificador(int index) {
        System.out.println("Creando identificador para personal con índice: " + index);
    }

    @Override
    public void crearUsuario(int index) {
        System.out.println("Creando usuario para personal con índice: " + index);
    }

    @Override
    public void crearSueldo(int index) {
        System.out.println("Estableciendo sueldo para personal con índice: " + index);
    }

    @Override
    public void crearGPU(int index) {
        System.out.println("Asignando GPU para personal con índice: " + index);
    }

    @Override
    public void crearMotherboard(int index) {
        System.out.println("Asignando motherboard para personal con índice: " + index);
    }
}
