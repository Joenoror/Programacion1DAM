package xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement(name="socios") //El elemento raíz se llamará socio
@XmlType(propOrder = {"socio"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Club {

    Socio[] listaSocios;

}
