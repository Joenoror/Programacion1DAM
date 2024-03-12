package Monica;


import java.util.Scanner;

public class Alumno extends Persona {
    Curso curso;

    Alumno(String nombre, int edad, double estatura) {
        super(nombre, edad, estatura);
        //setCurso(curso); //El curso deberías de asingarlo por la edad no pasarle un curso como parámetro.
        asignarCurso();
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    @Override
    public void mostrarDatosPersona() {
        super.mostrarDatosPersona();
        System.out.println("Tu curso es :" + curso);
        mostrarHorario();

    }

    public void mostrarHorario() { //Aquí el fallo era que estabas intentando sacar como valor dos tipos de datos, uno boolean y un array de cursos.

        //Para resolver este apartado lo que tendrías que hacer es una función void en la que en función del curso en el que se encuentre
        // imprimirá un mensaje si su horario es de mañana o tarde

        //Curso[] cursoMañana = {Curso.GRADO_SUPERIOR, Curso.grado_universitario};
        //Curso[] cursoTarde = {Curso.PREESCOLAR, Curso.INFANTIL, Curso.PRIMARIA, Curso.SECUNDARIA, Curso.BACHILLERATO};
//        return getCurso[i];

        if(curso == Curso.GRADO_UNIVERSITARIO || curso == Curso.GRADO_SUPERIOR){
            System.out.println("Tu horario es de tarde");
        } else System.out.println("Tu horario es de mañana");

    }

    public void asignarCurso(){ //Aqui cursoAux no tiene mucho sentido, pero lo tienes que usar para preguntar si se encuentra en superior o en
        // universiario pero no puedes asignarle el curso porque el curso es propiedad del alumno

        if (getEdad()>=0 && getEdad()<=4 )curso=Curso.PREESCOLAR;
        else if (getEdad()>=6 && getEdad()<=8 )curso=Curso.INFANTIL;
        else if (getEdad()>=9 && getEdad()<=12 )curso=Curso.PRIMARIA;
        else if (getEdad()>=13 && getEdad()<=16 )curso=Curso.SECUNDARIA;
        else if (getEdad()>=17 && getEdad()<=18 )curso=Curso.BACHILLERATO;
        else {
            System.out.println("Introduce 1 si se encuentra en Grado Superior o 2 si se encuentra en Grado Universitario");
            int cursoAux = new Scanner(System.in).nextInt();
            if(cursoAux == 1) curso = Curso.GRADO_SUPERIOR;
            else curso = Curso.GRADO_UNIVERSITARIO;
//            if (!GRADO_UNIVERSITARIO) { //Aquí el error es lo que te he comentado en el correo, que tienes que comparar GRADO UNIVERSITAROIO CON ALGO.
//                cursoAux=Curso.GRADO_SUPERIOR;
//            } else cursoAux= Curso.GRADO_UNIVERSITARIO;
        }
    }
}



