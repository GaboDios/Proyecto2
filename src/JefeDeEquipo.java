public class JefeDeEquipo extends BaseTipoDePersonal {
    private String nombre;
    private String identificador;
    private double sueldo;
    private String equipo;

    public JefeDeEquipo(String nombre, String identificador, double sueldo, String equipo) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.sueldo = sueldo;
        this.equipo = equipo;
    }

    @Override
    public void crearNombre(int index) {
        System.out.println("Creando nombre para el Jefe de Equipo: " + nombre);
    }

    @Override
    public void crearIdentificador(int index) {
        System.out.println("Identificador del Jefe de Equipo: " + identificador);
    }

    @Override
    public void crearUsuario(int index) {
        System.out.println("Creando usuario para el Jefe de Equipo en el equipo: " + equipo);
    }

    @Override
    public void crearSueldo(int index) {
        System.out.println("Estableciendo sueldo para el Jefe de Equipo: $" + sueldo);
    }

    @Override
    public void crearGPU(int index) {
        System.out.println("Asignando GPU al Jefe de Equipo");
    }

    @Override
    public void crearMotherboard(int index) {
        System.out.println("Asignando motherboard al Jefe de Equipo");
    }

    // Método adicional específico del Jefe de Equipo
    public void planificarEstrategia() {
        System.out.println("El Jefe de Equipo " + nombre + " está planificando la estrategia del equipo.");
    }

    // Getters y Setters para los atributos, si son necesarios
    public String getNombre() {
        return nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getEquipo() {
        return equipo;
    }
}
