package Tema8.EjercicioDeClase1;

public class Main {

    public static void main(String[] args) {
//
//        Alumno a = new Alumno("Jose", 30, 1.70, false);
//        a.mostrarDatos();
//        Alumno b = new Alumno("Paula", -5, 0, true);
//        b.mostrarDatos();

        Alumno a = new Alumno("Jose", 30, 1.70, false);
        Alumno b = new Alumno("Paula", -5, 0, true);
        Alumno c = new Alumno("Jose", 30, 1.70, false);

        System.out.println(a.getClass().getSuperclass());


    }

}
