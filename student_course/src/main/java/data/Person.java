package data;

import java.time.ZonedDateTime;

public interface Person {
    String getFirstName();
    String getLastName();
    ZonedDateTime getDateOfBirth();
    String sayHello();
    String getPrefferredName();
    long getAge();
    String getFullName();

}
