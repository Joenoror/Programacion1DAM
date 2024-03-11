public abstract class Poligono {

    double base;
    private double altura;

    Poligono(double base, double altura){
        this.base = base;
        setAltura(altura);
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    abstract double area();

}
