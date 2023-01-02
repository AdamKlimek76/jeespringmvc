package pl.coderslab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class WelcomeController {

    @GetMapping("/welcome/{firstName}/{lastName}")
    public String welcome(
            @PathVariable String firstName,
            @PathVariable String lastName) {
        return String.valueOf("Witaj " + firstName + " " + lastName);
    }

}
