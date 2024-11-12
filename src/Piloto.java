public class Piloto extends BaseTipoDePersonal {

    @Override
    public void crearNombre(int index) {
        System.out.println("Creando nombre para el piloto con índice: " + index);
    }

    public void configurarHabilidades() {
        System.out.println("Configurando habilidades específicas para el piloto.");
    }

    public void definirEstrategiaDeManejo() {
        System.out.println("Definiendo estrategia de manejo para el piloto.");
    }
}
