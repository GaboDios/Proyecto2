import java.util.UUID;

public class RolesFactory {

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
