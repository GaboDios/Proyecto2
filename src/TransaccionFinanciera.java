import java.time.LocalDate;

/**
 * Clase abstracta que representa una transacción financiera en el sistema.
 * Proporciona los atributos y métodos básicos para gestionar una transacción.
 * Las subclases deben implementar el método abstracto {@code procesar()} para definir
 * la lógica específica de cada tipo de transacción.
 */
public abstract class TransaccionFinanciera {
    protected double monto; // Monto de la transacción
    protected String descripcion; // Descripción de la transacción
    protected LocalDate fecha; // Fecha de la transacción

    /**
     * Constructor para inicializar los atributos de una transacción financiera.
     *
     * @param monto       El monto de la transacción.
     * @param descripcion La descripción de la transacción.
     * @param fecha       La fecha en la que se realiza la transacción.
     */
    public TransaccionFinanciera(double monto, String descripcion, LocalDate fecha) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    /**
     * Obtiene el monto de la transacción.
     *
     * @return El monto de la transacción.
     */
    public double getMonto() {
        return monto;
    }

    /**
     * Obtiene la descripción de la transacción.
     *
     * @return La descripción de la transacción.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Obtiene la fecha de la transacción.
     *
     * @return La fecha de la transacción.
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Método abstracto que define la lógica específica para procesar una transacción.
     * Las subclases deben proporcionar una implementación para este método.
     */
    public abstract void procesar();
}
