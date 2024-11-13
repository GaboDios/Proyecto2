/**
 * Clase abstracta que implementa la interfaz TipoDePersonal y proporciona
 * una implementación base para atributos y métodos comunes de diferentes tipos de personal.
 */
public abstract class BaseTipoDePersonal implements TipoDePersonal {

    /**
     * Nombre del personal.
     */
    protected String nombre;

    /**
     * Identificador único del personal.
     */
    protected String identificador;

    /**
     * Sueldo asignado al personal.
     */
    protected double sueldo;

    /**
     * Equipo al que pertenece el personal.
     */
    protected String equipo;

    /**
     * Constructor para inicializar los atributos comunes del personal.
     *
     * @param nombre        Nombre del personal.
     * @param identificador Identificador único del personal.
     * @param sueldo        Sueldo asignado al personal.
     * @param equipo        Equipo al que pertenece el personal.
     */
    public BaseTipoDePersonal(String nombre, String identificador, double sueldo, String equipo) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.sueldo = sueldo;
        this.equipo = equipo;
    }

    /**
     * Crea el nombre del personal y lo muestra con un índice.
     *
     * @param index Índice para diferenciar personal.
     */
    @Override
    public void crearNombre(int index) {
        System.out.println("Nombre del personal: " + nombre + " con índice: " + index);
    }

    /**
     * Crea el identificador del personal y lo muestra con un índice.
     *
     * @param index Índice para diferenciar personal.
     */
    @Override
    public void crearIdentificador(int index) {
        System.out.println("Identificador del personal: " + identificador + " con índice: " + index);
    }

    /**
     * Crea un usuario para el personal en el equipo asignado.
     *
     * @param index Índice para diferenciar personal.
     */
    @Override
    public void crearUsuario(int index) {
        System.out.println("Creando usuario para el personal en el equipo: " + equipo);
    }

    /**
     * Establece y muestra el sueldo asignado al personal.
     *
     * @param index Índice para diferenciar personal.
     */
    @Override
    public void crearSueldo(int index) {
        System.out.println("Estableciendo sueldo para el personal: $" + sueldo);
    }

    /**
     * Obtiene el sueldo del personal.
     *
     * @return Sueldo del personal.
     */
    public double getSueldo() {
        return sueldo;
    }
}
