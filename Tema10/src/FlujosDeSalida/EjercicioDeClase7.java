package FlujosDeSalida;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EjercicioDeClase7 {
    public static void main(String[] args) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter(".\\Archivos\\salida.txt"));
            String cad = "Vida antes que muerte. Fuerza antes que debilidad. Viaje antes que destino";
            out.write(cad);
            out.newLine();
            cad = "Brandon Sanderson - El camino de los reyes.";
            for (int i = 0; i < cad.length(); i++) {
                out.write(cad.charAt(i));
            }
        } catch (IOException e){
            e.getMessage();
        } finally {
            if(out != null){
                try {
                    out.close();
                } catch (IOException e){
                    e.getMessage();
                }
            }
        }

    }
}
