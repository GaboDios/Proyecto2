/**
 * Interfaz que define las operaciones básicas para la gestión de personal.
 * Proporciona métodos para crear atributos básicos del personal y soporte opcional
 * para el patrón Composite mediante operaciones jerárquicas.
 */
public interface TipoDePersonal {

    /**
     * Crea un nombre específico para el personal.
     *
     * @param index Índice que puede utilizarse para diferenciar o identificar al personal.
     */
    void crearNombre(int index);

    /**
     * Crea un identificador único para el personal.
     *
     * @param index Índice que puede utilizarse para generar el identificador.
     */
    void crearIdentificador(int index);

    /**
     * Crea un usuario asociado al personal.
     *
     * @param index Índice que puede utilizarse para identificar al usuario.
     */
    void crearUsuario(int index);

    /**
     * Asigna un sueldo al personal.
     *
     * @param index Índice que puede utilizarse para determinar la asignación de sueldo.
     */
    void crearSueldo(int index);

    // Métodos para el patrón Composite

    /**
     * Agrega un miembro de personal al grupo o jerarquía.
     * Este método es compatible con el patrón Composite.
     *
     * @param personal Miembro de personal a agregar.
     * @throws UnsupportedOperationException Si la implementación no soporta esta operación.
     */
    default void agregar(TipoDePersonal personal) {
        throw new UnsupportedOperationException("Operación no soportada.");
    }

    /**
     * Remueve un miembro de personal del grupo o jerarquía.
     * Este método es compatible con el patrón Composite.
     *
     * @param personal Miembro de personal a remover.
     * @throws UnsupportedOperationException Si la implementación no soporta esta operación.
     */
    default void remover(TipoDePersonal personal) {
        throw new UnsupportedOperationException("Operación no soportada.");
    }

    /**
     * Obtiene un miembro específico del grupo o jerarquía de personal.
     * Este método es compatible con el patrón Composite.
     *
     * @param index Índice del miembro a obtener.
     * @return El miembro de personal correspondiente al índice.
     * @throws UnsupportedOperationException Si la implementación no soporta esta operación.
     */
    default TipoDePersonal obtenerMiembro(int index) {
        throw new UnsupportedOperationException("Operación no soportada.");
    }
}
