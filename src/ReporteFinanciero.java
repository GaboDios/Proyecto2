public class ReporteFinanciero {

    public void generarReporteIngresos(RegistroFinanciero registro) {
        double ingresosTotales = registro.calcularIngresosTotales();
        System.out.println("Reporte de Ingresos Totales: $" + ingresosTotales);
    }

    public void generarReporteGastos(RegistroFinanciero registro) {
        double gastosTotales = registro.calcularGastosTotales();
        System.out.println("Reporte de Gastos Totales: $" + gastosTotales);
    }

    public void generarReporteBalance(RegistroFinanciero registro) {
        double balance = registro.calcularBalance();
        System.out.println("Reporte de Balance: $" + balance);
    }
}
