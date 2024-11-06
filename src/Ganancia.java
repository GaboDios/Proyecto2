import java.util.Date;

public class Ganancia extends Transaccion {

    public Ganancia(double monto, Date fecha, String descripcion, String equipo) {
        super(monto, fecha, "Ganancia", descripcion, equipo);
    }

    @Override
    public void registrar() {
        System.out.println("Registrando ganancia de: " + monto);
    }

    @Override
    public void editar(double monto, String descripcion) {
        this.monto = monto;
        this.descripcion = descripcion;
        System.out.println("Ganancia editada.");
    }

    @Override
    public void eliminar() {
        System.out.println("Ganancia eliminada.");
    }
}
