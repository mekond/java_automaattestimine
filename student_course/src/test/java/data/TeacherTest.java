package data;

import  org.junit.Test;
import util.Utils;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;

public class TeacherTest {
    //given
    ZonedDateTime birthdate_teacher1 = ZonedDateTime.parse("1978-05-21T00:00:00.000+00:00[UTC]");
    Teacher teacher1 = new Teacher("Kalle", "Karu", birthdate_teacher1, "Typo");

    @Test
    public void TestSaysHello() {
        //when
        String expected_result = "Hello %SAMPLE TEXT%";
        //then
        assertEquals(teacher1.sayHello(), expected_result);
    }
}

