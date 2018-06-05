package example;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface PersonServiceInterface {
    @WebMethod
    public Person getPerson(long id);
    @WebMethod
    public String hello();
    @WebMethod
    public void addPerson(Person p);
    @WebMethod
    public List<Person> getAllPersons();
}
