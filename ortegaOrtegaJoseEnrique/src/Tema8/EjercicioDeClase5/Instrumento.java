package Tema8.EjercicioDeClase5;

import java.util.Arrays;

enum NotasMusicales {
    DO,
    RE,
    MI,
    FA,
    SOL,
    LA,
    SI;
}

abstract public class Instrumento {

    NotasMusicales[] notas = new NotasMusicales[0];

    Instrumento(NotasMusicales[] notasMusicales){
        this.notas = notasMusicales;
    }

    Instrumento(){
        
    }

    void add(NotasMusicales notaNueva){
        notas = Arrays.copyOf(notas, notas.length+1);
        notas[notas.length-1] = notaNueva;
    }

    void mostrarNotas(){
        System.out.print("[");
        for (int i = 0; i < notas.length; i++) {
            if(i != notas.length-1) System.out.print(notas[i] + ",");
            else System.out.print(notas[i]);
        }
        System.out.println("]");
    }

    abstract void interpretar();

}
