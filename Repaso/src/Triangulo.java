public class Triangulo extends Poligono{

    Triangulo(double base, double altura){
        super(base, altura);
    }

    @Override
    double area() {
        return (base*getAltura())/2;
    }
}
