public class Supercars implements ComponenteMcLaren {

    @Override
    public void crearMotor(int index) {
        System.out.println("Creando motor " + index + " para Supercars.");
    }

    @Override
    public void crearPuertas(int index) {
        System.out.println("Creando puertas " + index + " para Supercars.");
    }

    @Override
    public void crearCorroceria(int index) {
        System.out.println("Creando carrocería " + index + " para Supercars.");
    }

    @Override
    public void crearFaros(int index) {
        System.out.println("Creando faros " + index + " para Supercars.");
    }

    @Override
    public void crearAleron(int index) {
        System.out.println("Creando alerón " + index + " para Supercars.");
    }

    @Override
    public void crearFiltroDeAire(int index) {
        System.out.println("Creando filtro de aire " + index + " para Supercars.");
    }
}
