import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class McLaren {
    private static McLaren instance; // Singleton Instance
    private String nombre;
    private List<Equipo> equipos; // Lista de equipos
    private List<Usuario> usuarios; // Lista de usuarios
    private List<Patrocinador> patrocinadores;
    private double saldo; // Saldo inicial de McLaren

    // Constructor privado para Singleton
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

    // Método estático para obtener la instancia única
    public static McLaren getInstance(String nombre) {
        if (instance == null) {
            instance = new McLaren(nombre);
        }
        return instance;
    }

    // Método para inicializar los equipos
    private void inicializarEquipos() {
        RolesFactory rolesFactory = new RolesFactory();

        // Crear equipos con sus respectivos roles
        agregarEquipo(crearEquipo("Formula1", rolesFactory));
        agregarEquipo(crearEquipo("FormulaE", rolesFactory));
        agregarEquipo(crearEquipo("IndyCar", rolesFactory));
        agregarEquipo(crearEquipo("ExtremeE", rolesFactory));
        agregarEquipo(crearEquipo("GT", rolesFactory));
    }

    // Método para inicializar patrocinadores
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
            System.out.println("Patrocinador inicializado: " + nombrePatrocinador);
        }
    }

    // Método para crear un equipo con roles iniciales
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

    // Método para agregar equipos
    public void agregarEquipo(Equipo equipo) {
        if (!equipos.contains(equipo)) {
            equipos.add(equipo);
            System.out.println("Equipo " + equipo.getNombre() + " agregado a McLaren.");
        } else {
            System.out.println("El equipo " + equipo.getNombre() + " ya está registrado.");
        }
    }

    // Método para agregar usuarios
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario " + usuario.getNombre() + " agregado.");
    }

    // Método para verificar login de un usuario
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

    // Método para calcular el costo total de nómina
    public double calcularCostoTotalNomina() {
        double costoTotal = 0;
        for (Equipo equipo : equipos) {
            costoTotal += equipo.calcularCostoNomina();
        }
        System.out.println("Costo total de nómina para todos los equipos: $" + costoTotal);
        return costoTotal;
    }

    // Método para agregar patrocinadores
    public void agregarPatrocinador(String nombre, LocalDate fechaInicio, LocalDate fechaFin) {
        patrocinadores.add(new Patrocinador(nombre, fechaInicio, fechaFin));
        System.out.println("Patrocinador " + nombre + " agregado con contrato desde " + fechaInicio + " hasta " + fechaFin + ".");
    }

    // Método para registrar un pago
    public void registrarPago(double monto, String patrocinador, LocalDate fecha) {
        saldo += monto;
        System.out.println("Pago registrado de patrocinador " + patrocinador + " por $" + monto + " en la fecha " + fecha + ".");
    }

    // Método para registrar un gasto
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

    public List<Patrocinador> getPatrocinadores() {
        return patrocinadores;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public double getSaldo() {
        return saldo;
    }
}
