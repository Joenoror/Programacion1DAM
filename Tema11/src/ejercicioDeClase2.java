import java.io.*;

public class ejercicioDeClase2 {
    public static void main(String[] args) {

        String estrofa = "La bandera blanca y verde," +
                "\nvuelve, tras siglos de guerra," +
                "\na decir paz y esperanza," +
                "\nbajo el sol de nuestra tierra.";

        ObjectOutputStream flujoDeSalida = null;
        try {
            flujoDeSalida = new ObjectOutputStream(new FileOutputStream(".\\Archivos\\himnoDeAndalucia.dat"));
            flujoDeSalida.writeObject(estrofa);
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            if(flujoDeSalida != null){
                try {
                    flujoDeSalida.close();
                } catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }

        try(ObjectInputStream flujoDeEntrada = new ObjectInputStream(new FileInputStream(".\\Archivos\\himnoDeAndalucia.dat"))){

            String estrofaLeida = (String) flujoDeEntrada.readObject();
            System.out.println(estrofaLeida);

        } catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

    }

}
