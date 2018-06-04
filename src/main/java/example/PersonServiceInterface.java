package example;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface PersonServiceInterface {
    @WebMethod
    public Person getPerson(long id);
    @WebMethod
    public String hello();
}
