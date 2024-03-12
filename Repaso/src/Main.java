import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


//        Poligono p = new Triangulo(2,2);
//        System.out.println(p.area());
//
//        p = new Rectangulo(2,2);
//        System.out.println(p.area());

        Futbolista f1 = new Futbolista("123456789A", "Ronaldo", 50, 1000);
        Futbolista f2 = new Futbolista("123456789B", "Serresiete", 36, 3);

        Equipo equipo = new Equipo();
        equipo.plantilla = new Futbolista[]{f1, f2};

        System.out.println(Arrays.deepToString(equipo.plantilla));

        ComparaEdades comparaEdades = new ComparaEdades();
        Arrays.sort(equipo.plantilla, comparaEdades);

        System.out.println(Arrays.deepToString(equipo.plantilla));


    }
}