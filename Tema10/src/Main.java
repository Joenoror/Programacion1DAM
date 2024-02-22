import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a, b;
        a=5;
        b=0;
        int c = 0;

        try{
            c = a/b;
            System.out.println(c);
        }catch (NullPointerException e){
            System.out.println("ERROR: " + e.getMessage());
        }catch (Exception e){
            System.out.println("ERROR desconocido");
        }





    }
}