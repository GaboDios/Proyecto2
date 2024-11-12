public class ExtremeEFactory implements EquipoFactory {

    @Override
    public Equipo crearEquipo() {
        Equipo extremeE = new Equipo("extremeE");
        RolesFactory rolesFactory = new RolesFactory();

        // Agregar roles específicos para el equipo FormulaE
        extremeE.agregarPersonal(rolesFactory.crearRol("jefe", "Jefe ExtremeE", 5200, "ExtremeE"));
        extremeE.agregarPersonal(rolesFactory.crearRol("ingeniero", "Ingeniero ExtremeE", 3100, "ExtremeE"));
        extremeE.agregarPersonal(rolesFactory.crearRol("ingeniero", "Ingeniero 2 ExtremeE", 3100, "ExtremeE"));
        extremeE.agregarPersonal(rolesFactory.crearRol("estratega", "Estratega ExtremeE", 4100, "ExtremeE"));
        extremeE.agregarPersonal(rolesFactory.crearRol("estratega", "Estratega 2 ExtremeE", 4100, "ExtremeE"));
        extremeE.agregarPersonal(rolesFactory.crearRol("piloto", "Piloto ExtremeE", 8200, "ExtremeE"));
        extremeE.agregarPersonal(rolesFactory.crearRol("piloto", "Piloto 2 ExtremeE", 8200, "ExtremeE"));

        for (int i = 0; i < 22; i++) {
            extremeE.agregarPersonal(rolesFactory.crearRol("mecanico", "Mecanico " + (i + 1) + " ExtremeE", 2550, "ExtremeE"));
        }

        for (int i = 0; i < 10; i++) {
            extremeE.agregarPersonal(rolesFactory.crearRol("crew", "Crew " + (i + 1) + " ExtremeE", 2050, "ExtremeE"));
        }

        return extremeE;
    }
}
