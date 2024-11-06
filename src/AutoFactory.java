public class AutoFactory {

    public Auto crearAuto(String tipo) {
        switch (tipo) {
            case "F1":
                return new Auto("Fórmula 1", "F1-1234", "En uso", "Equipo F1");
            case "FE":
                return new Auto("Fórmula E", "FE-5678", "En uso", "Equipo Fórmula E");
            default:
                System.out.println("Tipo de auto no reconocido.");
                return null;
        }
    }
}
