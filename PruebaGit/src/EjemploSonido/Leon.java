package EjemploSonido;

public class Leon implements Sonido{
    public void voz() {
        System.out.println("Grrr");
    }

    @Override
    public void vozDurmiendo() {
        System.out.println("Grr...");
    }
}
