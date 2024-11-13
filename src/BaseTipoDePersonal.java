public abstract class BaseTipoDePersonal implements TipoDePersonal {
    protected String nombre;
    protected String identificador;
    protected double sueldo;
    protected String equipo;

    // Constructor para inicializar los atributos comunes
    public BaseTipoDePersonal(String nombre, String identificador, double sueldo, String equipo) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.sueldo = sueldo;
        this.equipo = equipo;
    }

    @Override
    public void crearNombre(int index) {
        System.out.println("Nombre del personal: " + nombre + " con índice: " + index);
    }

    @Override
    public void crearIdentificador(int index) {
        System.out.println("Identificador del personal: " + identificador + " con índice: " + index);
    }

    @Override
    public void crearUsuario(int index) {
        System.out.println("Creando usuario para el personal en el equipo: " + equipo);
    }

    @Override
    public void crearSueldo(int index) {
        System.out.println("Estableciendo sueldo para el personal: $" + sueldo);
    }

    public double getSueldo(){
        return sueldo;
    }
}
