import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class SIG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializar la instancia Singleton de McLaren
        McLaren mclaren = McLaren.getInstance("McLaren Racing");

        System.out.println("Bienvenido al Sistema de Gestión Integral (SIG) de McLaren Racing");

        // Login
        System.out.print("Por favor, ingrese su nombre de usuario: ");
        String username = scanner.nextLine();
        System.out.print("Por favor, ingrese su contraseña: ");
        String password = scanner.nextLine();

        if (mclaren.verificarLogin(username, password)) {
            // Obtener el tipo de usuario autenticado
            Usuario usuarioAutenticado = mclaren.getUsuarios().stream()
                    .filter(u -> u.getNombre().equals(username))
                    .findFirst()
                    .orElse(null);

            if (usuarioAutenticado != null) {
                mostrarMenu(usuarioAutenticado, scanner);
            } else {
                System.out.println("Error: Usuario no encontrado después del login exitoso.");
            }
        } else {
            System.out.println("Credenciales incorrectas. El sistema se cerrará.");
        }

        scanner.close();
    }

    // Método para mostrar el menú según el tipo de usuario
    private static void mostrarMenu(Usuario usuario, Scanner scanner) {
        System.out.println("Bienvenido, " + usuario.getNombre() + ". Tipo de usuario: " + usuario.getTipo());

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nSeleccione una opción:");

            switch (usuario.getTipo().toLowerCase()) {
                case "ejecutivo":
                    System.out.println("1. Ver reporte financiero");
                    System.out.println("2. Ver detalle de equipos");
                    System.out.println("3. Ver detalle de patrocinios");
                    System.out.println("0. Salir");
                    break;

                case "finanzas":
                    System.out.println("1. Ver reporte financiero");
                    System.out.println("2. Registrar gasto");
                    System.out.println("3. Registrar pago");
                    System.out.println("0. Salir");
                    break;

                case "logística":
                    System.out.println("1. Ver equipos");
                    System.out.println("2. Modificar personal del equipo");
                    System.out.println("0. Salir");
                    break;

                case "producción":
                    System.out.println("1. Ver equipos");
                    System.out.println("2. Registrar inversión en producción");
                    System.out.println("0. Salir");
                    break;

                default:
                    System.out.println("Tipo de usuario no reconocido. El sistema se cerrará.");
                    continuar = false;
                    break;
            }

            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            continuar = ejecutarOpcion(usuario, opcion, scanner);
        }
    }

    // Método para ejecutar acciones según la opción seleccionada
    private static boolean ejecutarOpcion(Usuario usuario, int opcion, Scanner scanner) {
        McLaren mclaren = McLaren.getInstance("McLaren Racing");

        switch (usuario.getTipo().toLowerCase()) {
            case "ejecutivo":
                switch (opcion) {
                    case 1:
                        System.out.println("Saldo actual de McLaren: $" + mclaren.getSaldo());
                        break;
                    case 2:
                        System.out.println("Equipos:");
                        mclaren.getEquipos().forEach(e -> System.out.println("- " + e.getNombre()));
                        break;
                    case 3:
                        System.out.println("Patrocinios:");
                        mclaren.getPatrocinadores().forEach(p -> {
                            System.out.println("- Nombre: " + p.getNombre());
                            System.out.println("  Fecha Inicio: " + p.getContrato().getFechaComienzo());
                            System.out.println("  Fecha Fin: " + p.getContrato().getFechaExpiracion());
                            System.out.println("  Monto: $" + p.getContrato().getRemuneracion());
                        });
                        break;
                    case 0:
                        System.out.println("Saliendo del menú Ejecutivo...");
                        return false;
                }
                break;

            case "finanzas":
                switch (opcion) {
                    case 1:
                        System.out.println("Saldo actual de McLaren: $" + mclaren.getSaldo());
                        break;
                    case 2:
                        System.out.println("Seleccione un equipo:");
                        listarEquipos(mclaren, scanner, "gasto");
                        break;
                    case 3:
                        System.out.println("Seleccione un patrocinador:");
                        listarPatrocinadores(mclaren, scanner);
                        break;
                    case 0:
                        System.out.println("Saliendo del menú Finanzas...");
                        return false;
                }
                break;

            case "logística":
                if (opcion == 1) {
                    listarEquipos(mclaren, scanner, "modificar personal");
                } else if (opcion == 0) {
                    System.out.println("Saliendo del menú Logística...");
                    return false;
                }
                break;

            case "producción":
                if (opcion == 1) {
                    listarEquipos(mclaren, scanner, "registrar inversión");
                } else if (opcion == 0) {
                    System.out.println("Saliendo del menú Producción...");
                    return false;
                }
                break;

            default:
                System.out.println("Tipo de usuario no reconocido. Cerrando sistema.");
                return false;
        }

        return true;
    }

    // Método para listar equipos y realizar acciones
    private static void listarEquipos(McLaren mclaren, Scanner scanner, String accion) {
        System.out.println("Seleccione un equipo:");
        int index = 1;
        for (Equipo equipo : mclaren.getEquipos()) {
            System.out.println(index + ". " + equipo.getNombre());
            index++;
        }
        System.out.print("Ingrese la opción del equipo: ");
        int opcionEquipo = scanner.nextInt();
        scanner.nextLine();

        if (opcionEquipo > 0 && opcionEquipo <= mclaren.getEquipos().size()) {
            Equipo equipoSeleccionado = mclaren.getEquipos().get(opcionEquipo - 1);
            switch (accion) {
                case "gasto":
                    System.out.print("Ingrese la fecha (YYYY-MM-DD) del gasto: ");
                    String fechaGasto = scanner.nextLine();
                    mclaren.registrarGasto(equipoSeleccionado.getNombre(), LocalDate.parse(fechaGasto));
                    break;
                case "modificar personal":
                    // Lógica para agregar o quitar personal del equipo
                    break;
                case "registrar inversión":
                    System.out.print("Ingrese la fecha (YYYY-MM-DD) de la inversión: ");
                    String fechaInversion = scanner.nextLine();
                    try {
                        LocalDate fechaInversionLocalDate = LocalDate.parse(fechaInversion);
                        System.out.println("Fecha ingresada: " + fechaInversionLocalDate);
                        mclaren.registrarGasto(equipoSeleccionado.getNombre(), fechaInversionLocalDate);
                    } catch (DateTimeParseException e) {
                        System.out.println("Error: La fecha ingresada no tiene el formato correcto (YYYY-MM-DD).");
                    }
                    break;
            }
        } else {
            System.out.println("Opción de equipo no válida.");
        }
    }

    // Método para listar patrocinadores
    private static void listarPatrocinadores(McLaren mclaren, Scanner scanner) {
        System.out.println("Seleccione un patrocinador:");
        int index = 1;
        for (Patrocinador patrocinador : mclaren.getPatrocinadores()) {
            System.out.println(index + ". " + patrocinador.getNombre());
            index++;
        }
        System.out.print("Ingrese la opción del patrocinador: ");
        int opcionPatrocinador = scanner.nextInt();
        scanner.nextLine();

        if (opcionPatrocinador > 0 && opcionPatrocinador <= mclaren.getPatrocinadores().size()) {
            Patrocinador patrocinadorSeleccionado = mclaren.getPatrocinadores().get(opcionPatrocinador - 1);
            System.out.print("Ingrese la fecha (YYYY-MM-DD) del pago: ");
            String fechaPago = scanner.nextLine();
            try {
                LocalDate fechaPagoLocalDate = LocalDate.parse(fechaPago);
                System.out.println("Fecha ingresada: " + fechaPagoLocalDate);
                System.out.print("Ingrese el monto del pago: ");
                double montoPago = scanner.nextDouble();
                scanner.nextLine();
                mclaren.registrarPago(montoPago, patrocinadorSeleccionado.getNombre(),fechaPagoLocalDate);
            } catch (DateTimeParseException e) {
                System.out.println("Error: La fecha ingresada no tiene el formato correcto (YYYY-MM-DD).");
            }
        } else {
            System.out.println("Opción de patrocinador no válida.");
        }
    }
}
