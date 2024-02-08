package Tema8.EjercicioDeClase5;

public class Flauta extends Instrumento{

    Flauta(NotasMusicales[] notasMusicales){
        super(notasMusicales);
    }

    Flauta(){}

    @Override
    void interpretar() {
        for (var nota: super.notas) {
            switch (nota){
                case DO -> System.out.println("do");
                case RE -> System.out.println("re");
                case MI -> System.out.println("mi");
                case FA -> System.out.println("fa");
                case SOL -> System.out.println("sol");
                case LA -> System.out.println("la");
                case SI -> System.out.println("si");
            }
        }

    }


}