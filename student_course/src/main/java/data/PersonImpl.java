package data;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class PersonImpl implements Person {

    private String firstName;
    private String lastName;
    private ZonedDateTime dateOfBirth;
    private String prefferredName;
    private String fullName;

    public PersonImpl(String firstName, String lastName, ZonedDateTime dateOfBirth, String prefferredName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.prefferredName = prefferredName;
        this.fullName = firstName + lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ZonedDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPrefferredName() {
        return prefferredName;
    }

    public long getAge() {
        return ChronoUnit.YEARS.between(this.dateOfBirth, ZonedDateTime.now());
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(ZonedDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPrefferredName(String preferredName) {
        this.prefferredName = preferredName;
    }

    public String sayHello() {
        return null;
    }

    }

