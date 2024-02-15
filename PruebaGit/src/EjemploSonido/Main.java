package EjemploSonido;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Sonido son = new Sonido() {
            @Override
            public void voz() {
                System.out.println("¡Jajejijojuuuu!");
            }
        };
        son.voz();



//        Sonido son;
//        son = new Gato();
//        son.voz();
//        son = new Perro();
//        son.voz();



//        Gato g = new Gato();
//        Perro p = new Perro();
//        Leon le = new Leon();
//
//        g.voz();
//        p.voz();
//        le.voz();
//        g.vozDurmiendo();
//        p.vozDurmiendo();
//        le.vozDurmiendo();
    }
}