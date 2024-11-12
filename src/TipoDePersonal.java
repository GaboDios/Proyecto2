public interface TipoDePersonal {
    void crearNombre(int index);
    void crearIdentificador(int index);
    void crearUsuario(int index);
    void crearSueldo(int index);
    void crearGPU(int index);
    void crearMotherboard(int index);

    // Métodos para el patrón Composite
    default void agregar(TipoDePersonal personal) {
        throw new UnsupportedOperationException("Operación no soportada.");
    }

    default void remover(TipoDePersonal personal) {
        throw new UnsupportedOperationException("Operación no soportada.");
    }

    default TipoDePersonal obtenerMiembro(int index) {
        throw new UnsupportedOperationException("Operación no soportada.");
    }
}
