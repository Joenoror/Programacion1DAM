package PrimeraEv;

public class cuadradoMorenoPedroFunciones {


        public static int [][] generarMatriz (int n ) {
            int matrizAleatoria [][] = new int[n][n];
          for (int i = 0; i < n; i++) {
              for (int j = 0; j < n; j++) {
                   matrizAleatoria [i][j] = (int) (Math.random() * 100);

              }
          }
            return matrizAleatoria;

        }



        public static int [][] multiplicarMatrices (int[][] matrizA, int[][] matrizB){

            int n = matrizA.length;
            int [][] matrizResultado = new int[n][n];

            for (int i = 0; i < matrizA.length; i++) {
                for (int j = 0; j < matrizA.length; j++) {
                    for (int k = 0; k <matrizA.length; k++){
                       matrizResultado[i][j] += matrizA[i][k] * matrizB [k][j];

                    }
                }
            }

            return matrizResultado;
    }

     public static int [][] sumarMatrices (int[][] matrizA, int[][] matrizB) {
         int n = matrizA.length;
         int [][] matrizResultado2 = new int[n][n];

         for (int i = 0; i < matrizA.length; i++) {
             for (int j = 0; j < matrizA.length; j++) {

                 matrizResultado2 [i][j] = matrizA [i][j]  + matrizB [i][j];

             }
         }
            return matrizResultado2;
     }

        public static void imprimirMatriz (int[][] matriz){

            for (int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz.length; j++){
                    System.out.print(matriz [i][j]); System.out.print(" ");
                }
                System.out.println("");
            }

        }


    public static boolean verdadFalso (int n, int [] arrayEnteros, int contador) {
        int contador2 = 0;

        for (int i = 0; i <  arrayEnteros.length; i++) {

            if (n == arrayEnteros [i] ) {
                contador2++;
            }
        }

        if (contador2 >= contador) {
            return true;

        }
         return false;

    }

}
