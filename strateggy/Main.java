package strateggy;

public class Main {
    public static void main(String[] args) {

        Checkout checkout = new Checkout();

        checkout.setMetodoPago(new PagoTarjeta());
        checkout.procesarPago(50.0);

        checkout.setMetodoPago(new PagoNequi());
        checkout.procesarPago(75.0);
    }
}