package Tema7.Explicacion;

public class Perro {
    String raza;
    String nombre;
    float peso;
    int edad;

    Perro(String raza, String nombre, float peso, int edad, int chip){
        this.raza = raza;
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
    }

    Perro(String nombre, int chip){
        this.nombre = nombre;
        this.peso = 10;
    }

    Perro(String nombre){
        this.nombre = nombre;
    }


}

