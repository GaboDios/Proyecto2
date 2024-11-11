import java.util.ArrayList;
import java.util.List;

public class RegistroFinanciero {
    private  static RegistroFinanciero instancia;
    private List<TransaccionFinanciera> transacciones = new ArrayList<>();

    private RegistroFinanciero() {}

    public static RegistroFinanciero getInstancia() {
        if (instancia == null) {
            instancia = new RegistroFinanciero();
        }
        return instancia;
    }

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
