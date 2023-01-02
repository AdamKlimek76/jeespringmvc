package pl.coderslab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@Controller
public class NameDateController {

    @GetMapping(path = "/form", produces = "text/plain;charset=UTF-8")
    public String showNameDate(){
        return "nameDate";
    }

    @PostMapping(path = "/form", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String showResultNameDate(
            @RequestParam String name,
            @RequestParam String date
    ){
        LocalDate localDate = LocalDate.parse(date);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String textDate=formatter.format(localDate);
        return String.valueOf(name + " " + textDate);
    }
}
