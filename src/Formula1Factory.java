/**
 * Clase que implementa la interfaz EquipoFactory para crear un equipo de Formula1.
 * Encapsula la lógica necesaria para inicializar todos los roles asociados a este equipo.
 */
public class Formula1Factory implements EquipoFactory {

    /**
     * Crea una instancia del equipo Formula1 con todos sus roles y personal asociados.
     *
     * @return Una nueva instancia de la clase Equipo configurada para Formula1.
     */
    @Override
    public Equipo crearEquipo() {
        Equipo formula1 = new Equipo("Formula1");
        RolesFactory rolesFactory = new RolesFactory();

        // Agregar roles específicos para el equipo Formula1
        formula1.agregarPersonal(rolesFactory.crearRol("jefe", "Jefe Formula1", 5000, "Formula1"));
        formula1.agregarPersonal(rolesFactory.crearRol("ingeniero", "Ingeniero Formula1", 3000, "Formula1"));
        formula1.agregarPersonal(rolesFactory.crearRol("ingeniero", "Ingeniero 2 Formula1", 3000, "Formula1"));
        formula1.agregarPersonal(rolesFactory.crearRol("estratega", "Estratega Formula1", 4000, "Formula1"));
        formula1.agregarPersonal(rolesFactory.crearRol("estratega", "Estratega 2 Formula1", 4000, "Formula1"));
        formula1.agregarPersonal(rolesFactory.crearRol("piloto", "Piloto Formula1", 8000, "Formula1"));
        formula1.agregarPersonal(rolesFactory.crearRol("piloto", "Piloto 2 Formula1", 8000, "Formula1"));

        // Agregar mecánicos
        for (int i = 0; i < 22; i++) {
            formula1.agregarPersonal(rolesFactory.crearRol("mecanico", "Mecánico " + (i + 1) + " Formula1", 2500, "Formula1"));
        }

        // Agregar miembros del crew
        for (int i = 0; i < 10; i++) {
            formula1.agregarPersonal(rolesFactory.crearRol("crew", "Crew " + (i + 1) + " Formula1", 2000, "Formula1"));
        }

        return formula1;
    }
}
