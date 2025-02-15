public class ContenedorTransacciones {
    private Transaccion[] transacciones;
    private int tope;

    public ContenedorTransacciones() {
        transacciones = new Transaccion[1000];
        tope = 0;
    }
    public void agregarTransaccion(Transaccion t) throws Exception {
        if (transacciones.length <= tope) throw new Exception("No se pueden agregar mas transacciones");
        if (tope < transacciones.length) transacciones[tope++] = t;
    }
}