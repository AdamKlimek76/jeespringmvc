package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller
public class SessionController {

    @GetMapping("/session")
    @ResponseBody
    public String loginStart(HttpSession httpSession){
        Object loginStart = httpSession.getAttribute("loginStart");
        if(loginStart==null){
            loginStart= LocalDateTime.now();
            httpSession.setAttribute("loginStart", loginStart);
        }

        return String.valueOf(loginStart);
    }

}
