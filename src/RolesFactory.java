import java.util.UUID;

/**
 * Clase fábrica para crear instancias de diferentes roles dentro de un equipo.
 * Utiliza el patrón Factory para encapsular la lógica de creación de objetos de tipo {@link TipoDePersonal}.
 */
public class RolesFactory {

    /**
     * Crea una instancia de un rol específico basado en el tipo proporcionado.
     *
     * @param tipo   El tipo de rol que se desea crear (por ejemplo, "jefe", "ingeniero", etc.).
     * @param nombre El nombre asignado al rol.
     * @param sueldo El sueldo asociado al rol.
     * @param equipo El nombre del equipo al que pertenece el rol.
     * @return Una instancia de la clase correspondiente al tipo de rol.
     * @throws IllegalArgumentException Si el tipo de rol no es reconocido.
     */
    public TipoDePersonal crearRol(String tipo, String nombre, double sueldo, String equipo) {
        String identificador = UUID.randomUUID().toString(); // Generar un identificador único

        switch (tipo.toLowerCase()) {
            case "jefe":
                return new JefeDeEquipo(nombre, identificador, sueldo, equipo);
            case "ingeniero":
                return new Ingeniero(nombre, identificador, sueldo, equipo);
            case "estratega":
                return new EstrategaCarrera(nombre, identificador, sueldo, equipo);
            case "piloto":
                return new Piloto(nombre, identificador, sueldo, equipo);
            case "mecanico":
                return new Mecanico(nombre, identificador, sueldo, equipo);
            case "crew":
                return new Crew(nombre, identificador, sueldo, equipo);
            case "finanzas":
                return new Finanzas(nombre, identificador, sueldo, equipo);
            case "logistica":
                return new Logistica(nombre, identificador, sueldo, equipo);
            case "construccion":
                return new Construccion(nombre, identificador, sueldo, equipo);
            case "calidad":
                return new Calidad(nombre, identificador, sueldo, equipo);
            case "produccion":
                return new Produccion(nombre, identificador, sueldo, equipo);
            case "ejecutivo":
                return new Ejecutivos(nombre, identificador, sueldo, equipo);
            default:
                throw new IllegalArgumentException("Tipo de rol no reconocido: " + tipo);
        }
    }
}
