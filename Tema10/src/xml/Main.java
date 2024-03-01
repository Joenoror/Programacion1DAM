package xml;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws JAXBException, IOException {

        JAXBContext context = JAXBContext.newInstance(Socio.class);
        Unmarshaller um = context.createUnmarshaller();
        Socio s = (Socio) um.unmarshal(new File("E:\\Salesianos\\Practicas\\Programacion1DAM\\Tema10\\src\\xml\\socio.xml"));
        System.out.println(s.toString());

        Marshaller m = context.createMarshaller();
        Socio s1 = new Socio(1, "José Enrique", "C/Salesianos 10", "01/01/1000");
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(s1, System.out);
    }
}
