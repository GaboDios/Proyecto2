/**
 * Clase que representa al personal de Logística dentro de un equipo.
 * Extiende la clase BaseTipoDePersonal y proporciona implementaciones
 * específicas para las tareas relacionadas con la logística.
 */
public class Logistica extends BaseTipoDePersonal {

    /**
     * Constructor para inicializar los atributos del personal de Logística.
     *
     * @param nombre        Nombre del personal de Logística.
     * @param identificador Identificador único del personal de Logística.
     * @param sueldo        Sueldo asignado al personal de Logística.
     * @param equipo        Nombre del equipo al que pertenece el personal de Logística.
     */
    public Logistica(String nombre, String identificador, double sueldo, String equipo) {
        super(nombre, identificador, sueldo, equipo);
    }

    /**
     * Implementación del método para crear un nombre específico para el personal de Logística.
     *
     * @param index Índice usado para identificar al personal.
     */
    @Override
    public void crearNombre(int index) {
        System.out.println("Creando nombre " + index + " para personal de Logística.");
    }

    /**
     * Implementación del método para crear un identificador único para el personal de Logística.
     *
     * @param index Índice usado para identificar al personal.
     */
    @Override
    public void crearIdentificador(int index) {
        System.out.println("Creando identificador " + index + " para personal de Logística.");
    }

    /**
     * Implementación del método para crear un usuario asociado al personal de Logística.
     *
     * @param index Índice usado para identificar al personal.
     */
    @Override
    public void crearUsuario(int index) {
        System.out.println("Creando usuario " + index + " para personal de Logística.");
    }

    /**
     * Implementación del método para establecer el sueldo del personal de Logística.
     *
     * @param index Índice usado para identificar al personal.
     */
    @Override
    public void crearSueldo(int index) {
        System.out.println("Creando sueldo " + index + " para personal de Logística.");
    }
}
