package Tema8.EjercicioDeClase1;

enum Curso{ PREESCOLAR, PRIMARIA, ESO, BACHILLERATO, GRADO_SUPERIOR, GRADO_UNIVERSITARIO}

public class Alumno extends Persona{

    Curso curso;

    Alumno(String nombre, int edad, double estatura, boolean universitario){
        super(nombre, edad, estatura);
        setCurso(asignarCurso(universitario));
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    @Override
    void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Tu curso es: " + curso);
        mostrarHorario();
    }

    void mostrarHorario(){
        if(curso.ordinal() < 4) System.out.println("Horario de mañana");
        else System.out.println("Horario de tarde");
    }

    Curso asignarCurso(boolean universitario){
        Curso cursoAux = Curso.PREESCOLAR;
        if(getEdad()>0 && getEdad() < 6) cursoAux = Curso.PREESCOLAR;
        else if (getEdad() >= 6 && getEdad() < 13) cursoAux = Curso.PRIMARIA;
        else if (getEdad() >= 13 && getEdad() < 16) cursoAux =  Curso.ESO;
        else if (getEdad() >= 16 && getEdad() < 18) cursoAux =  Curso.BACHILLERATO;
        else{
            if(!universitario) cursoAux =  Curso.GRADO_SUPERIOR;
            else cursoAux = Curso.GRADO_UNIVERSITARIO;
        }
        return cursoAux;
    }
}
