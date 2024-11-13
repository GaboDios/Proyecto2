/**
 * Clase que representa a un piloto dentro de un equipo.
 * Extiende la clase {@link BaseTipoDePersonal} y proporciona
 * funcionalidades específicas relacionadas con los pilotos.
 */
public class Piloto extends BaseTipoDePersonal {

    /**
     * Constructor para inicializar los atributos del piloto.
     *
     * @param nombre        Nombre del piloto.
     * @param identificador Identificador único del piloto.
     * @param sueldo        Sueldo asignado al piloto.
     * @param equipo        Nombre del equipo al que pertenece el piloto.
     */
    public Piloto(String nombre, String identificador, double sueldo, String equipo) {
        super(nombre, identificador, sueldo, equipo);
    }

    /**
     * Implementación del método para crear un nombre específico para el piloto.
     *
     * @param index Índice usado para identificar al piloto.
     */
    @Override
    public void crearNombre(int index) {
        System.out.println("Creando nombre para el piloto con índice: " + index);
    }

    /**
     * Configura las habilidades específicas del piloto.
     * Este método puede incluir lógica relacionada con la personalización
     * de las habilidades del piloto para carreras.
     */
    public void configurarHabilidades() {
        System.out.println("Configurando habilidades específicas para el piloto.");
    }

    /**
     * Define la estrategia de manejo para el piloto.
     * Este método puede incluir la asignación de tácticas y estilos de conducción
     * en función de las condiciones de la carrera.
     */
    public void definirEstrategiaDeManejo() {
        System.out.println("Definiendo estrategia de manejo para el piloto.");
    }
}
