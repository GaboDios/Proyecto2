import java.util.List;

public class EstrategiaGananciaGeneral implements EstrategiaFinanciera {

    @Override
    public double calcularGanancias(List<Ganancia> ganancias) {
        double total = 0;
        for (Ganancia g : ganancias) {
            total += g.getMonto();
        }
        System.out.println("Total de ganancias: " + total);
        return total;
    }

    @Override
    public double calcularGastos(List<Gasto> gastos) {
        return 0; // No aplicable en esta estrategia
    }
}
