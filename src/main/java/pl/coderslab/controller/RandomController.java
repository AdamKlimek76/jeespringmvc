package pl.coderslab.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {
    private static final Logger log = LoggerFactory.getLogger(RandomController.class);

    @GetMapping(path = "/showRandom", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String showRandom(){
        Random random=new Random();
        int randNumber = random.nextInt(101);
        return "Wylosowano liczbę " + randNumber;
    }



}
