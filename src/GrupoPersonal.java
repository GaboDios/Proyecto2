import java.util.ArrayList;
import java.util.List;

public class GrupoPersonal implements TipoDePersonal {
    private List<TipoDePersonal> miembros = new ArrayList<>();
    private String nombreGrupo;

    public GrupoPersonal(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    @Override
    public void crearNombre(int index) {
        System.out.println("Creando nombre para el grupo: " + nombreGrupo);
        for (TipoDePersonal miembro : miembros) {
            miembro.crearNombre(index);
        }
    }

    @Override
    public void crearIdentificador(int index) {
        for (TipoDePersonal miembro : miembros) {
            miembro.crearIdentificador(index);
        }
    }

    @Override
    public void crearUsuario(int index) {
        for (TipoDePersonal miembro : miembros) {
            miembro.crearUsuario(index);
        }
    }

    @Override
    public void crearSueldo(int index) {
        for (TipoDePersonal miembro : miembros) {
            miembro.crearSueldo(index);
        }
    }

    @Override
    public void crearGPU(int index) {
        for (TipoDePersonal miembro : miembros) {
            miembro.crearGPU(index);
        }
    }

    @Override
    public void crearMotherboard(int index) {
        for (TipoDePersonal miembro : miembros) {
            miembro.crearMotherboard(index);
        }
    }

    // Métodos específicos para gestionar la jerarquía
    @Override
    public void agregar(TipoDePersonal personal) {
        miembros.add(personal);
    }

    @Override
    public void remover(TipoDePersonal personal) {
        miembros.remove(personal);
    }

    @Override
    public TipoDePersonal obtenerMiembro(int index) {
        return miembros.get(index);
    }
}
