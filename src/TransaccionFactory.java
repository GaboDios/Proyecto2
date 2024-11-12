import java.time.LocalDate;

public class TransaccionFactory {

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
