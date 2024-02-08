package Tema7.EjercicioDeClase8;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

enum Posicion{ DELANTE, DETRAS}

public class Texto {
    int longitudMaxima;
    String cadena = "";
    String[] registroHora = new String[0];
    String[] registroTexto = new String[0];

    Texto(int longitudMaxima){
        setLongitudMaxima(longitudMaxima);
    }

    public void setLongitudMaxima(int longitudMaxima) {
        if(longitudMaxima > 0) this.longitudMaxima = longitudMaxima;
    }

    public void setCadena(String cadena) {
        if(cadena.length() <= longitudMaxima){
            this.cadena = cadena;
            //registrarCambio(cadena);
        }
        else {
            System.out.println("Se ha superado el tamaño máximo permitido.");
        }
    }

    public int getLongitudMaxima() {
        return this.longitudMaxima;
    }

    public String getCadena() {
        return this.cadena;
    }

    void registrarCambio(String cambio){
        registroHora = Arrays.copyOf(registroHora, registroHora.length+1);
        registroTexto = Arrays.copyOf(registroTexto, registroTexto.length+1);
        registroHora[registroHora.length-1] = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        registroTexto[registroTexto.length-1] = cambio;
    }

    void registroDeCambiosDetallado(){
        for (int i = 0; i < registroHora.length; i++) {
            System.out.println("Texto \"" + registroTexto[i] + "\" registrado a las: " + registroHora[i]);
        }
    }

    void mostrarInformacion(){
        System.out.println("Texto: " + getCadena());
        System.out.println("Cantidad de vocales: " + obtenerVocales());
        registroDeCambiosDetallado();
    }

    int obtenerVocales(){
        String conjuntoVocales = "aeiouAEIOUáéíóúÁÉÍÓÚäëïöüÄËÏÖÜ"; //O "aeiouáéíóú y lo ponéis en lowercase
        int vocales = 0;
        for (int i = 0; i < getCadena().length(); i++)
            if(conjuntoVocales.contains(Character.toString(getCadena().charAt(i)))) {
                vocales++;
            }
        return vocales;
    }

    void agregarTexto(char caracter, Posicion posicion){
        if(getCadena().length()+1 <= longitudMaxima) //Si el texto entra
        {
            if(posicion == Posicion.DELANTE) //Añado delante
                setCadena(caracter+getCadena());
            else//Añado detrás
                setCadena(getCadena()+caracter);

            registrarCambio(String.valueOf(caracter));

        }
        else{
            System.out.println("No es posible añadir " + caracter + " a la cadena.");
            System.out.println("Su tamaño sería de " + (getCadena().length()+1) + " y tu tamaño máximo es " + longitudMaxima);
        }
    }
    void agregarTexto(String cadena, Posicion posicion){
        if(getCadena().length()+cadena.length() <= longitudMaxima) //Si el texto entra
        {
            if(posicion == Posicion.DELANTE) //Añado delante
                setCadena(cadena+getCadena());
            else //Añado detrás
                setCadena(getCadena()+cadena);

            registrarCambio(cadena);
        }
        else{
            System.out.println("No es posible añadir " + cadena + " a la cadena " + getCadena() + ".");
            System.out.println("Su tamaño sería de " + (getCadena().length()+cadena.length()) + " y tu tamaño máximo es " + longitudMaxima);
        }

    }
}
