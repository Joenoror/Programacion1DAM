import EjercicioDeClase5.ComparaEdades;
import EjercicioDeClase5.Deportista;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Main {




        static <A> int numeroDeNulos(A[] tabla){
        int cont = 0;
        for(A elementoDelArray : tabla){
            if(elementoDelArray == null){
                cont++;
            }
        }
        return cont;
    }

        static <A> A[] insercion(A[] tabla, A elemento){

            A[] tablaAux = Arrays.copyOf(tabla, tabla.length + 1);
            tablaAux[tablaAux.length-1] = elemento;
            return tablaAux;
        }

        static <B> B[] concatenacion(B[] array1, B[] array2){

            B[] arrayAuxiliar = Arrays.copyOf(array1,array1.length + array2.length);//[1][1][1][1][][][][][]
            System.arraycopy(array2, 0, arrayAuxiliar, array1.length, array2.length);
            //[1][1][1][1][2][2][2][2][2]
            return arrayAuxiliar;
        }





    public static void main(String[] args) {


            Contenedor<?> c = new Contenedor<>();
            c.setObjeto(5);
        System.out.println(c.getObjeto());
        c.setObjeto("HOLA");
        System.out.println(c.getObjeto());














        Integer[] numeros = {1,2,3,null,5};
        String[] nombres = {"Jose", "Lucas", "Pepe"};
        String[] masNombres = {"Pablo", "Paco"};

        int numeroDeNulos = numeroDeNulos(numeros);
        System.out.println(numeroDeNulos + "en el array de Integer");
        numeroDeNulos = numeroDeNulos(nombres);
        System.out.println(numeroDeNulos);

        System.out.println(Arrays.deepToString(numeros));
        System.out.println(Arrays.deepToString(nombres));
        numeros = insercion(numeros, 19);
        System.out.println(Arrays.deepToString(numeros));
        nombres = insercion(nombres, "Fernando");
        System.out.println(Arrays.deepToString(nombres));

        String[] todosLosNombres = concatenacion(nombres, masNombres);
        System.out.println(Arrays.deepToString(todosLosNombres));



//
//        Contenedor<Double> c1 = new Contenedor<Double>();

//        Contenedor<Deportista, Integer> deportistas = new Contenedor<>();
//
//        deportistas.setObjeto(new Deportista("1", "Luca Modric",  LocalDate.of(1993,10,17), "NATACION"));
//
//        deportistas.objetos = new Deportista[]{deportistas.objeto};
//        System.out.println(deportistas.getObjeto());
//        deportistas.id = 1;
//        deportistas.mostrarContenido();

        Cliente c1 = new Cliente("Pepe", "1");
        Cliente c2 = new Cliente("Luis", "9");
        Cliente c3 = new Cliente("Roberto", "6");

        Cliente[] clientes = {c1, c2, c3};
        System.out.println(Arrays.deepToString(clientes));
        Arrays.sort(clientes); //Ordena conforme al compareTo que ordena con el DNI
        System.out.println(Arrays.deepToString(clientes));
        ComparaNombres cE = new ComparaNombres();
        Arrays.sort(clientes,cE); //Ordena conforme al método de ordenación que pasamos como parámetro
        System.out.println(Arrays.deepToString(clientes));

        Comparator<Cliente> ordenacion = Comparator.naturalOrder();

        Arrays.sort(clientes, ordenacion);
        System.out.println(Arrays.deepToString(clientes));
        Arrays.sort(clientes, ordenacion.reversed());
        System.out.println(Arrays.deepToString(clientes));



    }

//
//
//
//
//
//
//
//
//
//
////
////        Integer[] numeros = {1,2,3,4,5};
//
////        Double sumaDelArray = sumaDeElementos(arrayDeDoubles);
////        Integer sumaDelArrayDeIntegers = sumaDeElementos(numeros);
//
////        System.out.println(Arrays.deepToString(nombresDeAlumnos));
//
////        Contenedor<Double> c1 = new Contenedor<>("Jose");
////        c1.guardar(6.7);
////        c1.objetos = new Double[]{4.5, 3.2, 1.2, 0.5, 6.0};
////        System.out.println(c1.extraer());
////        c1.mostrarContenido();
////        Contenedor<String> c2 = new Contenedor<>("Pepe");
////        c2.guardar("hola");
////        c2.objetos = new String[]{"Monica", "Angel", "Pedro"};
////        c2.mostrarContenido();
////        System.out.println(c2.extraer());
//
//    }
//
//    static Double sumaDeElementos(Double[] array){
//        Double resultado = 0.0;
//        for (int i = 0; i < array.length; i++) {
//            resultado = resultado + i;
//        }
//        return resultado;
//    }
}
