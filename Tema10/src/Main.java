import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        //10.1 Excepciones
        //ejemploEnteros();

        //10.1.2 - Excepciones de usuario
        //ejemploEdadNegativa();

        //10.2 Flujos de entrada de texto


        String texto = "";
        ejemploEntradaTexto(texto);
        //ejemploEntradaTextoConBuffered(texto);


    }

    static void ejemploEnteros(){
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
    static void ejemploEdadNegativa(){
        try{
            System.out.println("Introducir edad: ");
            int edad = new Scanner(System.in).nextInt();
            if(edad < 0) throw new ExceptionEdadNegativa();
            else{
                //Implementación de edad
                System.out.println("Edad correcta: " + edad);
            }
        } catch (ExceptionEdadNegativa e){
            System.out.println(e);
        }
    }

    static void ejemploEntradaTexto(String texto) throws IOException {
        FileReader in = null;
        try{
            in = new FileReader("E:\\Salesianos\\Practicas\\Programacion1DAM\\Tema10\\src\\prueba.txt");
            System.out.println("--ABRIMOS EL FICHERO--");
            int c = in.read();
            while(c!=-1){
                System.out.println("---El fichero se está leyendo...---");
                texto = texto + (char) c;
                c = in.read();
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if( in != null) { //Si el flujo está abierto
                try{
                    in.close();
                    System.out.println("--CERRAMOS EL FICHERO--");
                } catch (IOException e){
                    System.out.println(e);
                }
            }
        }
        System.out.println(texto);
    }

    static void ejemploEntradaTextoConBuffered(String texto){
        BufferedReader in = null;
        try{
            in = new BufferedReader(new FileReader("E:\\Salesianos\\Practicas\\Programacion1DAM\\Tema10\\src\\prueba.txt"));
            System.out.println("--ABRIMOS EL FICHERO--");
            String linea = in.readLine();
            while(linea != null){
                System.out.println("---El fichero se está leyendo...---");
                texto = texto + linea + '\n';
                linea = in.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if( in != null) { //Si el flujo está abierto
                try{
                    in.close();
                    System.out.println("--CERRAMOS EL FICHERO--");
                } catch (IOException e){
                    System.out.println(e);
                }
            }
        }
        System.out.println(texto);
    }
//
//    void metodo1(int a, int b) throws ArithmeticException{
//        int c = 0;
//        c = a/b;
//        System.out.println("a/b = " + c);
//    }
//
//    void metodo2() {
//
//        try{
//            //bloque que trabaja con archivos
//            return;
//        } catch (IOException e){
//            //bloque si salta la expceción
//        } finally {
//            //código para cerrar archivos
//        }
//        //...
//        return;


//        int x, y;
//        //...
//        try {
//            metodo1(x,y);
//        } catch (ArithmeticException e){
//            System.out.println("Error. División por cero");
//        }
//        //...
//    }





}