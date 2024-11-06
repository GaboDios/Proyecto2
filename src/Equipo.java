import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Empleado> miembros;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.miembros = new ArrayList<>();
    }

    public void agregarMiembro(Empleado empleado) {
        if (!miembros.contains(empleado)) {
            miembros.add(empleado);
            System.out.println(empleado.getNombre() + " ha sido agregado al equipo " + nombre);
        }
    }

    public void eliminarMiembro(Empleado empleado) {
        if (miembros.remove(empleado)) {
            System.out.println(empleado.getNombre() + " ha sido eliminado del equipo " + nombre);
        }
    }

    public List<Empleado> listarMiembros() {
        return new ArrayList<>(miembros);
    }
}
