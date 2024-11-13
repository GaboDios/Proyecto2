/**
 * Clase que representa un ingreso como una transacción financiera.
 * Extiende la clase TransaccionFinanciera y proporciona la implementación
 * específica para procesar un ingreso.
 */
import java.time.LocalDate;

public class Ingreso extends TransaccionFinanciera {

    /**
     * Constructor para inicializar los atributos del ingreso.
     *
     * @param monto       Monto del ingreso.
     * @param descripcion Descripción del ingreso.
     * @param fecha       Fecha en la que se realiza el ingreso.
     */
    public Ingreso(double monto, String descripcion, LocalDate fecha) {
        super(monto, descripcion, fecha);
    }

    /**
     * Implementación del método para procesar el ingreso.
     * Imprime información sobre el ingreso que se está procesando.
     */
    @Override
    public void procesar() {
        System.out.println("Procesando ingreso: " + descripcion + " de monto: " + monto);
        // Lógica de procesamiento del ingreso
    }
}
