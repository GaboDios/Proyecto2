import java.util.ArrayList;
import java.util.List;

/**
 * Clase Singleton que gestiona el registro financiero de una organización.
 * Almacena transacciones financieras y permite calcular ingresos, gastos y el balance total.
 */
public class RegistroFinanciero {
    private static RegistroFinanciero instancia; // Instancia única de la clase
    private List<TransaccionFinanciera> transacciones = new ArrayList<>(); // Lista de transacciones financieras

    /**
     * Constructor privado para evitar instancias externas.
     */
    private RegistroFinanciero() {}

    /**
     * Obtiene la instancia única de RegistroFinanciero.
     *
     * @return Instancia única de RegistroFinanciero.
     */
    public static RegistroFinanciero getInstancia() {
        if (instancia == null) {
            instancia = new RegistroFinanciero();
        }
        return instancia;
    }

    /**
     * Agrega una nueva transacción financiera al registro.
     *
     * @param transaccion Transacción financiera a agregar.
     */
    public void agregarTransaccion(TransaccionFinanciera transaccion) {
        transacciones.add(transaccion);
    }

    /**
     * Calcula el monto total de los ingresos registrados.
     *
     * @return Suma de los ingresos.
     */
    public double calcularIngresosTotales() {
        return transacciones.stream()
                .filter(t -> t instanceof Ingreso)
                .mapToDouble(TransaccionFinanciera::getMonto)
                .sum();
    }

    /**
     * Calcula el monto total de los gastos registrados.
     *
     * @return Suma de los gastos.
     */
    public double calcularGastosTotales() {
        return transacciones.stream()
                .filter(t -> t instanceof Gasto)
                .mapToDouble(TransaccionFinanciera::getMonto)
                .sum();
    }

    /**
     * Calcula el balance total, es decir, la diferencia entre ingresos y gastos.
     *
     * @return Balance total.
     */
    public double calcularBalance() {
        return calcularIngresosTotales() - calcularGastosTotales();
    }
}
