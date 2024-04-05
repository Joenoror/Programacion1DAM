package EjercicioDeClase1;

import java.util.Arrays;
public class EjercicioDeClase1 {

    //EjercicioDeClase1
    static <E> E[] guardar(E elem, E[] array){
        E[] nuevoArray = Arrays.copyOf(array, array.length + 1);
        nuevoArray[nuevoArray.length-1] = elem;
        return nuevoArray;
    }

//    static String[] guardar(String elem, String[] array){
//        String[] nuevoArray = Arrays.copyOf(array, array.length + 1);
//        nuevoArray[nuevoArray.length-1] = elem;
//        return nuevoArray;
//    }

    public static void main(String[] args) {
        String[] cadenas = new String[0];
        System.out.println(Arrays.toString(cadenas));
        cadenas = guardar("coche", cadenas);
        cadenas = guardar("avión", cadenas);
        System.out.println(Arrays.toString(cadenas));
    }
}
