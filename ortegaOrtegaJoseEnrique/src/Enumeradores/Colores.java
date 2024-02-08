package Enumeradores;

enum Entradas{
    PALCO(100),
    ANFITEATRO(80),
    TRIBUNA(30),
    PLATEA(10);

    int precio;

    Entradas(int precio){
        this.precio = precio;
    }

}


public enum Colores {
    ROJO("Rojo"),
    VERDE("Verde"),
    AZUL("Azul"),
    AMARILLO("Amarillo");

    public String nombre;

    Colores(String nombre){
        this.nombre = nombre;
    }

    public String getColor(){
        String color;
        if(this.nombre == null){
            System.out.println("Color no asignado. Valor nulo.");
            color = "NO ASIGNADO";
        }
        else color = this.nombre;
        return color;
    }

    public static void mostrarColores(){
        System.out.print("[");
        for (Colores color: Colores.values())
        {
            if(color.ordinal() != Colores.values().length-1)
                System.out.print(color.nombre + " ");
            else System.out.print(color.nombre);
        }
        System.out.println("]");
    }

    public static Colores getColor(int indice){
        Colores colorADevolver = Colores.ROJO;
        for (var color: Colores.values()) {
            if(color.ordinal() == indice) colorADevolver = color;
        }
        return colorADevolver;
    }

    public static String convertirColor(String colorRecibido){
        String colorConvertido;
        colorConvertido = colorRecibido.substring(0, 1).toUpperCase() + colorRecibido.substring(1, colorRecibido.length()).toLowerCase();
        System.out.println(colorRecibido +" pasa a --> " + colorConvertido);
        return colorConvertido;
    }

}
