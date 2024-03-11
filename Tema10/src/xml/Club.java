package xml;

import javax.xml.bind.annotation.*;
import java.util.Arrays;

@XmlRootElement(name="club") //El elemento raíz se llamará socio
@XmlType(propOrder = {"nombreClub", "listaSocios"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Club {

    @XmlElement(name = "nombre")
    private String nombreClub;

    @XmlElementWrapper(name = "socios")
    @XmlElement(name = "socio")
    private Socio[] listaSocios;

    @XmlTransient
    private String nif;
    public Club(){}
    public Club(String nombreClub, String nif){
        this.nombreClub = nombreClub;
        this.listaSocios = new Socio[0];
        this.nif = nif;
    }
    public void nuevoSocio(Socio nuevo){
        listaSocios = Arrays.copyOf(listaSocios, listaSocios.length + 1);
        listaSocios[listaSocios.length - 1] = nuevo;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(listaSocios);
    }
}