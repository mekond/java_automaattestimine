package util;

import data.Student;

import java.util.List;

public class Utils {
    public static void printStudentName(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.getFullName());
        }
    }
}
