import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ejercicioDeClase2Alternativo {
    public static void main(String[] args) {

        String estrofa = "La bandera blanca y verde,\nvuelve, tras siglos de guerra,\na decir paz y esperanza,\nbajo el sol de nuestra tierra.";

        try(ObjectOutputStream flujoDeSalida = new ObjectOutputStream(new FileOutputStream(".\\Archivos\\himnoDeAndalucia.dat"))) {
            //OPCION 1 - ESCRIBIR T0DO EL OBJETO DE UNA VEZ
            flujoDeSalida.writeObject(estrofa);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
