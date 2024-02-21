package Ejercicio3;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //Socios
        Socio s1 = new Socio(2, "Paco", "20-02-1980", 5);
        Socio s2 = new Socio(10, "José Enrique", "17-10-2004", 10);
        Socio s3 = new Socio(1, "Lucas", "20-10-2010", 1);

        //Comprobamos orden
        int resultado = s1.compareTo(s2);
        System.out.println(resultado);

        //Creo lista de socios y la ordeno
        Socio[] listaSocios = new Socio[] {s1,s2,s3};
        Arrays.sort(listaSocios);
//
//        //Muestro la lista ordenada
//        System.out.println(Arrays.deepToString(listaSocios));
//
//        //Creo objetos comparadores de edades
//        ComparaEdades c = new ComparaEdades();
//        Arrays.sort(listaSocios, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return (int) (((Socio)o1).dni - ((Socio)o2).dni);
//            }
//        });
//        System.out.println(Arrays.deepToString(listaSocios));

//        //Creo clase anónima al llamar al método sort()
//        Arrays.sort(listaSocios, new Comparator(){
//            public int compare(Object ob1, Object ob2){
//                return ((Socio)ob1).edad() - ((Socio)ob2).edad();
//            }
//        });
//        System.out.println(Arrays.deepToString(listaSocios));

//        //Creo objetos comparadores de edades
        Comparator c1 = new ComparaEdades();
        Comparator c2 = c1.reversed();
        Arrays.sort(listaSocios, c1);
        System.out.println(Arrays.deepToString(listaSocios));
        Arrays.sort(listaSocios, c2);
        System.out.println(Arrays.deepToString(listaSocios));

    }





}
