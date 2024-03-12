package Monica;

import java.util.Scanner;

public class Persona {
    public  String nombre;
    private  int edad;
    double estatura;
    Persona (String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    Persona(String nombre,int edad,double estatura){
        this.nombre=nombre;
        setEdad(edad);
        this.estatura=estatura;
    }

    public void mostrarDatosPersona(){
        System.out.println("Nombre "+ getNombre());
        System.out.println("Edad " + getEdad());
        System.out.println("EStatura "+ getEstatura());
    }
    public void aumentarEdad(String nombre, int edad){
        setEdad(getEdad()+1);
        this.edad++;


    }

    public void setEdad(int edad) {



        this.edad = edad;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getEstatura() {
        return estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
