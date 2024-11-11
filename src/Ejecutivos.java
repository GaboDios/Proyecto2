public class Ejecutivos extends TiposPersonal {

    @Override
    public void saldo() {
        System.out.println("Calculando saldo para Ejecutivos.");
    }

    @Override
    public void numeroDePatrocinios() {
        System.out.println("Calculando número de patrocinios para Ejecutivos.");
    }

    @Override
    public void totalDeGastosPersonal() {
        System.out.println("Calculando gastos de personal para Ejecutivos.");
    }

    @Override
    public void totalDeGastosMcLaren() {
        System.out.println("Calculando gastos de McLaren para Ejecutivos.");
    }

    @Override
    public void datosDePatrocinio() {
        System.out.println("Calculando datos de patrocinio para Ejecutivos.");
    }

    @Override
    public void marketing() {
        System.out.println("Calculando marketing para Ejecutivos.");
    }
}
