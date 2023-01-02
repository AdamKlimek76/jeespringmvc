package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ParamController {

    @GetMapping("/param")
    @ResponseBody
    public String oldParam(HttpServletRequest request){
        String age = request.getParameter("age");
        return "Maszy tyle lat " + age;
    }


    @GetMapping("/param2")
    @ResponseBody
    public String newParam(@RequestParam(defaultValue = "0") Integer age){

        return "Masz tyle lat " + age;
    }

    @GetMapping("/book/{id}")
    @ResponseBody
    public String book(@PathVariable int id){
        return "Pobrano book o id: " + id;
    }

    @GetMapping("/pattern/*")
    @ResponseBody
    public String patterns(){
        return "Przyjme po pattern";
    }

    @GetMapping("/browser")
    @ResponseBody
    public String header(@RequestHeader("user-agent") String agent){
        return "Twoj klient to: " + agent;
    }
}
