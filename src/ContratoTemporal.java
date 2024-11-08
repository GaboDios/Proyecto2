public class ContratoTemporal implements Contratos {

    @Override
    public void crearFirma(int index) {
        System.out.println("Creando firma " + index + " para Contrato Temporal.");
    }

    @Override
    public void crearAutorizacion(int index) {
        System.out.println("Creando autorización " + index + " para Contrato Temporal.");
    }

    @Override
    public void crearIdentificacionFiscal(int index) {
        System.out.println("Creando identificación fiscal " + index + " para Contrato Temporal.");
    }

    @Override
    public void crearDuracionDeContrato(int index) {
        System.out.println("Creando duración de contrato " + index + " para Contrato Temporal.");
    }

    @Override
    public void crearFechaDeComienzo(int index) {
        System.out.println("Creando fecha de comienzo " + index + " para Contrato Temporal.");
    }

    @Override
    public void crearFechaDeExpiracion(int index) {
        System.out.println("Creando fecha de expiración " + index + " para Contrato Temporal.");
    }

    @Override
    public void crearLugarDeTrabajo(int index) {
        System.out.println("Creando lugar de trabajo " + index + " para Contrato Temporal.");
    }

    @Override
    public void crearRemuneracion(int index) {
        System.out.println("Creando remuneración " + index + " para Contrato Temporal.");
    }

    @Override
    public void crearFechaDePago(int index) {
        System.out.println("Creando fecha de pago " + index + " para Contrato Temporal.");
    }
}
