package example.client;

import example.Person;
import example.PersonServiceInterface;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class TestClient {
    public static void main(String[] args) throws Exception {
        URL wsdlUrl = new URL("http://localhost:8000/service?wsdl");
        QName qname = new QName("http://example/","PersonServiceService");
        Service service = Service.create(wsdlUrl, qname);
        PersonServiceInterface personServiceInterface = service.getPort(PersonServiceInterface.class);
        personServiceInterface.addPerson(new Person("New","Persona", personServiceInterface.getAllPersons().size()+1));
        System.out.println(personServiceInterface.hello());
        System.out.println(personServiceInterface.getPerson(1).getLastName());
        List<Person> temp = personServiceInterface.getAllPersons();
        for(Person p : temp)
        {
            System.out.println(p.getLastName()+" " +p.getId());
        }
    }
}
