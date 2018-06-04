package example.client;

import example.PersonServiceInterface;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class TestClient {
    public static void main(String[] args) throws Exception {
        URL wsdlUrl = new URL("http://localhost:8000/service?wsdl");
        QName qname = new QName("http://example/","PersonServiceService");
        Service service = Service.create(wsdlUrl, qname);
        PersonServiceInterface personServiceInterface = service.getPort(PersonServiceInterface.class);
        System.out.println(personServiceInterface.hello());
        System.out.println(personServiceInterface.getPerson(1).getLastName());
    }
}
