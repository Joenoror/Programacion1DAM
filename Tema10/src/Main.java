import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        try{
            int c = a/b;
        }
        catch (Exception e){
            System.out.println("Estoy en el primer catch");
        }
    }
}