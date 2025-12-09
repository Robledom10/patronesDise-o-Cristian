package strateggy;

public class PagoNequi implements MetodoPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando " + monto + " con Nequi.");
    }
}
