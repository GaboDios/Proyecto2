/**
 * Clase que representa un grupo de personal como una entidad jerárquica.
 * Implementa la interfaz TipoDePersonal, lo que permite gestionar
 * tanto grupos como individuos de forma uniforme.
 */
import java.util.ArrayList;
import java.util.List;

public class GrupoPersonal implements TipoDePersonal {

    /**
     * Lista de miembros pertenecientes al grupo.
     */
    private List<TipoDePersonal> miembros = new ArrayList<>();

    /**
     * Nombre del grupo.
     */
    private String nombreGrupo;

    /**
     * Constructor para inicializar el grupo con un nombre.
     *
     * @param nombreGrupo Nombre del grupo.
     */
    public GrupoPersonal(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    /**
     * Crea un nombre para el grupo y delega la tarea a cada miembro del grupo.
     *
     * @param index Índice usado para identificar la operación.
     */
    @Override
    public void crearNombre(int index) {
        System.out.println("Creando nombre para el grupo: " + nombreGrupo);
        for (TipoDePersonal miembro : miembros) {
            miembro.crearNombre(index);
        }
    }

    /**
     * Crea un identificador para cada miembro del grupo.
     *
     * @param index Índice usado para identificar la operación.
     */
    @Override
    public void crearIdentificador(int index) {
        for (TipoDePersonal miembro : miembros) {
            miembro.crearIdentificador(index);
        }
    }

    /**
     * Crea un usuario para cada miembro del grupo.
     *
     * @param index Índice usado para identificar la operación.
     */
    @Override
    public void crearUsuario(int index) {
        for (TipoDePersonal miembro : miembros) {
            miembro.crearUsuario(index);
        }
    }

    /**
     * Establece el sueldo para cada miembro del grupo.
     *
     * @param index Índice usado para identificar la operación.
     */
    @Override
    public void crearSueldo(int index) {
        for (TipoDePersonal miembro : miembros) {
            miembro.crearSueldo(index);
        }
    }

    /**
     * Agrega un miembro al grupo.
     *
     * @param personal Instancia de TipoDePersonal que se agregará al grupo.
     */
    @Override
    public void agregar(TipoDePersonal personal) {
        miembros.add(personal);
    }

    /**
     * Remueve un miembro del grupo.
     *
     * @param personal Instancia de TipoDePersonal que se removerá del grupo.
     */
    @Override
    public void remover(TipoDePersonal personal) {
        miembros.remove(personal);
    }

    /**
     * Obtiene un miembro del grupo por su índice.
     *
     * @param index Índice del miembro que se desea obtener.
     * @return Instancia de TipoDePersonal correspondiente al índice.
     */
    @Override
    public TipoDePersonal obtenerMiembro(int index) {
        return miembros.get(index);
    }
}
