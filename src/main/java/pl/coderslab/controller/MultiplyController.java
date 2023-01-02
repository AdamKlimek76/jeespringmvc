package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MultiplyController {

    @GetMapping("/multiply")
    public String multiply(Model model, @RequestParam(defaultValue = "10") Integer size){

        Integer [][]multiplyArray=new Integer[size][size];

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                multiplyArray[i][j]=(i+1)*(j+1);
            }
        }
        model.addAttribute("multiplyArray", multiplyArray);

        return "multiply";
    }



}
