import java.util.List;

public class CalculadoraFinanciera {
    public double calcularBalance(List<TransaccionFinanciera> transacciones) {
        double ingresos = transacciones.stream()
                .filter(t -> t instanceof Ingreso)
                .mapToDouble(TransaccionFinanciera::getMonto)
                .sum();
        double gastos = transacciones.stream()
                .filter(t -> t instanceof Gasto)
                .mapToDouble(TransaccionFinanciera::getMonto)
                .sum();
        return ingresos - gastos;
    }
}
