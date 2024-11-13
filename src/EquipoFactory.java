/**
 * Interfaz que define el contrato para las factorías de creación de equipos.
 * Permite encapsular la lógica de creación de equipos de forma flexible y extensible.
 */
public interface EquipoFactory {

    /**
     * Crea una instancia de un equipo.
     *
     * @return Una nueva instancia de la clase Equipo.
     */
    Equipo crearEquipo();
}
