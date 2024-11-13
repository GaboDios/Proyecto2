import java.time.LocalDate;

public class Patrocinador {
    private String nombre;
    private ContratoPatrocinio contrato;

    public Patrocinador(String nombre, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.contrato = new ContratoPatrocinio();
    }

    public void inicializarContrato(int index) {
        contrato.crearFirma(index);
        contrato.crearAutorizacion(index);
        contrato.crearIdentificacionFiscal(index);
        contrato.crearDuracionDeContrato(12); // Duración fija de ejemplo
        contrato.crearFechaDeComienzo(index);
        contrato.crearFechaDeExpiracion(12); // Duración fija de 12 meses
        contrato.crearLugarDeTrabajo(index);
        contrato.crearRemuneracion(index);
        contrato.crearFechaDePago(index);
    }

    public String getNombre() {
        return nombre;
    }

    public ContratoPatrocinio getContrato() {
        return contrato;
    }
}
