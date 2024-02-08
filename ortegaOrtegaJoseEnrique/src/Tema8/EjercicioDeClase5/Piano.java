package Tema8.EjercicioDeClase5;

public class Piano extends Instrumento{

    Piano(NotasMusicales[] notasMusicales){
        super(notasMusicales);
    }

    Piano(){}

    @Override
    void interpretar() {
        for (var nota: super.notas) {
            switch (nota){
                case DO -> System.out.println("dooo");
                case RE -> System.out.println("reee");
                case MI -> System.out.println("miii");
                case FA -> System.out.println("faaa");
                case SOL -> System.out.println("soool");
                case LA -> System.out.println("laaa");
                case SI -> System.out.println("siii");
            }
        }

    }


}
