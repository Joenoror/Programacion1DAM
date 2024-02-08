package Tema7.Explicacion;

public class Persona{
    //Parámetros de la clase
    String nombre;
    int edad;
    double estatura;
    static String hoy;
//    static String hoy = funcionesExtra.calcularDiaDeLaSemana();

    //Métodos de la clase
    void saludar(){
        System.out.println("Hola. Mi nombre es " + nombre);
        System.out.println("Encantado de conocerte");
    }

    void cumplirAnios(){
        double edad;
        this.edad++; //Incremento el valor de edad.
        System.out.println("¡Es mi cumpleaños! He cumplido " + this.edad + ".");
    }

    void crecer(double incremento){
        estatura += incremento;
        System.out.println("He crecido " + funcionesExtra.metrosACentimetros(incremento) + " cm. Ahora mido " + estatura + "metros.");
    }

    //Métodos estáticos de la clase
    static void hoyEs(int dia){
        hoy = switch(dia){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Desconocido";
        };
    }

}
 class funcionesExtra{

    public static int metrosACentimetros(double metros){
        return (int) (metros*100);
    }

    public static String calcularDiaDeLaSemana(){
        int indice = java.time.LocalDate.now().getDayOfWeek().getValue();
        String diaDeLaSemana = switch(indice){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Desconocido";
        };
        return diaDeLaSemana;
    }

}
