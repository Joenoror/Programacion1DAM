package ortegaOrtegaJoseEnrique.Ejercicio1;

enum Color { ROJO, AZUL, AMARILLO, VERDE}

public class Vehiculo {
    Color color;
    final private int anioDeFabricacion;
    String modelo;

    Vehiculo(Color color, int anioDeFabricacion, String modelo){
        setColor(color);
        setModelo(modelo);
        this.anioDeFabricacion = anioDeFabricacion;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnioDeFabricacion() {
        return anioDeFabricacion;
    }

    public Color getColor() {
        return color;
    }
}
