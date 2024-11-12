public class IndyCarFactory implements EquipoFactory {

    @Override
    public Equipo crearEquipo() {
        Equipo indyCar = new Equipo("IndyCar");
        RolesFactory rolesFactory = new RolesFactory();

        // Agregar roles específicos para el equipo FormulaE
        indyCar.agregarPersonal(rolesFactory.crearRol("jefe", "Jefe IndyCar", 5200, "IndyCar"));
        indyCar.agregarPersonal(rolesFactory.crearRol("ingeniero", "Ingeniero IndyCar", 3100, "IndyCar"));
        indyCar.agregarPersonal(rolesFactory.crearRol("ingeniero", "Ingeniero 2 IndyCar", 3100, "IndyCar"));
        indyCar.agregarPersonal(rolesFactory.crearRol("estratega", "Estratega IndyCar", 4100, "IndyCar"));
        indyCar.agregarPersonal(rolesFactory.crearRol("estratega", "Estratega 2 IndyCar", 4100, "IndyCar"));
        indyCar.agregarPersonal(rolesFactory.crearRol("piloto", "Piloto IndyCar", 8200, "IndyCar"));
        indyCar.agregarPersonal(rolesFactory.crearRol("piloto", "Piloto 2 IndyCar", 8200, "IndyCar"));

        for (int i = 0; i < 22; i++) {
            indyCar.agregarPersonal(rolesFactory.crearRol("mecanico", "Mecanico " + (i + 1) + " IndyCar", 2550, "IndyCar"));
        }

        for (int i = 0; i < 10; i++) {
            indyCar.agregarPersonal(rolesFactory.crearRol("crew", "Crew " + (i + 1) + " IndyCar", 2050, "IndyCar"));
        }

        return indyCar;
    }
}
