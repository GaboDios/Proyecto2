/**
 * Clase que representa un equipo dentro de la organización.
 * Permite gestionar el personal asociado, calcular costos de nómina
 * y reportar estos costos al sistema principal.
 */
import java.util.ArrayList;
import java.util.List;

public class Equipo {

    /**
     * Nombre del equipo.
     */
    private String nombre;

    /**
     * Lista de personal asignado al equipo.
     */
    private List<TipoDePersonal> personal;

    /**
     * Constructor para inicializar un equipo con un nombre.
     *
     * @param nombre Nombre del equipo.
     */
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.personal = new ArrayList<>();
    }

    /**
     * Agrega un miembro de personal al equipo.
     *
     * @param miembro Miembro del personal que será agregado al equipo.
     */
    public void agregarPersonal(TipoDePersonal miembro) {
        personal.add(miembro);
    }

    /**
     * Remueve un miembro de personal del equipo.
     *
     * @param miembro Miembro del personal que será removido del equipo.
     */
    public void removerPersonal(TipoDePersonal miembro) {
        personal.remove(miembro);
    }

    /**
     * Calcula el costo total de los sueldos de todos los miembros del equipo.
     *
     * @return Costo total de nómina del equipo.
     */
    public double calcularCostoNomina() {
        double costoTotal = 0;
        for (TipoDePersonal miembro : personal) {
            if (miembro instanceof BaseTipoDePersonal) {
                costoTotal += ((BaseTipoDePersonal) miembro).getSueldo();
            }
        }
        return costoTotal;
    }

    /**
     * Reporta el costo de nómina del equipo, imprimiendo la información.
     *
     * @return Costo total de nómina del equipo.
     */
    public double reportarCostoNomina() {
        System.out.println("Costo de nómina para el equipo " + nombre + ": $" + calcularCostoNomina());
        return calcularCostoNomina();
    }

    /**
     * Obtiene el nombre del equipo.
     *
     * @return Nombre del equipo.
     */
    public String getNombre() {
        return nombre;
    }
}
