/**
 * Clase que representa un contrato con información detallada sobre su duración,
 * condiciones y detalles de pago.
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Contrato {

    /**
     * Denominación social de la entidad asociada al contrato.
     */
    private String denominacionSocial;

    /**
     * Número de identificación fiscal del contratante.
     */
    private String numeroDeIdentificacionFiscal;

    /**
     * Domicilio registrado en el contrato.
     */
    private String domicilio;

    /**
     * Duración del contrato en términos definidos (por ejemplo, "12 meses").
     */
    private String duracionDeContrato;

    /**
     * Fecha de inicio del contrato.
     */
    private LocalDate fechaDeComienzo;

    /**
     * Fecha de expiración del contrato.
     */
    private LocalDate fechaDeExpiracion;

    /**
     * Lugar de trabajo definido en el contrato.
     */
    private String lugarDeTrabajo;

    /**
     * Remuneración acordada en el contrato.
     */
    private double remuneracion;

    /**
     * Fecha específica en la que se realizarán los pagos.
     */
    private LocalDate fechaDePago;

    /**
     * Método o forma de pago especificada en el contrato.
     */
    private String formaDePago;

    /**
     * Constructor que inicializa un contrato con validaciones de los datos ingresados.
     *
     * @param denominacionSocial        Denominación social de la entidad asociada al contrato.
     * @param numeroDeIdentificacionFiscal Número de identificación fiscal del contratante.
     * @param domicilio                 Domicilio registrado en el contrato.
     * @param duracionDeContrato        Duración del contrato en términos definidos (por ejemplo, "12 meses").
     * @param fechaDeComienzo           Fecha de inicio del contrato.
     * @param fechaDeExpiracion         Fecha de expiración del contrato.
     * @param lugarDeTrabajo            Lugar de trabajo definido en el contrato.
     * @param remuneracion              Remuneración acordada en el contrato.
     * @param fechaDePago               Fecha específica en la que se realizarán los pagos.
     * @param formaDePago               Método o forma de pago especificada en el contrato.
     */
    public Contrato(String denominacionSocial, String numeroDeIdentificacionFiscal, String domicilio,
                    String duracionDeContrato, LocalDate fechaDeComienzo, LocalDate fechaDeExpiracion,
                    String lugarDeTrabajo, double remuneracion, LocalDate fechaDePago, String formaDePago) {
        if (fechaDeExpiracion.isBefore(fechaDeComienzo)) {
            throw new IllegalArgumentException("La fecha de expiración no puede ser anterior a la fecha de comienzo.");
        }
        if (remuneracion < 0) {
            throw new IllegalArgumentException("La remuneración no puede ser negativa.");
        }

        this.denominacionSocial = denominacionSocial;
        this.numeroDeIdentificacionFiscal = numeroDeIdentificacionFiscal;
        this.domicilio = domicilio;
        this.duracionDeContrato = duracionDeContrato;
        this.fechaDeComienzo = fechaDeComienzo;
        this.fechaDeExpiracion = fechaDeExpiracion;
        this.lugarDeTrabajo = lugarDeTrabajo;
        this.remuneracion = remuneracion;
        this.fechaDePago = fechaDePago;
        this.formaDePago = formaDePago;
    }

    /**
     * Calcula la duración del contrato en días basándose en las fechas de comienzo y expiración.
     *
     * @return Duración del contrato en días.
     */
    public long calcularDuracionEnDias() {
        return ChronoUnit.DAYS.between(fechaDeComienzo, fechaDeExpiracion);
    }

    /**
     * Verifica si el contrato está activo con base en la fecha actual.
     *
     * @return true si el contrato está activo, false en caso contrario.
     */
    public boolean estaActivo() {
        LocalDate hoy = LocalDate.now();
        return !hoy.isBefore(fechaDeComienzo) && !hoy.isAfter(fechaDeExpiracion);
    }

    /**
     * Valida si el contrato está activo en una fecha específica.
     *
     * @param fecha Fecha específica a verificar.
     * @return true si el contrato está activo en la fecha dada, false en caso contrario.
     */
    public boolean estaActivoEnFecha(LocalDate fecha) {
        return !fecha.isBefore(fechaDeComienzo) && !fecha.isAfter(fechaDeExpiracion);
    }

    // Getters y setters con validación donde es necesario

    public String getDenominacionSocial() {
        return denominacionSocial;
    }

    public void setDenominacionSocial(String denominacionSocial) {
        this.denominacionSocial = denominacionSocial;
    }

    public String getNumeroDeIdentificacionFiscal() {
        return numeroDeIdentificacionFiscal;
    }

    public void setNumeroDeIdentificacionFiscal(String numeroDeIdentificacionFiscal) {
        this.numeroDeIdentificacionFiscal = numeroDeIdentificacionFiscal;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDuracionDeContrato() {
        return duracionDeContrato;
    }

    public void setDuracionDeContrato(String duracionDeContrato) {
        this.duracionDeContrato = duracionDeContrato;
    }

    public LocalDate getFechaDeComienzo() {
        return fechaDeComienzo;
    }

    public LocalDate getFechaDeExpiracion() {
        return fechaDeExpiracion;
    }

    public String getLugarDeTrabajo() {
        return lugarDeTrabajo;
    }

    public void setLugarDeTrabajo(String lugarDeTrabajo) {
        this.lugarDeTrabajo = lugarDeTrabajo;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        if (remuneracion < 0) {
            throw new IllegalArgumentException("La remuneración no puede ser negativa.");
        }
        this.remuneracion = remuneracion;
    }

    public LocalDate getFechaDePago() {
        return fechaDePago;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }
}