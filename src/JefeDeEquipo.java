/**
 * Clase que representa a un Jefe de Equipo dentro de un equipo.
 * Extiende la clase BaseTipoDePersonal y proporciona funcionalidades
 * específicas relacionadas con la gestión estratégica del equipo.
 */
public class JefeDeEquipo extends BaseTipoDePersonal {

    /**
     * Constructor para inicializar los atributos del Jefe de Equipo.
     *
     * @param nombre        Nombre del Jefe de Equipo.
     * @param identificador Identificador único del Jefe de Equipo.
     * @param sueldo        Sueldo asignado al Jefe de Equipo.
     * @param equipo        Nombre del equipo al que pertenece el Jefe de Equipo.
     */
    public JefeDeEquipo(String nombre, String identificador, double sueldo, String equipo) {
        super(nombre, identificador, sueldo, equipo); // Llama al constructor de la clase base
    }

    /**
     * Implementación del método para crear un nombre específico para el Jefe de Equipo.
     *
     * @param index Índice usado para identificar al Jefe de Equipo.
     */
    @Override
    public void crearNombre(int index) {
        System.out.println("Creando nombre para el Jefe de Equipo: " + nombre);
    }

    /**
     * Implementación del método para crear un identificador único para el Jefe de Equipo.
     *
     * @param index Índice usado para identificar al Jefe de Equipo.
     */
    @Override
    public void crearIdentificador(int index) {
        System.out.println("Identificador del Jefe de Equipo: " + identificador);
    }

    /**
     * Implementación del método para crear un usuario asociado al Jefe de Equipo.
     *
     * @param index Índice usado para identificar al Jefe de Equipo.
     */
    @Override
    public void crearUsuario(int index) {
        System.out.println("Creando usuario para el Jefe de Equipo en el equipo: " + equipo);
    }

    /**
     * Implementación del método para establecer el sueldo del Jefe de Equipo.
     *
     * @param index Índice usado para identificar al Jefe de Equipo.
     */
    @Override
    public void crearSueldo(int index) {
        System.out.println("Estableciendo sueldo para el Jefe de Equipo: $" + sueldo);
    }

    /**
     * Método específico para planificar la estrategia del equipo.
     */
    public void planificarEstrategia() {
        System.out.println("El Jefe de Equipo " + nombre + " está planificando la estrategia del equipo.");
    }

    /**
     * Obtiene el nombre del Jefe de Equipo.
     *
     * @return Nombre del Jefe de Equipo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el identificador del Jefe de Equipo.
     *
     * @return Identificador del Jefe de Equipo.
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Obtiene el sueldo del Jefe de Equipo.
     *
     * @return Sueldo del Jefe de Equipo.
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Obtiene el nombre del equipo al que pertenece el Jefe de Equipo.
     *
     * @return Nombre del equipo.
     */
    public String getEquipo() {
        return equipo;
    }
}
