package data;

import java.time.ZonedDateTime;

public class Teacher extends PersonImpl {

    public Teacher(String firstName, String lastName, ZonedDateTime dateOfBirth, String preferredName) {
        super(firstName, lastName, dateOfBirth, preferredName);
    }
    @Override
    public String sayHello(){
        return "Hello %SAMPLE TEXT%";
    }
}
