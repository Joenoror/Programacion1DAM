public class Main2 {
    public static void main(String[] args)  {

        try {
            Calculadora();

        } catch (ArithmeticException | IndexOutOfBoundsException e ){
            System.out.println(e.getMessage());
        }

    }

    static void Calculadora(){
        int a = 5;
        int b = 0;
        int[] array = new int[0];
        System.out.println(array[1]);
        Division(a,b);
        Suma(a,b);
        Math.pow(0,b);


    }


    static int Suma(int a, int b){
        return a+b;
    }
    static int Resta(int a, int b){
        return a-b;
    }

    static int Division(int a, int b) {
        int c = 0;
        c=a/b;
        return c;
    }


}
