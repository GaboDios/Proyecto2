import java.time.LocalDate;

/**
 * Fábrica para la creación de transacciones financieras.
 * Proporciona un método para instanciar objetos de tipo {@link TransaccionFinanciera}
 * según el tipo especificado.
 */
public class TransaccionFactory {

    /**
     * Crea una transacción financiera basada en el tipo, monto, descripción y fecha proporcionados.
     *
     * @param tipo        El tipo de transacción (por ejemplo, "pago_patrocinio", "pago_nomina").
     * @param monto       El monto de la transacción.
     * @param descripcion Una descripción detallada de la transacción.
     * @param fecha       La fecha en la que se realiza la transacción.
     * @return Una instancia de {@link TransaccionFinanciera} específica según el tipo.
     * @throws IllegalArgumentException Si el tipo de transacción no es reconocido.
     */
    public TransaccionFinanciera crearTransaccion(String tipo, double monto, String descripcion, LocalDate fecha) {
        switch (tipo.toLowerCase()) {
            case "pago_patrocinio":
                return new Ingreso(monto, descripcion, fecha);
            case "pago_premio_carrera":
                return new Ingreso(monto, descripcion, fecha);
            case "pago_nomina":
                return new Gasto(monto, descripcion, fecha);
            case "reparaciones":
                return new Gasto(monto, descripcion, fecha);
            default:
                throw new IllegalArgumentException("Tipo de transacción no reconocido: " + tipo);
        }
    }
}
