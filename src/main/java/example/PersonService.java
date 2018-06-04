package example;

import example.repositories.PersonRepository;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "example.PersonServiceInterface")
public class PersonService implements PersonServiceInterface{

    PersonRepository personRepository;

    public PersonService()
    {
        personRepository = new PersonRepository();
    }

    @Override
    public Person getPerson(long id){
        for(Person p : personRepository.personList)
        {
            if (p.getId() == id)
                return p;
        }
        return null;
    }
    @Override
    public String hello(){
        System.out.println("HELLO start");
        return "hello";
    }
}
