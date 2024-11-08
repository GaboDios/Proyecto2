import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Contrato {
    private String denominacionSocial;
    private String numeroDeIdentificacionFiscal;
    private String domicilio;
    private String duracionDeContrato;
    private LocalDate fechaDeComienzo;
    private LocalDate fechaDeExpiracion;
    private String lugarDeTrabajo;
    private double remuneracion;
    private LocalDate fechaDePago;
    private String formaDePago;

    // Constructor con validación de datos
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

    // Getters
    public String getDenominacionSocial() {
        return denominacionSocial;
    }

    public String getNumeroDeIdentificacionFiscal() {
        return numeroDeIdentificacionFiscal;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getDuracionDeContrato() {
        return duracionDeContrato;
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

    public double getRemuneracion() {
        return remuneracion;
    }

    public LocalDate getFechaDePago() {
        return fechaDePago;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    // Setters con validación donde es necesario
    public void setDenominacionSocial(String denominacionSocial) {
        this.denominacionSocial = denominacionSocial;
    }

    public void setNumeroDeIdentificacionFiscal(String numeroDeIdentificacionFiscal) {
        this.numeroDeIdentificacionFiscal = numeroDeIdentificacionFiscal;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setDuracionDeContrato(String duracionDeContrato) {
        this.duracionDeContrato = duracionDeContrato;
    }

    public void setLugarDeTrabajo(String lugarDeTrabajo) {
        this.lugarDeTrabajo = lugarDeTrabajo;
    }

    public void setRemuneracion(double remuneracion) {
        if (remuneracion < 0) {
            throw new IllegalArgumentException("La remuneración no puede ser negativa.");
        }
        this.remuneracion = remuneracion;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    // Métodos adicionales

    /**
     * Calcula la duración del contrato en días basándose en la fecha de comienzo y de expiración.
     * @return Duración en días.
     */
    public long calcularDuracionEnDias() {
        return ChronoUnit.DAYS.between(fechaDeComienzo, fechaDeExpiracion);
    }

    /**
     * Verifica si el contrato está activo en función de la fecha actual.
     * @return true si el contrato está activo, false en caso contrario.
     */
    public boolean estaActivo() {
        LocalDate hoy = LocalDate.now();
        return !hoy.isBefore(fechaDeComienzo) && !hoy.isAfter(fechaDeExpiracion);
    }

    /**
     * Valida si el contrato está activo en una fecha específica.
     * @param fecha Fecha específica a verificar.
     * @return true si el contrato está activo en la fecha dada, false en caso contrario.
     */
    public boolean estaActivoEnFecha(LocalDate fecha) {
        return !fecha.isBefore(fechaDeComienzo) && !fecha.isAfter(fechaDeExpiracion);
    }
}
