public class Rectangulo extends Poligono{

    Rectangulo(double base, double altura){
        super(base, altura);
    }

    @Override
    double area() {
        return base*getAltura();
    }
}
