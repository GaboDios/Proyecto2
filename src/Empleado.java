public class Empleado {
    private String nombre;
    private String rol;
    private String equipoAsignado;
    private String ubicacionActual;
    private Contrato contrato;

    public Empleado(String nombre, String rol, String equipoAsignado, String ubicacionActual, Contrato contrato) {
        this.nombre = nombre;
        this.rol = rol;
        this.equipoAsignado = equipoAsignado;
        this.ubicacionActual = ubicacionActual;
        this.contrato = contrato;
    }

    public void actualizarUbicacion(String nuevaUbicacion) {
        this.ubicacionActual = nuevaUbicacion;
        System.out.println(nombre + " se ha trasladado a: " + nuevaUbicacion);
    }

    public void asignarEquipo(String nuevoEquipo) {
        this.equipoAsignado = nuevoEquipo;
        System.out.println(nombre + " ha sido asignado al equipo " + nuevoEquipo);
    }

    public void renovarContrato() {
        contrato.renovarContrato();
    }

    public String getNombre() {
        return nombre;
    }
}
