package data;

import services.PublicHolidayService;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Course {

    String name;
    Integer EAP;
    ZonedDateTime startDate;
    ZonedDateTime endDate;
    Teacher teacher;
    PublicHolidayService publicHolidayService = new PublicHolidayService();

    public Course(String name, Integer EAP, ZonedDateTime startDate, ZonedDateTime endDate, Teacher teacher) {
        this.name = name;
        this.EAP = EAP;
        this.startDate = startDate;
        this.endDate = endDate;
        this.teacher = teacher;
    }

    public long getLenghth() {
        LocalDate start = startDate.toLocalDate();
        LocalDate end = endDate.toLocalDate().plusDays(1);

        int startWeek = start.getDayOfWeek().getValue();
        int endWeek = end.getDayOfWeek().getValue();

        long days = ChronoUnit.DAYS.between(start, end);
        long result = days - 2 * (days / 7); //remove weekends

        if (days % 7 != 0) { //deal with the rest days
            if (startWeek == 7) {
                result -= 1;
            } else if (endWeek == 7) {  //they can't both be Sunday, otherwise rest would be zero
                result -= 1;
            } else if (endWeek < startWeek) { //another weekend is included
                result -= 2;
            }
        }
        return result - publicHolidayService.getPublicHolidaysOnWorkdays(startDate, endDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEAP() {
        return EAP;
    }

    public void setEAP(Integer EAP) {
        this.EAP = EAP;
    }

    public ZonedDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(ZonedDateTime startDate) {
        this.startDate = startDate;
    }

    public ZonedDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(ZonedDateTime endDate) {
        this.endDate = endDate;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}