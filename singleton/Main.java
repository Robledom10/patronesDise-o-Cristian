package singleton;


public class Main {
    public static void main(String[] args) {

        Configuracion cfg1 = Configuracion.getInstancia();
        Configuracion cfg2 = Configuracion.getInstancia();

        cfg1.setModo("PRODUCCION");

        // Ambos imprimen PRODUCCION
        System.out.println(cfg1.getModo());
        System.out.println(cfg2.getModo());
    }
}