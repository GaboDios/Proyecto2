import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class SIG_GUI {
    private JFrame frame;
    private McLaren mclaren;
    private Usuario usuarioAutenticado;

    public SIG_GUI() {
        mclaren = McLaren.getInstance("McLaren Racing");
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Sistema de Gestión Integral - McLaren Racing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Usuario:");
        JTextField usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Contraseña:");
        JPasswordField passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");

        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(new JLabel());
        loginPanel.add(loginButton);

        frame.add(loginPanel, BorderLayout.CENTER);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (mclaren.verificarLogin(username, password)) {
                    usuarioAutenticado = mclaren.getUsuarios().stream()
                            .filter(u -> u.getNombre().equals(username))
                            .findFirst()
                            .orElse(null);

                    if (usuarioAutenticado != null) {
                        showMenu();
                    } else {
                        JOptionPane.showMessageDialog(frame, "Usuario no encontrado después del login exitoso.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Credenciales incorrectas.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }

    private void showMenu() {
        frame.getContentPane().removeAll();
        frame.setLayout(new GridLayout(0, 1));

        JLabel welcomeLabel = new JLabel("Bienvenido, " + usuarioAutenticado.getNombre() + " (" + usuarioAutenticado.getTipo() + ")", SwingConstants.CENTER);
        frame.add(welcomeLabel);

        switch (usuarioAutenticado.getTipo().toLowerCase()) {
            case "ejecutivo":
                addMenuButton("Ver reporte financiero", e -> showReporteFinanciero());
                addMenuButton("Ver detalle de equipos", e -> showEquipos());
                addMenuButton("Ver detalle de patrocinios", e -> showPatrocinios());
                break;

            case "finanzas":
                addMenuButton("Ver reporte financiero", e -> showReporteFinanciero());
                addMenuButton("Registrar gasto", e -> registrarGasto());
                addMenuButton("Registrar pago", e -> registrarPago());
                break;

            case "logística":
                addMenuButton("Ver equipos", e -> showEquipos());
                addMenuButton("Modificar personal del equipo", e -> modificarPersonalEquipo());
                break;

            case "producción":
                addMenuButton("Ver equipos", e -> showEquipos());
                addMenuButton("Registrar inversión en producción", e -> registrarInversion());
                break;
        }

        addMenuButton("Salir", e -> System.exit(0));
        frame.revalidate();
        frame.repaint();
    }

    private void addMenuButton(String text, ActionListener actionListener) {
        JButton button = new JButton(text);
        button.addActionListener(actionListener);
        frame.add(button);
    }

    private void showReporteFinanciero() {
        JOptionPane.showMessageDialog(frame, "Saldo actual: $" + mclaren.getSaldo(), "Reporte Financiero", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showEquipos() {
        StringBuilder equiposInfo = new StringBuilder("Equipos:\n");
        mclaren.getEquipos().forEach(e -> equiposInfo.append("- ").append(e.getNombre()).append("\n"));
        JOptionPane.showMessageDialog(frame, equiposInfo.toString(), "Equipos", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showPatrocinios() {
        StringBuilder patrociniosInfo = new StringBuilder("Patrocinios:\n");
        mclaren.getPatrocinadores().forEach(p -> {
            patrociniosInfo.append("- Nombre: ").append(p.getNombre()).append("\n");
            patrociniosInfo.append("  Fecha Inicio: ").append(p.getContrato().getFechaComienzo()).append("\n");
            patrociniosInfo.append("  Fecha Fin: ").append(p.getContrato().getFechaExpiracion()).append("\n");
            patrociniosInfo.append("  Monto: $").append(p.getContrato().getRemuneracion()).append("\n\n");
        });
        JOptionPane.showMessageDialog(frame, patrociniosInfo.toString(), "Patrocinios", JOptionPane.INFORMATION_MESSAGE);
    }

    private void registrarGasto() {
        String equipo = JOptionPane.showInputDialog(frame, "Ingrese el nombre del equipo:", "Registrar Gasto", JOptionPane.QUESTION_MESSAGE);
        String fecha = JOptionPane.showInputDialog(frame, "Ingrese la fecha (YYYY-MM-DD):", "Registrar Gasto", JOptionPane.QUESTION_MESSAGE);

        try {
            LocalDate fechaLocalDate = LocalDate.parse(fecha);
            mclaren.registrarGasto(equipo, fechaLocalDate);
            JOptionPane.showMessageDialog(frame, "Gasto registrado exitosamente.", "Registrar Gasto", JOptionPane.INFORMATION_MESSAGE);
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(frame, "Fecha inválida. Por favor use el formato YYYY-MM-DD.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void registrarPago() {
        String patrocinador = JOptionPane.showInputDialog(frame, "Ingrese el nombre del patrocinador:", "Registrar Pago", JOptionPane.QUESTION_MESSAGE);
        String fecha = JOptionPane.showInputDialog(frame, "Ingrese la fecha (YYYY-MM-DD):", "Registrar Pago", JOptionPane.QUESTION_MESSAGE);
        String monto = JOptionPane.showInputDialog(frame, "Ingrese el monto del pago:", "Registrar Pago", JOptionPane.QUESTION_MESSAGE);

        try {
            LocalDate fechaLocalDate = LocalDate.parse(fecha);
            double montoDouble = Double.parseDouble(monto);
            mclaren.registrarPago(montoDouble, patrocinador, fechaLocalDate);
            JOptionPane.showMessageDialog(frame, "Pago registrado exitosamente.", "Registrar Pago", JOptionPane.INFORMATION_MESSAGE);
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(frame, "Fecha inválida. Por favor use el formato YYYY-MM-DD.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Monto inválido. Por favor ingrese un número.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void modificarPersonalEquipo() {
        JOptionPane.showMessageDialog(frame, "Funcionalidad no implementada aún.", "Modificar Personal", JOptionPane.INFORMATION_MESSAGE);
    }

    private void registrarInversion() {
        JOptionPane.showMessageDialog(frame, "Funcionalidad no implementada aún.", "Registrar Inversión", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SIG_GUI::new);
    }
}
