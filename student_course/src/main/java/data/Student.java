package data;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class Student extends PersonImpl{

    public Student(String firstName, String lastName, ZonedDateTime dateOfBirth, int age, String prefferredName) {
        super(firstName, lastName, dateOfBirth, prefferredName);
    }

    ArrayList<Course> courses;

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public List<String> showAllTeachersNames() {

        List<String> teachersNames = new ArrayList<String>();

        for (Course course : this.courses) {
            teachersNames.add(course.getTeacher().getLastName());
        }

        return teachersNames;
    }

}
