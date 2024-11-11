public class Empleados extends TiposPersonal {

    @Override
    public void saldo() {
        System.out.println("Calculando saldo para Empleados.");
    }

    @Override
    public void numeroDePatrocinios() {
        System.out.println("Calculando número de patrocinios para Empleados.");
    }

    @Override
    public void totalDeGastosPersonal() {
        System.out.println("Calculando gastos de personal para Empleados.");
    }

    @Override
    public void totalDeGastosMcLaren() {
        System.out.println("Calculando gastos de McLaren para Empleados.");
    }

    @Override
    public void datosDePatrocinio() {
        System.out.println("Calculando datos de patrocinio para Empleados.");
    }

    @Override
    public void marketing() {
        System.out.println("Calculando marketing para Empleados.");
    }
}
