import java.util.Date;

public class Gasto extends Transaccion {

    public Gasto(double monto, Date fecha, String descripcion, String equipo) {
        super(monto, fecha, "Gasto", descripcion, equipo);
    }

    @Override
    public void registrar() {
        System.out.println("Registrando gasto de: " + monto + " para el equipo: " + equipo);
    }

    @Override
    public void editar(double monto, String descripcion) {
        this.monto = monto;
        this.descripcion = descripcion;
        System.out.println("Gasto editado.");
    }

    @Override
    public void eliminar() {
        System.out.println("Gasto eliminado.");
    }
}
