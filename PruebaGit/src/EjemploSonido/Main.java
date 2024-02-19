package EjemploSonido;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] vector = {1,3,2,7,5};

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                int aux = vector[i];
                vector[i+1] = vector[i];
                vector[i] = aux;
            }
        }

//
//
//        Sonido son;
//        son = new Gato();
//        son.voz();
//
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