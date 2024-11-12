public class Ingeniero extends BaseTipoDePersonal {

    @Override
    public void crearNombre(int index) {
        System.out.println("Creando nombre para el ingeniero con índice: " + index);
    }

    public void ajustarSistemasVehiculo() {
        System.out.println("Ajustando sistemas del vehículo.");
    }

    public void analizarDatos() {
        System.out.println("Analizando datos de rendimiento.");
    }
}
