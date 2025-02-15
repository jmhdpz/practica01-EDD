public class Tarjeta {
    private String numTarjeta, cvv, nip;
    private Fecha fechaExpiracion;
    public Tarjeta(String numTarjeta, Fecha fechaExpiracion, String cvv, String nip) {
        this.numTarjeta = numTarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.cvv = cvv;
        this.nip = nip;
    }
    public void retirar(double monto) {}
    public void depositar(double monto) {}
    public void realizarTransaccion(Transaccion t) {}
}
