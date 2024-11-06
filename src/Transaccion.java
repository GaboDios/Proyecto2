import java.util.Date;

public abstract class Transaccion {
    protected double monto;
    protected Date fecha;
    protected String tipo;
    protected String descripcion;
    protected String equipo;

    public Transaccion(double monto, Date fecha, String tipo, String descripcion, String equipo) {
        this.monto = monto;
        this.fecha = fecha;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.equipo = equipo;
    }

    public abstract void registrar();
    public abstract void editar(double monto, String descripcion);
    public abstract void eliminar();

    public double getMonto() { return monto; }
    public Date getFecha() { return fecha; }
    public String getTipo() { return tipo; }
    public String getDescripcion() { return descripcion; }
    public String getEquipo() { return equipo; }
}
