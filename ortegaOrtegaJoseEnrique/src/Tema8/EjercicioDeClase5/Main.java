package Tema8.EjercicioDeClase5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Instrumento instrumento = new Piano();
        instrumento.add(NotasMusicales.RE);
        instrumento.add(NotasMusicales.DO);
        instrumento.add(NotasMusicales.MI);
        instrumento.mostrarNotas();

        //Piano
        System.out.println("Así interpreta un piano");
        instrumento.interpretar();

        //Flauta
        instrumento = new Flauta(instrumento.notas);
        System.out.println("Así interpreta una flauta");
        instrumento.interpretar();


    }
}
