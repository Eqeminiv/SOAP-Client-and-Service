package example;

import javax.jws.WebService;

public class Person {
    String firstName, lastName;
    long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, long id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
    public Person(){

    }
}
