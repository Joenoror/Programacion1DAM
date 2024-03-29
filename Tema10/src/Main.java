import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        FileReader in = null;
        String texto = "";
        BufferedReader in2 = null;

        try{
            in2 = new BufferedReader( new FileReader("D:\\Salesianos\\Programacion\\Programacion1DAM\\Tema10\\src\\numeros"));
            System.out.println("FICHERO ENCONTRADO");
            String textoGuardado = in2.readLine();
            while(textoGuardado != null){
                System.out.println("-ESCRIBO-");
                texto = texto + textoGuardado;
                textoGuardado = in2.readLine();
            }

        } catch (IOException e){
            e.getMessage();
        } finally {
            if(in2 != null){
                try{
                    System.out.println("CERRAMOS EL FICHERO");
                    in2.close();
                } catch (IOException e){
                    e.getMessage();
                }
            }
            else{
                System.out.println("EL FICHERO NUNCA SE LLEGÓ A ENCONTRAR");
            }
        }
        System.out.println(texto);

//        try{
//            System.out.println("Introduce el nombre del archivo");
//            String nombreArchivo = new Scanner(System.in).nextLine();
//            FileReader in = new FileReader(".\\Archivos\\"+ nombreArchivo + ".txt");
//            System.out.println("Archivo encontrado");
//        }catch(IOException e){
//            System.out.println("ERROR: El archivo no existe");
//        }


        //10.1 Excepciones
        //ejemploEnteros();

//        leerEntero();





        //10.1.2 - Excepciones de usuario
        //ejemploEdadNegativa();

        //10.2 Flujos de entrada de texto


//        String texto = "";
//        ejemploEntradaTexto(texto);
        //ejemploEntradaTextoConBuffered(texto);


    }


    static Integer leerEntero(){
        Integer entero = null;
        while(entero == null){
            try{
                System.out.println("Introduce un entero");
                entero = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e){
                System.out.println("ERROR: No has introducido un número entero");
            }
        }
        return entero;
    }

    static void ejemploEnteros(){
        int a, b;
        a=5;
        b=0;
        int c = 0;

        try{
            c = a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("ERROR desconocido");
        }
    }
    static void ejemploEdadNegativa(){
        try{
            System.out.println("Introducir edad: ");
            int edad = new Scanner(System.in).nextInt();
            System.out.println("Introducir altura: ");
            double altura = new Scanner(System.in).nextDouble();
            if(edad < 0 | altura < 0){
                throw new ExceptionValorNegativo();
            }
            else{
                //Implementación de edad
                System.out.println("Edad correcta: " + edad);
                System.out.println("Altura correcta: " + altura);
            }
        } catch (ExceptionValorNegativo e){
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