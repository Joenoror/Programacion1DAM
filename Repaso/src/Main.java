import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static Integer[][] sumaDeMatrices(Integer[][] matriz1, Integer[][] matriz2) {

        Integer[][] matrizAux = new Integer[matriz1.length][matriz1[0].length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matrizAux[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matrizAux;
    }

    static void mostrarMatriz(Integer[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Integer[][] matriz1 = new Integer[3][3];
        Integer[][] matriz2 = new Integer[3][3];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = new Random().nextInt(0,99);
                matriz2[i][j] = new Random().nextInt(0,99);
            }
        }
        mostrarMatriz(matriz1);
        mostrarMatriz(matriz2);
        mostrarMatriz(sumaDeMatrices(matriz1, matriz2));

        Futbolista f1 = new Futbolista("123456789A", "Ronaldo", 50, 1000);
        Futbolista f2 = new Futbolista("123456789B", "Serresiete", 36, 3);
        Futbolista f3 = new Futbolista("123456789C", "RaulGonzalezBlanco", 94, 1991991, Posicion.DELANTERO);
        Futbolista f4 = new Futbolista("113456789C", "Ronaldinho", 10, 3, "ceNtrocaMpista");

        Equipo equipo = new Equipo();
        equipo.plantilla = new Futbolista[]{f1, f2,f3,f4};

        System.out.println(Arrays.deepToString(equipo.plantilla));


        ComparaEdades comparaEdades = new ComparaEdades();
        Arrays.sort(equipo.plantilla, comparaEdades);

        System.out.println(Arrays.deepToString(equipo.plantilla));

        //Arrays.deepToString --> imprimo el array completo


    }
}