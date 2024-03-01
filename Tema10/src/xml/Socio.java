package xml;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="socio") //El elemento raíz se llamará socio
@XmlType(propOrder = {"nombreSocio","direccion","fechaAlta"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Socio {
    @XmlAttribute(name = "id", required = true)
    private Integer identificacion;
    @XmlElement(name = "nombre")
    private String nombreSocio;
    private String direccion;
    @XmlElement(name = "alta")
    private String fechaAlta;

    public Socio(){}
    public Socio(Integer identificacion, String nombreSocio, String direccion, String fechaAlta){
        this.identificacion = identificacion;
        this.nombreSocio = nombreSocio;
        this.direccion = direccion;
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        String cad ="{id=" + identificacion
                +", nombre=" + nombreSocio
                +", direccion=" + direccion
                +", alta =" + fechaAlta + "}";
        return cad;
    }
}
