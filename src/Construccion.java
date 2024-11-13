/**
 * Clase que representa al personal del departamento de Construcción.
 * Extiende la clase BaseTipoDePersonal para implementar funcionalidades específicas de este tipo de personal.
 */
public class Construccion extends BaseTipoDePersonal {

    /**
     * Constructor para inicializar los atributos del personal de Construcción.
     *
     * @param nombre        Nombre del personal de Construcción.
     * @param identificador Identificador único del personal de Construcción.
     * @param sueldo        Sueldo asignado al personal de Construcción.
     * @param equipo        Equipo al que pertenece el personal de Construcción.
     */
    public Construccion(String nombre, String identificador, double sueldo, String equipo) {
        super(nombre, identificador, sueldo, equipo);
    }

    /**
     * Sobrescribe el método para crear el nombre específico del personal de Construcción.
     *
     * @param index Índice para diferenciar personal.
     */
    @Override
    public void crearNombre(int index) {
        System.out.println("Creando nombre " + index + " para personal de Construcción.");
    }

    /**
     * Sobrescribe el método para crear el identificador específico del personal de Construcción.
     *
     * @param index Índice para diferenciar personal.
     */
    @Override
    public void crearIdentificador(int index) {
        System.out.println("Creando identificador " + index + " para personal de Construcción.");
    }

    /**
     * Sobrescribe el método para crear el usuario específico del personal de Construcción.
     *
     * @param index Índice para diferenciar personal.
     */
    @Override
    public void crearUsuario(int index) {
        System.out.println("Creando usuario " + index + " para personal de Construcción.");
    }

    /**
     * Sobrescribe el método para establecer el sueldo específico del personal de Construcción.
     *
     * @param index Índice para diferenciar personal.
     */
    @Override
    public void crearSueldo(int index) {
        System.out.println("Creando sueldo " + index + " para personal de Construcción.");
    }
}