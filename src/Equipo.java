import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<TipoDePersonal> personal;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.personal = new ArrayList<>();
    }

    // Método para agregar personal al equipo
    public void agregarPersonal(TipoDePersonal miembro) {
        personal.add(miembro);
    }

    // Método para remover personal del equipo
    public void removerPersonal(TipoDePersonal miembro) {
        personal.remove(miembro);
    }

    // Método para calcular el costo total de sueldos en el equipo
    public double calcularCostoNomina() {
        double costoTotal = 0;
        for (TipoDePersonal miembro : personal) {
            if (miembro instanceof BaseTipoDePersonal) {
                costoTotal += ((BaseTipoDePersonal) miembro).getSueldo();
            }
        }
        return costoTotal;
    }

    // Método para reportar el costo de nómina al equipo McLaren
    public double reportarCostoNomina() {
        System.out.println("Costo de nómina para el equipo " + nombre + ": $" + calcularCostoNomina());
        return calcularCostoNomina();
    }

    // Getter para el nombre del equipo
    public String getNombre() {
        return nombre;
    }
}
