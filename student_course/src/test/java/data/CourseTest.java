package data;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import services.PublicHolidayService;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.ZonedDateTime;

public class CourseTest {
    ZonedDateTime startDate = ZonedDateTime.parse("2020-03-01T00:00:00.000+00:00[UTC]");
    ZonedDateTime endDate = ZonedDateTime.parse("2020-03-16T00:00:00.000+00:00[UTC]");
    ZonedDateTime dateOfBirth = ZonedDateTime.parse("1980-03-20T00:00:00.000+00:00[UTC]");
    Teacher teacher = new Teacher("Mame", "Kiik", dateOfBirth,"NIMI");


    @Mock
    private PublicHolidayService publicHolidayService;

    @InjectMocks
    Course course = new Course("K2sit66", 2, startDate, endDate,teacher);

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void dayLengtht() {
        //given
        long expectedResult = 11L;

        //when
        long result = course.getLenghth();

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    public void negativeDays() {
        startDate = ZonedDateTime.parse("2020-06-01T00:00:00.000+00:00[UTC]");

        //given
        Course course = new Course("K2sit66", 2, startDate, endDate,teacher);
        long expectedResult = -50L;

        //when
        long result = course.getLenghth();

        //then
        assertEquals(expectedResult, result);

    }
    @Test
    public void returnZeroDays() {
        startDate = ZonedDateTime.parse("2020-02-01T00:00:00.000+00:00[UTC]");
        endDate = ZonedDateTime.parse("2020-02-01T00:00:00.000+00:00[UTC]");

        //given
        Course course = new Course("K2sit66", 2, startDate, endDate,teacher);
        long expectedResult = 0;

        //when
        long result = course.getLenghth();

        //then
        assertEquals(expectedResult, result);
    }
}