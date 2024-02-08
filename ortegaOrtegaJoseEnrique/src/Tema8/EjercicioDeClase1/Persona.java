package Tema8.EjercicioDeClase1;

import java.util.Scanner;

public class Persona {

    public String nombre;
    private int edad;
    double estatura;

    Persona(String nombre, int edad, double estatura){
        setNombre(nombre);//compruebas posibles errores con el set
        setEdad(edad);
        setEstatura(estatura);
    }

    Persona(String nombre, int edad){
        setNombre(nombre);
        setEdad(edad);
        setEstatura(0);
    }

    @Override
    public boolean equals(Object obj) {
        Persona personaObj = (Persona) obj;
        boolean iguales = false;
        if(this.nombre.equals(personaObj.nombre) && (this.edad == personaObj.edad)){
            iguales = true;
        }
        return iguales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if(edad>0) this.edad = edad;
        else{
            while(edad<=0){
                System.out.println("La edad no es correcta");
                System.out.println("Introducela de nuevo");
                edad = new Scanner(System.in).nextInt();
            }
            this.edad = edad;
        }
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    void mostrarDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        if(getEstatura()!=0)
            System.out.println("Estatura: " + getEstatura());
    }

    void aumentarEdad(){
        setEdad(getEdad()+1);
        //this.edad++;
    }


}


