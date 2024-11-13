import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Clase Singleton que representa la gestión integral de McLaren.
 * Incluye la gestión de equipos, usuarios, patrocinadores y finanzas.
 */
public class McLaren {
    private static McLaren instance; // Singleton Instance
    private String nombre;
    private List<Equipo> equipos; // Lista de equipos
    private List<Usuario> usuarios; // Lista de usuarios
    private List<Patrocinador> patrocinadores;
    private double saldo; // Saldo inicial de McLaren

    /**
     * Constructor privado para Singleton.
     *
     * @param nombre Nombre de la organización McLaren.
     */
    private McLaren(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.patrocinadores = new ArrayList<>();
        this.saldo = 1_000_000_000; // Saldo inicial de 1,000 millones

        // Agregar los usuarios iniciales
        agregarUsuario(new Usuario("Ejecutivo1", "password1", "Ejecutivo"));
        agregarUsuario(new Usuario("Ejecutivo2", "password2", "Ejecutivo"));
        agregarUsuario(new Usuario("Finanzas1", "password3", "Finanzas"));
        agregarUsuario(new Usuario("Finanzas2", "password4", "Finanzas"));
        agregarUsuario(new Usuario("Logistica1", "password5", "Logística"));
        agregarUsuario(new Usuario("Produccion1", "password6", "Producción"));

        // Inicializar los equipos
        inicializarEquipos();
        inicializarPatrocinadores();
    }

    /**
     * Método estático para obtener la instancia única.
     *
     * @param nombre Nombre de la organización McLaren.
     * @return Instancia única de McLaren.
     */
    public static McLaren getInstance(String nombre) {
        if (instance == null) {
            instance = new McLaren(nombre);
        }
        return instance;
    }

    /**
     * Método para inicializar los equipos.
     */
    private void inicializarEquipos() {
        RolesFactory rolesFactory = new RolesFactory();

        // Crear equipos con sus respectivos roles
        agregarEquipo(crearEquipo("Formula1", rolesFactory));
        agregarEquipo(crearEquipo("FormulaE", rolesFactory));
        agregarEquipo(crearEquipo("IndyCar", rolesFactory));
        agregarEquipo(crearEquipo("ExtremeE", rolesFactory));
        agregarEquipo(crearEquipo("GT", rolesFactory));
    }

    /**
     * Método para inicializar patrocinadores.
     */
    private void inicializarPatrocinadores() {
        Random random = new Random();
        for (int i = 1; i <= 15; i++) {
            String nombrePatrocinador = "Patrocinador" + i;
            LocalDate fechaInicio = LocalDate.now().minusMonths(random.nextInt(12)); // Fecha de inicio aleatoria en el último año
            int duracionContrato = 5 + random.nextInt(3); // Duración entre 5 y 7 años
            LocalDate fechaFin = fechaInicio.plusYears(duracionContrato);

            Patrocinador patrocinador = new Patrocinador(nombrePatrocinador, fechaInicio, fechaFin);
            ContratoPatrocinio contrato = patrocinador.getContrato();

            contrato.crearFirma(i);
            contrato.crearAutorizacion(i);
            contrato.crearIdentificacionFiscal(i);
            contrato.crearDuracionDeContrato(duracionContrato * 12); // Duración en meses
            contrato.crearFechaDeComienzo(0); // La fecha de comienzo ya está configurada
            contrato.crearFechaDeExpiracion(duracionContrato * 12); // Expiración calculada automáticamente
            contrato.crearLugarDeTrabajo(i);
            contrato.crearRemuneracion(10 + random.nextInt(40)); // Remuneración entre $1M y $50M
            contrato.crearFechaDePago(random.nextInt(30)); // Fecha de pago aleatoria en el primer mes

            patrocinadores.add(patrocinador);
        }
    }

    /**
     * Método para crear un equipo con roles iniciales.
     *
     * @param nombreEquipo Nombre del equipo.
     * @param rolesFactory Fábrica de roles.
     * @return Equipo inicializado.
     */
    private Equipo crearEquipo(String nombreEquipo, RolesFactory rolesFactory) {
        Equipo equipo = new Equipo(nombreEquipo);

        // Agregar roles específicos al equipo
        equipo.agregarPersonal(rolesFactory.crearRol("jefe", "Jefe " + nombreEquipo, 5000, nombreEquipo));
        equipo.agregarPersonal(rolesFactory.crearRol("ingeniero", "Ingeniero1 " + nombreEquipo, 3000, nombreEquipo));
        equipo.agregarPersonal(rolesFactory.crearRol("ingeniero", "Ingeniero2 " + nombreEquipo, 3000, nombreEquipo));
        equipo.agregarPersonal(rolesFactory.crearRol("estratega", "Estratega1 " + nombreEquipo, 4000, nombreEquipo));
        equipo.agregarPersonal(rolesFactory.crearRol("estratega", "Estratega2 " + nombreEquipo, 4000, nombreEquipo));
        equipo.agregarPersonal(rolesFactory.crearRol("piloto", "Piloto1 " + nombreEquipo, 8000, nombreEquipo));
        equipo.agregarPersonal(rolesFactory.crearRol("piloto", "Piloto2 " + nombreEquipo, 8000, nombreEquipo));

        for (int i = 0; i < 22; i++) {
            equipo.agregarPersonal(rolesFactory.crearRol("mecanico", "Mecanico" + (i + 1) + " " + nombreEquipo, 2500, nombreEquipo));
        }

        for (int i = 0; i < 10; i++) {
            equipo.agregarPersonal(rolesFactory.crearRol("crew", "Crew" + (i + 1) + " " + nombreEquipo, 2000, nombreEquipo));
        }

        return equipo;
    }

