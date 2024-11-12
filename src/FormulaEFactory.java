public class FormulaEFactory implements EquipoFactory {

    @Override
    public Equipo crearEquipo() {
        Equipo formulaE = new Equipo("FormulaE");
        RolesFactory rolesFactory = new RolesFactory();

        // Agregar roles específicos para el equipo FormulaE
        formulaE.agregarPersonal(rolesFactory.crearRol("jefe", "Jefe FormulaE", 5200, "FormulaE"));
        formulaE.agregarPersonal(rolesFactory.crearRol("ingeniero", "Ingeniero FormulaE", 3100, "FormulaE"));
        formulaE.agregarPersonal(rolesFactory.crearRol("ingeniero", "Ingeniero 2 FormulaE", 3100, "FormulaE"));
        formulaE.agregarPersonal(rolesFactory.crearRol("estratega", "Estratega FormulaE", 4100, "FormulaE"));
        formulaE.agregarPersonal(rolesFactory.crearRol("estratega", "Estratega 2 FormulaE", 4100, "FormulaE"));
        formulaE.agregarPersonal(rolesFactory.crearRol("piloto", "Piloto FormulaE", 8200, "FormulaE"));
        formulaE.agregarPersonal(rolesFactory.crearRol("piloto", "Piloto 2 FormulaE", 8200, "FormulaE"));

        for (int i = 0; i < 22; i++) {
            formulaE.agregarPersonal(rolesFactory.crearRol("mecanico", "Mecanico " + (i + 1) + " FormulaE", 2550, "FormulaE"));
        }

        for (int i = 0; i < 10; i++) {
            formulaE.agregarPersonal(rolesFactory.crearRol("crew", "Crew " + (i + 1) + " FormulaE", 2050, "FormulaE"));
        }

        return formulaE;
    }
}
