/**
 * Clase que implementa la interfaz EquipoFactory para crear un equipo de GT.
 * Encapsula la lógica necesaria para inicializar todos los roles asociados a este equipo.
 */
public class GTFactory implements EquipoFactory {

    /**
     * Crea una instancia del equipo GT con todos sus roles y personal asociados.
     *
     * @return Una nueva instancia de la clase Equipo configurada para GT.
     */
    @Override
    public Equipo crearEquipo() {
        Equipo gt = new Equipo("GT");
        RolesFactory rolesFactory = new RolesFactory();

        // Agregar roles específicos para el equipo GT
        gt.agregarPersonal(rolesFactory.crearRol("jefe", "Jefe GT", 5200, "GT"));
        gt.agregarPersonal(rolesFactory.crearRol("ingeniero", "Ingeniero GT", 3100, "GT"));
        gt.agregarPersonal(rolesFactory.crearRol("ingeniero", "Ingeniero 2 GT", 3100, "GT"));
        gt.agregarPersonal(rolesFactory.crearRol("estratega", "Estratega GT", 4100, "GT"));
        gt.agregarPersonal(rolesFactory.crearRol("estratega", "Estratega 2 GT", 4100, "GT"));
        gt.agregarPersonal(rolesFactory.crearRol("piloto", "Piloto GT", 8200, "GT"));
        gt.agregarPersonal(rolesFactory.crearRol("piloto", "Piloto 2 GT", 8200, "GT"));

        // Agregar mecánicos
        for (int i = 0; i < 22; i++) {
            gt.agregarPersonal(rolesFactory.crearRol("mecanico", "Mecánico " + (i + 1) + " GT", 2550, "GT"));
        }

        // Agregar miembros del crew
        for (int i = 0; i < 10; i++) {
            gt.agregarPersonal(rolesFactory.crearRol("crew", "Crew " + (i + 1) + " GT", 2050, "GT"));
        }

        return gt;
    }
}
