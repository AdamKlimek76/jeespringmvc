package pl.coderslab.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);


   // @RequestMapping("/hello")
    @GetMapping("")
    public String hello(){
        return "index";
    }

    @GetMapping("/helloBody")
    @ResponseBody
    public String helloBody(){
        return "Hello World in Body";
    }

    @GetMapping("/body")
    @ResponseBody
    public String body(){
        return "Zwraca body czyli widok";
    }


  //  @RequestMapping(value = "/mBank", produces = "text/plain;charset=UTF-8")
    @GetMapping(path = "/mbank", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String responseEncoding() {
        return "ółążźć";
    }

    @GetMapping("/log")
    @ResponseBody
    public String log(){
        //System.out.println("log println");
        log.info("Somebody requested log");
        log.debug("{}+ {} = {}", 2, 2, 4);
        return "logged";
    }

    @GetMapping("/exeption")
    @ResponseBody
    public String exeption(){
        String nullInit=null;
        try{
            nullInit.toUpperCase();
        }catch (NullPointerException e){
            log.error("Null exeption", e);

        }

        return "exeption";
    }

    @GetMapping("/helloView")
    public String helloView(){
        return "home";
    }
}
