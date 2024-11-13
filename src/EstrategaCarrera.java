/**
 * Clase que representa al personal encargado de la estrategia de carrera.
 * Extiende la clase BaseTipoDePersonal para implementar funcionalidades específicas de los estrategas de carrera.
 */
public class EstrategaCarrera extends BaseTipoDePersonal {

    /**
     * Constructor para inicializar los atributos del estratega de carrera.
     *
     * @param nombre        Nombre del estratega de carrera.
     * @param identificador Identificador único del estratega de carrera.
     * @param sueldo        Sueldo asignado al estratega de carrera.
     * @param equipo        Equipo al que pertenece el estratega de carrera.
     */
    public EstrategaCarrera(String nombre, String identificador, double sueldo, String equipo) {
        super(nombre, identificador, sueldo, equipo);
    }

    /**
     * Sobrescribe el método para crear el nombre específico del estratega de carrera.
     *
     * @param index Índice para diferenciar personal.
     */
    @Override
    public void crearNombre(int index) {
        System.out.println("Creando nombre para el estratega de carrera con índice: " + index);
    }

    /**
     * Método específico del estratega de carrera para planificar la próxima parada en pits.
     */
    public void planificarParada() {
        System.out.println("Planificando la próxima parada en pits.");
    }

    /**
     * Método específico del estratega de carrera para ajustar la estrategia durante la carrera.
     */
    public void ajustarEstrategia() {
        System.out.println("Ajustando estrategia de carrera según condiciones actuales.");
    }
}
