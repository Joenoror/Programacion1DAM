package Tema7.EjercicioDeClase7;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h,m,s;
        Hora horaActual;

        System.out.println("Introduce una hora");
        h = sc.nextInt();
        System.out.println("Introduce los minutos");
        m = sc.nextInt();
        System.out.println("Introduce los segundos");
        s = sc.nextInt();

        horaActual = new Hora(h,m,s);
        horaActual.mostrarHora();

        System.out.println("Introduce una cantidad de segundos a sumar");
        int n = sc.nextInt();

        horaActual.setSegundos(n);
        horaActual.mostrarHora();


    }
}
