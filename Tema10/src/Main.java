import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();

        try{
            int c = a/b;

            System.out.println("El resultado es: " + c);
        }catch (ArithmeticException e){
            System.out.println("Error: división por cero");
        }catch (InputMismatchException e){
            System.out.println("Error: Has introducido un dato que no es entero");
        }
    }
}