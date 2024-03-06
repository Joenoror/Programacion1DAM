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


//        //CLUB
//        JAXBContext context = JAXBContext.newInstance(Club.class);
//        Unmarshaller um = context.createUnmarshaller();
//        Club c = (Club) um.unmarshal(new File(".\\Tema10\\src\\xml\\club.xml"));
//        System.out.println(c.toString());
//
//
//        Marshaller m = context.createMarshaller();
//        Club c1 = new Club("Profesores", "1234");
//        Socio s1 = new Socio(1, "José Enrique", "C/Salesianos 10", "01/01/1000");
//        Socio s2 = new Socio(2, "Juan Carlos", "C/Salesianos 11", "01/01/2000");
//        c1.nuevoSocio(s1);
//        c1.nuevoSocio(s2);
//        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//        m.marshal(c1, new FileWriter(".\\Tema10\\src\\xml\\club.xml"));

        //SOCIOS
        JAXBContext context = JAXBContext.newInstance(Socio.class);
        Unmarshaller um = context.createUnmarshaller();
        Socio s = (Socio) um.unmarshal(new File(".\\Tema10\\src\\xml\\socio.xml"));
        System.out.println(s.toString());

        Marshaller m = context.createMarshaller();
        Socio s1 = new Socio(1, "José Enrique", "C/Salesianos 10", "01/01/1000");
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(s1, System.out);
    }
}
