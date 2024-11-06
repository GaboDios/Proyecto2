import java.util.List;

public interface EstrategiaFinanciera {
    double calcularGanancias(List<Ganancia> ganancias);
    double calcularGastos(List<Gasto> gastos);
}
