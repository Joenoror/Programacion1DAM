package FlujosDeSalida;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="contacto") //El elemento raíz se llamará socio
@XmlType(propOrder = {"nombre","telefono"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Contacto {
    @XmlElement(name = "nombre")
    String nombre;
    @XmlElement(name = "telefono")
    String telefono;

    Contacto() {}

    Contacto(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return nombre+";"+telefono;
    }
}
