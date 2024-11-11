import java.time.LocalDate;

public class Gasto extends TransaccionFinanciera {

    public Gasto(double monto, String descripcion, LocalDate fecha) {
        super(monto, descripcion, fecha);
    }

    @Override
    public void procesar() {
        System.out.println("Procesando gasto: " + descripcion + " de monto: " + monto);
        // Lógica de procesamiento del gasto
    }
}
