public class Directores extends TiposPersonal {

    @Override
    public void saldo() {
        System.out.println("Calculando saldo para Directores.");
    }

    @Override
    public void numeroDePatrocinios() {
        System.out.println("Calculando número de patrocinios para Directores.");
    }

    @Override
    public void totalDeGastosPersonal() {
        System.out.println("Calculando gastos de personal para Directores.");
    }

    @Override
    public void totalDeGastosMcLaren() {
        System.out.println("Calculando gastos de McLaren para Directores.");
    }

    @Override
    public void datosDePatrocinio() {
        System.out.println("Calculando datos de patrocinio para Directores.");
    }

    @Override
    public void marketing() {
        System.out.println("Calculando marketing para Directores.");
    }
}
