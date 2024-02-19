package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Socio s1 = new Socio(1, "Paco", "20-02-1990");
        Socio s2 = new Socio(2, "José Enrique", "17-10-1993");

        System.out.println(s1.toString());
        System.out.println(s2.toString());

        int resultado = s1.compareTo(s2);
        if(resultado < 0) System.out.println("El socio " + s1.nombre + " va por delante del socio " + s2.nombre);
    }





}
