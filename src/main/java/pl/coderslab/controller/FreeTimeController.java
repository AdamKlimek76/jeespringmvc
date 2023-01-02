package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

@Controller
public class FreeTimeController {

    private int weekDayNumber=6;
    private int currentHour=18;

    Calendar calendar = Calendar.getInstance();
    Date getTime=calendar.getTime();
    String getTimeStr=getTime.toString();
    String currentWeekDay=getTimeStr.substring(0, 3);
    LocalDateTime localDateTime=LocalDateTime.now();
    DayOfWeek day=localDateTime.getDayOfWeek();


    @GetMapping(path = "/showTimeInfo", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String showTimeInfo() {
        if (weekDayNumber == 6 | weekDayNumber == 7) {
            return "Wolne " + currentWeekDay + day;
        } else if (weekDayNumber < 6 && weekDayNumber > 0) {
            if (currentHour < 9 | currentHour > 17) {
                return "Po pracy";
            } else if (currentHour >= 9 && currentHour <= 17) {
                return "Pracuje, nie dzwoń!";
            } else {
                return "Bład godziny";
            }
        } else {
            return "Błąd godziny";
        }
    }

}
