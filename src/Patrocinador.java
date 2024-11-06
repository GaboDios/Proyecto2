public class Patrocinador {
    private String nombre;
    private String sector;
    private ContratoPatrocinio contratoPatrocinio;

    public Patrocinador(String nombre, String sector, ContratoPatrocinio contratoPatrocinio) {
        this.nombre = nombre;
        this.sector = sector;
        this.contratoPatrocinio = contratoPatrocinio;
    }

    public void actualizarContrato(ContratoPatrocinio nuevoContrato) {
        this.contratoPatrocinio = nuevoContrato;
        System.out.println("Contrato actualizado para el patrocinador " + nombre);
    }

    public void obtenerDetalles() {
        System.out.println("Patrocinador: " + nombre);
        System.out.println("Sector: " + sector);
        contratoPatrocinio.mostrarDetalles();
    }

    // Getters opcionales para nombre, sector y contratoPatrocinio si son necesarios en otras partes del sistema
    public String getNombre() {
        return nombre;
    }

    public String getSector() {
        return sector;
    }

    public ContratoPatrocinio getContratoPatrocinio() {
        return contratoPatrocinio;
    }
}
