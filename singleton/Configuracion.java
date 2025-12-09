package singleton;

public class Configuracion {

    private static Configuracion instancia;
    private String modo;

    // Constructor privado
    private Configuracion() {
        this.modo = "MODO_DESARROLLO";
    }

    // Punto de acceso global
    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }
}