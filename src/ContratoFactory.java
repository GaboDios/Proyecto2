import java.util.Date;

public class ContratoFactory {

    public ContratoPatrocinio crearContratoPatrocinio(double monto, Date fechaInicio, Date fechaVencimiento) {
        return new ContratoPatrocinio(monto, fechaInicio, fechaVencimiento);
    }

    public Contrato crearContratoEmpleado(double salario, Date fechaInicio, Date fechaVencimiento) {
        return new Contrato(fechaInicio, fechaVencimiento);
    }
}
