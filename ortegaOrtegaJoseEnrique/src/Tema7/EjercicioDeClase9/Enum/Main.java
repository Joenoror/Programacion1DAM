package Tema7.EjercicioDeClase9.Enum;

import java.util.Scanner;

enum Lista {
    A("Alemania"),
    B("Bosnia"),
    C("Costa Rica"),
    D("Dinamarca"),
    E("Estonia");

    private String valor;
    Lista(String valor) {
        this.valor = valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void mostrarValores(){
        Lista[] listaDeValores = Lista.values();
        for (int i = 0; i < Lista.values().length; i++) {
            System.out.println(listaDeValores[i]);
        }
    }

    public void eleccionValor(String valorElegido){
        Lista[] listaDeValores = Lista.values();
        for (int i = 0; i < Lista.values().length; i++) {
            if(listaDeValores[i].toString().equals(valorElegido)){
                System.out.println(listaDeValores[i].getValor());
            }
        }
    }

}


public class Main {
    public static void main(String[] args) {
        Lista lista = Lista.A;
        System.out.println("De la siguiente selección de letras, elige una");
        lista.mostrarValores();
        String eleccion = new Scanner(System.in).next();
        lista.eleccionValor(eleccion);
    }
}
