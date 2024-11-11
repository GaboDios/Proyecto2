import java.time.LocalDate;

public abstract class TransaccionFinanciera {
    protected double monto;
    protected String descripcion;
    protected LocalDate fecha;

    public TransaccionFinanciera(double monto, String descripcion, LocalDate fecha) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public abstract void procesar();
}
