public class ObjVehiculo {
    private String marca;
    private String tipo;
    private int cilindraje;
    private double pagoAnterio;
    private double pagoActual;
    private int numeroCelda;

    public ObjVehiculo(String marca, String tipo, int cilindraje, double pagoAnterio, double pagoActual,
            int numeroCelda) {
        this.marca = marca;
        this.tipo = tipo;
        this.cilindraje = cilindraje;
        this.pagoAnterio = pagoAnterio;
        this.pagoActual = pagoActual;
        this.numeroCelda = numeroCelda;
    }

    public ObjVehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getPagoAnterio() {
        return pagoAnterio;
    }

    public void setPagoAnterio(double pagoAnterio) {
        this.pagoAnterio = pagoAnterio;
    }

    public double getPagoActual() {
        return pagoActual;
    }

    public void setPagoActual(double pagoActual) {
        this.pagoActual = pagoActual;
    }

    public int getNumeroCelda() {
        return numeroCelda;
    }

    public void setNumeroCelda(int numeroCelda) {
        this.numeroCelda = numeroCelda;
    }

}
