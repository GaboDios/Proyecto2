/**
 * Clase que representa a un mecánico dentro del equipo.
 * Extiende la clase BaseTipoDePersonal y proporciona métodos específicos
 * relacionados con el mantenimiento y reparación de vehículos.
 */
public class Mecanico extends BaseTipoDePersonal {

    /**
     * Constructor para inicializar los atributos del mecánico.
     *
     * @param nombre        Nombre del mecánico.
     * @param identificador Identificador único del mecánico.
     * @param sueldo        Sueldo asignado al mecánico.
     * @param equipo        Nombre del equipo al que pertenece el mecánico.
     */
    public Mecanico(String nombre, String identificador, double sueldo, String equipo) {
        super(nombre, identificador, sueldo, equipo);
    }

    /**
     * Implementación del método para crear un nombre específico para el mecánico.
     *
     * @param index Índice usado para identificar al mecánico.
     */
    @Override
    public void crearNombre(int index) {
        System.out.println("Creando nombre para el mecánico con índice: " + index);
    }

    /**
     * Método específico para realizar mantenimiento en el vehículo.
     * Representa la acción principal de un mecánico dentro del equipo.
     */
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento en el vehículo.");
    }

    /**
     * Método específico para reparar una parte del vehículo.
     *
     * @param parte Nombre de la parte que necesita reparación.
     */
    public void repararParte(String parte) {
        System.out.println("Reparando la parte: " + parte);
    }
}
