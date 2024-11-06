import java.util.List;

public class EstrategiaGastoInvestigacion implements EstrategiaFinanciera {

    @Override
    public double calcularGanancias(List<Ganancia> ganancias) {
        return 0; // No aplicable en esta estrategia
    }

    @Override
    public double calcularGastos(List<Gasto> gastos) {
        double total = 0;
        for (Gasto g : gastos) {
            if ("Investigación".equals(g.getDescripcion())) {
                total += g.getMonto();
            }
        }
        System.out.println("Total de gastos en investigación: " + total);
        return total;
    }
}
