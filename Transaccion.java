public class Transaccion {
    private Fecha fecha;
    private String concepto;
    private double monto;
    private int numCuentaOrigen, numCuentaDestino;

    /**
     * Constructor por parametros.
     * @param fecha - La fecha en la que se realiza
     * @param concepto - El concepto de la transferencia
     * @param monto - Cuanto dinero se transfiere
     * @param numCuentaOrigen - Numero de cuenta del que sale la transaccion 
     * @param numCuentaDestino - Numero de la cuenta que recibe la transaccion
     */
    public Transaccion(Fecha fecha, String concepto, double monto, int numCuentaOrigen, int numCuentaDestino) {
        this.fecha = fecha;
        this.concepto = concepto;
        this.monto = monto;
        this.numCuentaOrigen = numCuentaOrigen;
        this.numCuentaDestino = numCuentaDestino;
    }
    
    public Fecha obtenerFecha() { return fecha; }
    public String obtenerConcepto() { return concepto; }
    public double obtenerMonto() { return monto; }
    public int obtenerOrigen() { return numCuentaOrigen; }
    public int obtenerDestino() { return numCuentaDestino; }
} 
