public class Fecha {
    private int dia, mes, anio;

    /**
     * Constructor por parametros.
     * @param dia 
     * @param mes
     * @param anio
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public int obtenerDia() { return dia; }
    public int obtenerMes() { return mes; }
    public int obtenerAnio() { return anio; }
}