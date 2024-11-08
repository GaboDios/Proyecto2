public class GTS implements ComponenteMcLaren {

    @Override
    public void crearMotor(int index) {
        System.out.println("Creando motor " + index + " para GTS.");
    }

    @Override
    public void crearPuertas(int index) {
        System.out.println("Creando puertas " + index + " para GTS.");
    }

    @Override
    public void crearCorroceria(int index) {
        System.out.println("Creando carrocería " + index + " para GTS.");
    }

    @Override
    public void crearFaros(int index) {
        System.out.println("Creando faros " + index + " para GTS.");
    }

    @Override
    public void crearAleron(int index) {
        System.out.println("Creando alerón " + index + " para GTS.");
    }

    @Override
    public void crearFiltroDeAire(int index) {
        System.out.println("Creando filtro de aire " + index + " para GTS.");
    }
}
