package Enumeradores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Entradas entrada;
//
//        System.out.println("Tengo palco, mi entrada vale " + Entradas.PALCO.precio);

        Colores color;
        int indiceColor = -1;
        System.out.println("Introduce un color");
        Colores.mostrarColores();
        String colorRecibido = new Scanner(System.in).nextLine();
        String colorConvertido = Colores.convertirColor(colorRecibido);
        for (var colorEncontrado: Colores.values()) {
            if(colorEncontrado.nombre.equals(colorConvertido)){
                System.out.println("Color encontrado");
                indiceColor = colorEncontrado.ordinal();
            }
        }
        if(indiceColor != -1){
            color = Colores.getColor(indiceColor);
            System.out.println(color.getColor());
        }
        else System.out.println("Color no encontrado.");
    }
}
