/**
 * Clase que representa al personal de Producción dentro de un equipo.
 * Extiende la clase {@link BaseTipoDePersonal} y proporciona implementaciones
 * específicas para las tareas relacionadas con la producción.
 */
public class Produccion extends BaseTipoDePersonal {

    /**
     * Constructor para inicializar los atributos del personal de Producción.
     *
     * @param nombre        Nombre del personal de Producción.
     * @param identificador Identificador único del personal de Producción.
     * @param sueldo        Sueldo asignado al personal de Producción.
     * @param equipo        Nombre del equipo al que pertenece el personal de Producción.
     */
    public Produccion(String nombre, String identificador, double sueldo, String equipo) {
        super(nombre, identificador, sueldo, equipo);
    }

    /**
     * Implementación del método para crear un nombre específico para el personal de Producción.
     *
     * @param index Índice usado para identificar al personal.
     */
    @Override
    public void crearNombre(int index) {
        System.out.println("Creando nombre " + index + " para personal de Producción.");
    }

    /**
     * Implementación del método para crear un identificador único para el personal de Producción.
     *
     * @param index Índice usado para identificar al personal.
     */
    @Override
    public void crearIdentificador(int index) {
        System.out.println("Creando identificador " + index + " para personal de Producción.");
    }

    /**
     * Implementación del método para crear un usuario asociado al personal de Producción.
     *
     * @param index Índice usado para identificar al personal.
     */
    @Override
    public void crearUsuario(int index) {
        System.out.println("Creando usuario " + index + " para personal de Producción.");
    }

    /**
     * Implementación del método para establecer el sueldo del personal de Producción.
     *
     * @param index Índice usado para identificar al personal.
     */
    @Override
    public void crearSueldo(int index) {
        System.out.println("Creando sueldo " + index + " para personal de Producción.");
    }
}
