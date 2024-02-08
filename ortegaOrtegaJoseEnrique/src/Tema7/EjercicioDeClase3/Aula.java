package Tema7.EjercicioDeClase3;

//        Diseñar la clase Aula que deberá tener los siguientes parámetros:
//        Int con Alumnos máximos
//        Array de Alumno
//        String con el Nombre del aula
//        Booleano con el estado del aula(ocupada o no) que por defecto será false.

//        Además, deberás agregar los siguientes métodos:
//        Añadir un nuevo alumno
//        Cambiar el estado del aula


import java.util.Arrays;

enum Aulas{
    C1D,
    C2D,
    C1E,
    C2E
}


public class Aula {

    int alumnosMaximos;
    Alumno[] alumnos = new Alumno[0];
    Aulas nombre;
    boolean estado = false;

    //Constructor del ejercicio
    Aula(int alumnosMaximos, String nombre){
        this.alumnosMaximos = alumnosMaximos;
        this.nombre = Aulas.valueOf(nombre);
    }

    //Constructor en el que se pide también si el aula está abierta o cerrada
    Aula(int alumnosMaximos, String nombre, boolean estadoAula){
        this.alumnosMaximos = alumnosMaximos;
        this.nombre = Aulas.valueOf(nombre);
        this.estado = estadoAula;
    }

    void mostrarDatosDelAula(){

    }

    void cambiarEstadoAula(){
        this.estado = !this.estado;
        if(this.estado) System.out.println("Ahora el aula se encuentra abierta");
        else System.out.println("Ahora el aula se encuentra cerrada");
    }

    void alumnoNuevo(){
        alumnos = Arrays.copyOf(alumnos, alumnos.length+1);
        alumnos[alumnos.length-1] = Alumno.rellenarAlumno();
    }

    void rellenarAlumnos(){
        this.alumnos = new Alumno[this.alumnosMaximos];
            for (int i = 0; i < this.alumnos.length; i++) {
                System.out.println("Relleno el alumno " + (i+1));
                this.alumnos[i] = Alumno.rellenarAlumno();
            }
    }

    void mostrarAlumnos(){
        System.out.println("En el aula hay un total de " + alumnosMaximos + " alumnos.");
        System.out.println("Este es el listado: ");
        System.out.println("--------------------");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno nº"+i+1+" : " +  alumnos[i].nombre);
        }
        System.out.println("--------------------");
    }

}
