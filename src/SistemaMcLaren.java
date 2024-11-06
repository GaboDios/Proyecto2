import java.util.ArrayList;
import java.util.List;

public class SistemaMcLaren {
    private List<Transaccion> gestorTransacciones;
    private List<Empleado> gestorPersonal;
    private List<Auto> gestorInventario;
    private List<Patrocinador> gestorPatrocinios;

    public SistemaMcLaren() {
        this.gestorTransacciones = new ArrayList<>();
        this.gestorPersonal = new ArrayList<>();
        this.gestorInventario = new ArrayList<>();
        this.gestorPatrocinios = new ArrayList<>();
    }

    public void registrarGanancia(Ganancia ganancia) {
        gestorTransacciones.add(ganancia);
        ganancia.registrar();
    }

    public void registrarGasto(Gasto gasto) {
        gestorTransacciones.add(gasto);
        gasto.registrar();
    }

    public void agregarEmpleado(Empleado empleado) {
        gestorPersonal.add(empleado);
        System.out.println("Empleado agregado: " + empleado.getNombre());
    }

    public void agregarAuto(Auto auto) {
        gestorInventario.add(auto);
        System.out.println("Auto agregado al inventario: " + auto.getModelo());
    }

    public void agregarPatrocinador(Patrocinador patrocinador) {
        gestorPatrocinios.add(patrocinador);
        System.out.println("Patrocinador registrado: " + patrocinador.getNombre());
    }

    public void generarReporteFinanciero(String periodo) {
        GeneradorReportes generador = new GeneradorReportes();
        generador.generarReporteFinanciero(gestorTransacciones, periodo);
    }
}