    /**
     * Método para agregar equipos.
     *
     * @param equipo Equipo a agregar.
     */
    public void agregarEquipo(Equipo equipo) {
        if (!equipos.contains(equipo)) {
            equipos.add(equipo);
        } else {
            System.out.println("El equipo " + equipo.getNombre() + " ya está registrado.");
        }
    }

    /**
     * Método para agregar usuarios.
     *
     * @param usuario Usuario a agregar.
     */
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    /**
     * Método para verificar login de un usuario.
     *
     * @param nombre   Nombre del usuario.
     * @param password Contraseña del usuario.
     * @return true si las credenciales son correctas, false en caso contrario.
     */
    public boolean verificarLogin(String nombre, String password) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre) && usuario.getPassword().equals(password)) {
                System.out.println("Login exitoso para el usuario: " + nombre);
                return true;
            }
        }
        System.out.println("Login fallido para el usuario: " + nombre);
        return false;
    }

    /**
     * Método para calcular el costo total de nómina.
     *
     * @return Costo total de nómina para todos los equipos.
     */
    public double calcularCostoTotalNomina() {
        double costoTotal = 0;
        for (Equipo equipo : equipos) {
            costoTotal += equipo.calcularCostoNomina();
        }
        System.out.println("Costo total de nómina para todos los equipos: $" + costoTotal);
        return costoTotal;
    }

    /**
     * Método para agregar patrocinadores.
     *
     * @param nombre       Nombre del patrocinador.
     * @param fechaInicio  Fecha de inicio del contrato.
     * @param fechaFin     Fecha de fin del contrato.
     */
    public void agregarPatrocinador(String nombre, LocalDate fechaInicio, LocalDate fechaFin) {
        patrocinadores.add(new Patrocinador(nombre, fechaInicio, fechaFin));
        System.out.println("Patrocinador " + nombre + " agregado con contrato desde " + fechaInicio + " hasta " + fechaFin + ".");
    }

    /**
     * Método para registrar un pago.
     *
     * @param monto        Monto del pago.
     * @param patrocinador Nombre del patrocinador.
     * @param fecha        Fecha del pago.
     */
    public void registrarPago(double monto, String patrocinador, LocalDate fecha) {
        saldo += monto;
        System.out.println("Pago registrado de patrocinador " + patrocinador + " por $" + monto + " en la fecha " + fecha + ".");
    }

    /**
     * Método para registrar un gasto.
     *
     * @param equipoNombre Nombre del equipo que genera el gasto.
     * @param fecha        Fecha del gasto.
     */
    public void registrarGasto(String equipoNombre, LocalDate fecha) {
        Equipo equipo = equipos.stream()
                .filter(e -> e.getNombre().equals(equipoNombre))
                .findFirst()
                .orElse(null);

        if (equipo != null) {
            double gasto = equipo.calcularCostoNomina();
            if (saldo >= gasto) {
                saldo -= gasto;
                System.out.println("Gasto registrado de $" + gasto + " para el equipo " + equipoNombre + " en la fecha " + fecha + ".");
            } else {
                System.out.println("Saldo insuficiente para registrar el gasto del equipo " + equipoNombre + ".");
            }
        } else {
            System.out.println("Equipo " + equipoNombre + " no encontrado.");
        }
    }

    /**
     * Obtener la lista de patrocinadores.
     *
     * @return Lista de patrocinadores.
     */
    public List<Patrocinador> getPatrocinadores() {
        return patrocinadores;
    }

    /**
     * Obtener el nombre de McLaren.
     *
     * @return Nombre de McLaren.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtener el nombre del equipo
     *
     * @return Nombre del equipo
     */
    public List<Equipo> getEquipos() {
        return equipos;
    }

    /**
     * Obtener el nombre de los usuarios
     *
     * @return Nombre de los usuarios
     */
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * Obtener el saldo
     *
     * @return El Saldo
     */
    public double getSaldo() {
        return saldo;
    }
}
