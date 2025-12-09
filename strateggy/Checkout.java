package strateggy;

public class Checkout {
    private MetodoPago metodoPago;

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void procesarPago(double monto) {
        metodoPago.pagar(monto);
    }
}
