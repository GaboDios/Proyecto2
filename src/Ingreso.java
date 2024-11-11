import java.time.LocalDate;

public class Ingreso extends TransaccionFinanciera {

    public Ingreso(double monto, String descripcion, LocalDate fecha) {
        super(monto, descripcion, fecha);
    }

    @Override
    public void procesar() {
        System.out.println("Procesando ingreso: " + descripcion + " de monto: " + monto);
        // Lógica de procesamiento del ingreso
    }
}
