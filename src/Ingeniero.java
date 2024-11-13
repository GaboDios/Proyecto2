/**
 * Clase que representa a un ingeniero dentro de un equipo.
 * Extiende la clase BaseTipoDePersonal y proporciona funcionalidades específicas
 * relacionadas con las tareas de un ingeniero.
 */
public class Ingeniero extends BaseTipoDePersonal {

    /**
     * Constructor para inicializar los atributos de un ingeniero.
     *
     * @param nombre        Nombre del ingeniero.
     * @param identificador Identificador único del ingeniero.
     * @param sueldo        Sueldo asignado al ingeniero.
     * @param equipo        Nombre del equipo al que pertenece el ingeniero.
     */
    public Ingeniero(String nombre, String identificador, double sueldo, String equipo) {
        super(nombre, identificador, sueldo, equipo);
    }

    /**
     * Implementación del método para crear un nombre específico para el ingeniero.
     *
     * @param index Índice usado para identificar al ingeniero.
     */
    @Override
    public void crearNombre(int index) {
        System.out.println("Creando nombre para el ingeniero con índice: " + index);
    }

    /**
     * Realiza ajustes en los sistemas del vehículo.
     */
    public void ajustarSistemasVehiculo() {
        System.out.println("Ajustando sistemas del vehículo.");
    }

    /**
     * Analiza los datos de rendimiento del vehículo.
     */
    public void analizarDatos() {
        System.out.println("Analizando datos de rendimiento.");
    }
}
