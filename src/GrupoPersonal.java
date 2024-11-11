import java.util.ArrayList;
import java.util.List;

public class GrupoPersonal extends TiposPersonal {
    private List<TiposPersonal> miembros = new ArrayList<>();

    public void agregar(TiposPersonal miembro) {
        miembros.add(miembro);
    }

    public void remover(TiposPersonal miembro) {
        miembros.remove(miembro);
    }

    @Override
    public void saldo() {
        miembros.forEach(TiposPersonal::saldo);
    }

    @Override
    public void numeroDePatrocinios() {
        miembros.forEach(TiposPersonal::numeroDePatrocinios);
    }

    @Override
    public void totalDeGastosPersonal() {
        miembros.forEach(TiposPersonal::totalDeGastosPersonal);
    }

    @Override
    public void totalDeGastosMcLaren() {
        miembros.forEach(TiposPersonal::totalDeGastosMcLaren);
    }

    @Override
    public void datosDePatrocinio() {
        miembros.forEach(TiposPersonal::datosDePatrocinio);
    }

    @Override
    public void marketing() {
        miembros.forEach(TiposPersonal::marketing);
    }
}
