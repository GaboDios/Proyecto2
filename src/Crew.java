/**
 * Clase que representa a un miembro del crew.
 * Extiende la clase BaseTipoDePersonal para implementar funcionalidades específicas del crew.
 */
public class Crew extends BaseTipoDePersonal {

    /**
     * Constructor para inicializar los atributos del miembro del crew.
     *
     * @param nombre        Nombre del miembro del crew.
     * @param identificador Identificador único del miembro del crew.
     * @param sueldo        Sueldo asignado al miembro del crew.
     * @param equipo        Equipo al que pertenece el miembro del crew.
     */
    public Crew(String nombre, String identificador, double sueldo, String equipo) {
        super(nombre, identificador, sueldo, equipo);
    }

    /**
     * Sobrescribe el método para crear el nombre específico del miembro del crew.
     *
     * @param index Índice para diferenciar personal.
     */
    @Override
    public void crearNombre(int index) {
        System.out.println("Creando nombre para el miembro del crew con índice: " + index);
    }

    /**
     * Método específico del crew para preparar los pits antes de una parada.
     */
    public void prepararPits() {
        System.out.println("Preparando pits para la parada.");
    }

    /**
     * Método específico del crew para asistir en el cambio de neumáticos durante una parada.
     */
    public void asistirEnCambioDeNeumaticos() {
        System.out.println("Asistiendo en el cambio de neumáticos.");
    }
}
