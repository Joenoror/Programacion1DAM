package EjercicioDeClase12;

import java.util.TreeSet;

public class ejercicioDeClase12 {
    public static void main(String[] args) {

        Socio s1 = new Socio("001", "Pepe", "10/10/2010");

        TreeSet<Socio> socios = new TreeSet<>();

        socios.add(s1);

        System.out.println(socios);


    }
}
