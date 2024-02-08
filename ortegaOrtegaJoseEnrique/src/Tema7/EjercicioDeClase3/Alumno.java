package Tema7.EjercicioDeClase3;

//        String con Nombre
//        Int con Edad
//        Double con Calificación
//        Además, le deberás agregar los siguientes métodos:
//        Redondeo de nota


import java.util.Scanner;

enum Emancipado{
    SI,
    NO
}
enum Sexo { HOMBRE, MUJER }
class Alumno {
    String nombre;
    int edad;
    double calificacion;
    Sexo sexo;

    Alumno(String nombre, int edad, double calificacion){
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    Alumno(String nombre, int edad, double calificacion,Sexo sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
        this.sexo = sexo;
    }
    Alumno(String nombre, int edad, double calificacion,String sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
        setSexo(sexo);
    }


    void redondear(){
        this.calificacion = Math.round(this.calificacion);
    }


    public void setSexo(String sexo) {
        sexo = sexo.toUpperCase();
        this.sexo = Sexo.valueOf(sexo);
    }

    static Alumno rellenarAlumno(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del nuevo alumno");
        String tempNombre = sc.nextLine();
        System.out.println("Introduce la edad del nuevo alumno");
        int tempEdad = sc.nextInt();
        System.out.println("Introduce la calificación del nuevo alumno");
        double tempCalificacion = sc.nextDouble();
        Alumno alumnoNuevo = new Alumno(tempNombre, tempEdad, tempCalificacion);

        return alumnoNuevo;
    }

}
