import java.time.LocalDate;

public class ContratoPatrocinio implements Contratos {
    private String firma;
    private String autorizacion;
    private String identificacionFiscal;
    private int duracionMeses; // Duración en meses
    private LocalDate fechaComienzo;
    private LocalDate fechaExpiracion;
    private String lugarDeTrabajo;
    private double remuneracion; // Monto del patrocinio
    private LocalDate fechaDePago;

    public ContratoPatrocinio() {
        // Constructor vacío para inicialización manual si es necesario
    }

    @Override
    public void crearFirma(int index) {
        this.firma = "Firma #" + index;
        System.out.println("Firma creada: " + this.firma);
    }

    @Override
    public void crearAutorizacion(int index) {
        this.autorizacion = "Autorización #" + index;
        System.out.println("Autorización creada: " + this.autorizacion);
    }

    @Override
    public void crearIdentificacionFiscal(int index) {
        this.identificacionFiscal = "ID Fiscal #" + index;
        System.out.println("Identificación fiscal creada: " + this.identificacionFiscal);
    }

    @Override
    public void crearDuracionDeContrato(int index) {
        this.duracionMeses = index;
        System.out.println("Duración del contrato creada: " + this.duracionMeses + " meses");
    }

    @Override
    public void crearFechaDeComienzo(int index) {
        this.fechaComienzo = LocalDate.now().plusDays(index);
        System.out.println("Fecha de comienzo creada: " + this.fechaComienzo);
    }

    @Override
    public void crearFechaDeExpiracion(int index) {
        this.fechaExpiracion = this.fechaComienzo.plusMonths(index);
        System.out.println("Fecha de expiración creada: " + this.fechaExpiracion);
    }

    @Override
    public void crearLugarDeTrabajo(int index) {
        this.lugarDeTrabajo = "Lugar de Trabajo #" + index;
        System.out.println("Lugar de trabajo creado: " + this.lugarDeTrabajo);
    }

    @Override
    public void crearRemuneracion(int index) {
        this.remuneracion = index * 100000; // Ejemplo: remuneración basada en el índice
        System.out.println("Remuneración creada: $" + this.remuneracion);
    }

    @Override
    public void crearFechaDePago(int index) {
        this.fechaDePago = this.fechaComienzo.plusDays(index);
        System.out.println("Fecha de pago creada: " + this.fechaDePago);
    }

    // Getters
    public String getFirma() {
        return firma;
    }

    public String getAutorizacion() {
        return autorizacion;
    }

    public String getIdentificacionFiscal() {
        return identificacionFiscal;
    }

    public int getDuracionMeses() {
        return duracionMeses;
    }

    public LocalDate getFechaComienzo() {
        return fechaComienzo;
    }

    public LocalDate getFechaExpiracion() {
        return fechaExpiracion;
    }

    public String getLugarDeTrabajo() {
        return lugarDeTrabajo;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public LocalDate getFechaDePago() {
        return fechaDePago;
    }
}
