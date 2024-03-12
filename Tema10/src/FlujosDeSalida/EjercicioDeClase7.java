package FlujosDeSalida;

import java.io.*;

public class EjercicioDeClase7 {
    public static void main(String[] args) {
        //PRIMER PASO - DECLARAR EL BUFFER PARA ABRIR Y LEER O ESCRIBIR
        BufferedWriter out = null; //ESCRIBIR
        try { //SEGUNDO PASO - ABRIR EL FICHERO COMPROBANDO QUE NO TENGAMOS ERRORES
            out = new BufferedWriter(new FileWriter(".\\Archivos\\salida.txt")); //ENCONTRAR EL FICHERO
            //TERCER PASO - Trabar con la información, ya sea la que se va a escribir o la que se va a leer.
            String cad = "Vida antes que muerte. Fuerza antes que debilidad. Viaje antes que destino.";
            out.write(cad); //Escribo en mi fichero la cadena entera "cad"
            out.newLine(); //Realizo un salto de línea
            cad = "El camino de los reyes, Brandon Sanderson"; //Cambio el valor a mi cadena.
            for (int i = 0; i < cad.length(); i++) {
                out.write(cad.charAt(i));
            }
        } catch (IOException e){
            System.out.println(e.getMessage()); //IMPRIMIR EL MENSAJE DE ERROR SI LO HUBIERA
        } finally {
            //CUARTO PASO - Cerrar el archivo
            if(out != null){
                try {
                    out.close();
                } catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }

    }
}

//BufferedWriter(crea un flujo de escritura);
//FileWriter(ruta del archivo);
//out = new BufferedWriter(new FileWriter(".\\Archivos\\salida.txt"));
