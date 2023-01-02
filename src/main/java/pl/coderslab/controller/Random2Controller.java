package pl.coderslab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Random2Controller {

    @GetMapping("/random/{min}/{max}")
    public String random(
            @PathVariable int min,
            @PathVariable int max) {
        return String.valueOf(new Random().nextInt(max - min + 1) + min);
    }
}
