/**
 * Clase que implementa la interfaz EquipoFactory para crear un equipo de ExtremeE.
 * Encapsula la lógica necesaria para inicializar todos los roles asociados a este equipo.
 */
public class ExtremeEFactory implements EquipoFactory {

    /**
     * Crea una instancia del equipo ExtremeE con todos sus roles y personal asociados.
     *
     * @return Una nueva instancia de la clase Equipo configurada para ExtremeE.
     */
    @Override
    public Equipo crearEquipo() {
        Equipo extremeE = new Equipo("ExtremeE");
        RolesFactory rolesFactory = new RolesFactory();

        // Agregar roles específicos para el equipo ExtremeE
        extremeE.agregarPersonal(rolesFactory.crearRol("jefe", "Jefe ExtremeE", 5200, "ExtremeE"));
        extremeE.agregarPersonal(rolesFactory.crearRol("ingeniero", "Ingeniero ExtremeE", 3100, "ExtremeE"));
        extremeE.agregarPersonal(rolesFactory.crearRol("ingeniero", "Ingeniero 2 ExtremeE", 3100, "ExtremeE"));
        extremeE.agregarPersonal(rolesFactory.crearRol("estratega", "Estratega ExtremeE", 4100, "ExtremeE"));
        extremeE.agregarPersonal(rolesFactory.crearRol("estratega", "Estratega 2 ExtremeE", 4100, "ExtremeE"));
        extremeE.agregarPersonal(rolesFactory.crearRol("piloto", "Piloto ExtremeE", 8200, "ExtremeE"));
        extremeE.agregarPersonal(rolesFactory.crearRol("piloto", "Piloto 2 ExtremeE", 8200, "ExtremeE"));

        // Agregar mecánicos
        for (int i = 0; i < 22; i++) {
            extremeE.agregarPersonal(rolesFactory.crearRol("mecanico", "Mecánico " + (i + 1) + " ExtremeE", 2550, "ExtremeE"));
        }

        // Agregar miembros del crew
        for (int i = 0; i < 10; i++) {
            extremeE.agregarPersonal(rolesFactory.crearRol("crew", "Crew " + (i + 1) + " ExtremeE", 2050, "ExtremeE"));
        }

        return extremeE;
    }
}
