package com.proftelran.org.homeworkdate;

//        1) создать дату своего рождения, вывести на консоль в формате "10 Января 1985"
//        2) проверить дата "10 Января 1985" - это пятница?
//        3) вычесть 10 лет из созданной даты, вывести на консоль
//        4) получить обьект Instant из "2022-12-19T06:55:30.00Z", вывести на консоль
//        5) получить ZonedDateTime из "Pacific/Midway", вывести на консоль

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static java.time.DayOfWeek.FRIDAY;

public class HomeworkDate {

    public static void main(String[] args) {
        LocalDate myBirthday = LocalDate.of(1985, 02, 03);
        System.out.println(myBirthday.getDayOfMonth() + " " + myBirthday.getMonth() + " " + myBirthday.getYear());

        boolean isFriday = checkDate(myBirthday);
        System.out.println("03.02.1985 is Friday: " + isFriday);

        LocalDate minusTen = myBirthday.minusYears(10);
        System.out.println(minusTen);

        String timeString ="2022-12-19T06:55:30.00Z";
        Instant instant = Instant.parse(timeString);
        System.out.println(instant);

        ZoneId zone = ZoneId.of("Pacific/Midway");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zone);
        System.out.println(zonedDateTime);
    }

    private static boolean checkDate(LocalDate myBirthday) {
       if (FRIDAY == myBirthday.getDayOfWeek()) {
           return true;
       }
        return false;
    }
}
