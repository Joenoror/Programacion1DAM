import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EjemploEscrituraBinaria {
    public static void main(String[] args) {

        int[] arrayDeNumeros = new int[]{0,1,2,3,4,5,6,7,8,9};

//        ObjectOutputStream out = null;
//        try {
//            out = new ObjectOutputStream(new FileOutputStream("datos.dat"));
//            out.writeObject(arrayDeNumeros);
//        } catch (IOException e){
//            System.out.println("ERROR: Error de tipo IOException");
//        } finally {
//            if(out != null){
//                try {
//                    out.close();
//                } catch (IOException e){
//                    System.out.println(e.getMessage());
//                }
//            }
//        }

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos.dat"))){
            out.writeObject(arrayDeNumeros);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
