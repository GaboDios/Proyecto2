/**
 * Clase que representa un gasto como una transacción financiera.
 * Extiende la clase TransaccionFinanciera y proporciona la implementación
 * específica para procesar un gasto.
 */
import java.time.LocalDate;

public class Gasto extends TransaccionFinanciera {

    /**
     * Constructor para inicializar los atributos del gasto.
     *
     * @param monto       Monto del gasto.
     * @param descripcion Descripción del gasto.
     * @param fecha       Fecha en la que se realiza el gasto.
     */
    public Gasto(double monto, String descripcion, LocalDate fecha) {
        super(monto, descripcion, fecha);
    }

    /**
     * Implementación del método para procesar el gasto.
     * Imprime información sobre el gasto que se está procesando.
     */
    @Override
    public void procesar() {
        System.out.println("Procesando gasto: " + descripcion + " de monto: " + monto);
        // Lógica de procesamiento del gasto
    }
}
