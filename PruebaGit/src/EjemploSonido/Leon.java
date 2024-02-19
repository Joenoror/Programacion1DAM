package EjemploSonido;

public class Leon implements Sonido, Comparable{
    public void voz() {
        System.out.println("Grrr");
    }

    @Override
    public void vozDurmiendo() {
        System.out.println("Grr...");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
