import java.util.ArrayList;
import java.util.List;

public class RegistroFinanciero {
    private List<TransaccionFinanciera> transacciones = new ArrayList<>();

    public void agregarTransaccion(TransaccionFinanciera transaccion) {
        transacciones.add(transaccion);
    }

    public double calcularIngresosTotales() {
        return transacciones.stream()
                .filter(t -> t instanceof Ingreso)
                .mapToDouble(TransaccionFinanciera::getMonto)
                .sum();
    }

    public double calcularGastosTotales() {
        return transacciones.stream()
                .filter(t -> t instanceof Gasto)
                .mapToDouble(TransaccionFinanciera::getMonto)
                .sum();
    }

    public double calcularBalance() {
        return calcularIngresosTotales() - calcularGastosTotales();
    }
}
