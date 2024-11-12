import java.util.ArrayList;
import java.util.List;

public class McLaren {
    private String nombre;
    private String identificador;
    private double costo;
    private double kilometraje;
    private StateMcLaren estadoActual;

    // Nueva lista para almacenar los equipos
    private List<Equipo> equipos;

    public McLaren(String nombre, String identificador, double costo, double kilometraje) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.costo = costo;
        this.kilometraje = kilometraje;
        this.estadoActual = new EnInventario(this); // Estado inicial
        this.equipos = new ArrayList<>();
    }

    // Método para agregar un equipo a McLaren
    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    // Método para calcular el costo total de nómina de todos los equipos
    public double calcularCostoTotalNomina() {
        double costoTotal = 0;
        for (Equipo equipo : equipos) {
            costoTotal += equipo.calcularCostoNomina();
        }
        System.out.println("Costo total de nómina para todos los equipos: $" + costoTotal);
        return costoTotal;
    }

    // Métodos de cambio de estado
    public void setEstado(StateMcLaren nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    // Métodos delegados al estado actual
    public void verificarIdentificador() {
        estadoActual.verificarIdentificador();
    }

    public void reporteDeGananciasEnUso() {
        estadoActual.reporteDeGananciasEnUso();
    }

    public void modificacionDeFabrica() {
        estadoActual.modificacionDeFabrica();
    }

    public void informeDeTiempoDeUso() {
        estadoActual.informeDeTiempoDeUso();
    }

    public void regresarAlInventario() {
        estadoActual.regresarAlInventario();
    }

    // Getters y setters para los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }
}
