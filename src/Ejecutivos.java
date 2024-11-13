/**
 * Clase que representa al personal ejecutivo.
 * Extiende la clase BaseTipoDePersonal para implementar funcionalidades específicas de los ejecutivos.
 */
public class Ejecutivos extends BaseTipoDePersonal {

    /**
     * Constructor para inicializar los atributos del personal ejecutivo.
     *
     * @param nombre        Nombre del personal ejecutivo.
     * @param identificador Identificador único del personal ejecutivo.
     * @param sueldo        Sueldo asignado al personal ejecutivo.
     * @param equipo        Equipo al que pertenece el personal ejecutivo.
     */
    public Ejecutivos(String nombre, String identificador, double sueldo, String equipo) {
        super(nombre, identificador, sueldo, equipo);
    }

    /**
     * Sobrescribe el método para crear el nombre específico del personal ejecutivo.
     *
     * @param index Índice para diferenciar personal.
     */
    @Override
    public void crearNombre(int index) {
        System.out.println("Creando nombre " + index + " para personal ejecutivo.");
    }

    /**
     * Sobrescribe el método para crear el identificador específico del personal ejecutivo.
     *
     * @param index Índice para diferenciar personal.
     */
    @Override
    public void crearIdentificador(int index) {
        System.out.println("Creando identificador " + index + " para personal ejecutivo.");
    }

    /**
     * Sobrescribe el método para crear el usuario específico del personal ejecutivo.
     *
     * @param index Índice para diferenciar personal.
     */
    @Override
    public void crearUsuario(int index) {
        System.out.println("Creando usuario " + index + " para personal ejecutivo.");
    }

    /**
     * Sobrescribe el método para establecer el sueldo específico del personal ejecutivo.
     *
     * @param index Índice para diferenciar personal.
     */
    @Override
    public void crearSueldo(int index) {
        System.out.println("Creando sueldo " + index + " para personal ejecutivo.");
    }
}
