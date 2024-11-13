/**
 * Clase que representa al personal del área de Finanzas.
 * Extiende la clase BaseTipoDePersonal para implementar funcionalidades específicas del personal de Finanzas.
 */
public class Finanzas extends BaseTipoDePersonal {

    /**
     * Constructor para inicializar los atributos del personal de Finanzas.
     *
     * @param nombre        Nombre del personal de Finanzas.
     * @param identificador Identificador único del personal de Finanzas.
     * @param sueldo        Sueldo asignado al personal de Finanzas.
     * @param equipo        Equipo al que pertenece el personal de Finanzas.
     */
    public Finanzas(String nombre, String identificador, double sueldo, String equipo) {
        super(nombre, identificador, sueldo, equipo);
    }

    /**
     * Sobrescribe el método para crear el nombre específico del personal de Finanzas.
     *
     * @param index Índice para diferenciar personal.
     */
    @Override
    public void crearNombre(int index) {
        System.out.println("Nombre del personal de Finanzas: " + nombre + " con índice: " + index);
    }

    /**
     * Sobrescribe el método para crear el identificador específico del personal de Finanzas.
     *
     * @param index Índice para diferenciar personal.
     */
    @Override
    public void crearIdentificador(int index) {
        System.out.println("Identificador del personal de Finanzas: " + identificador + " con índice: " + index);
    }

    /**
     * Sobrescribe el método para crear el usuario específico del personal de Finanzas.
     *
     * @param index Índice para diferenciar personal.
     */
    @Override
    public void crearUsuario(int index) {
        System.out.println("Creando usuario para el personal de Finanzas en el equipo: " + equipo);
    }

    /**
     * Sobrescribe el método para establecer el sueldo específico del personal de Finanzas.
     *
     * @param index Índice para diferenciar personal.
     */
    @Override
    public void crearSueldo(int index) {
        System.out.println("Estableciendo sueldo para el personal de Finanzas: $" + sueldo);
    }
}
