package EjercicioDeClase2;

import java.util.Arrays;
public class EjercicioDeClase2 {
    //EjercicioDeClase2
    static <E> E[] concatenacionDeArrays(E[] array1, E[] array2 ){
        E[] nuevoArray = Arrays.copyOf(array1, array1.length+array2.length);
        System.arraycopy(array1, 0, nuevoArray, 0, array1.length);
        System.arraycopy(array2, 0, nuevoArray, array1.length, array2.length);
        return nuevoArray;
    }

    public static void main(String[] args) {

        String[] array1={"José", "Enrique"};
        String[] array2={"Ortega", "Ortega"};

        String[] resultado = concatenacionDeArrays(array1,array2);

        System.out.println(Arrays.toString(resultado));



    }
}
