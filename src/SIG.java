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
                case "producción":
                    System.out.println("1. Ver equipos");
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
                        System.out.println("Mostrando reporte financiero...");
                        mclaren.calcularCostoTotalNomina();
                        break;
                    case 2:
                        System.out.println("Mostrando detalle de equipos:");
                        mclaren.getEquipos().forEach(e -> System.out.println("- " + e.getNombre()));
                        break;
                    case 3:
                        System.out.println("Mostrando detalle de patrocinios...");
                        // Implementar lógica de detalle de patrocinios
                        break;
                    case 0:
                        System.out.println("Saliendo del menú Ejecutivo...");
                        return false;
                }
                break;

            case "finanzas":
                switch (opcion) {
                    case 1:
                        System.out.println("Mostrando reporte financiero...");
                        mclaren.calcularCostoTotalNomina();
                        break;
                    case 2:
                        System.out.println("Registrando gasto...");
                        // Implementar lógica para registrar gasto
                        break;
                    case 3:
                        System.out.println("Registrando pago...");
                        // Implementar lógica para registrar pago
                        break;
                    case 0:
                        System.out.println("Saliendo del menú Finanzas...");
                        return false;
                }
                break;

            case "logística":
            case "producción":
                if (opcion == 1) {
                    System.out.println("Mostrando equipos:");
                    mclaren.getEquipos().forEach(e -> System.out.println("- " + e.getNombre()));
                } else if (opcion == 0) {
                    System.out.println("Saliendo del menú " + usuario.getTipo() + "...");
                    return false;
                } else {
                    System.out.println("Opción no válida.");
                }
                break;

            default:
                System.out.println("Tipo de usuario no reconocido. Cerrando sistema.");
                return false;
        }

        return true;
    }
}
