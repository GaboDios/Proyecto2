public class EstrategaCarrera extends BaseTipoDePersonal {

    @Override
    public void crearNombre(int index) {
        System.out.println("Creando nombre para el estratega de carrera con índice: " + index);
    }

    public void planificarParada() {
        System.out.println("Planificando la próxima parada en pits.");
    }

    public void ajustarEstrategia() {
        System.out.println("Ajustando estrategia de carrera según condiciones actuales.");
    }
}
