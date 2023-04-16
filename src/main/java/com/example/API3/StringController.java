package com.example.API3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/unione")
    public String stringController(@RequestParam(required = true) String s1, @RequestParam(required = false) String s2){
        if(s2 == null){
            return s1;
        }else return s1 + " " + s2;
    }

}
