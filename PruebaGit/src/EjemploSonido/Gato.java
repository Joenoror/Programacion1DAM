package EjemploSonido;

public class Gato implements Sonido{
    public String nombre;
    @Override
    public void voz() {
        System.out.println("Miau");
    }
}
