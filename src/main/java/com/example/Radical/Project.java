package com.example.Radical;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Project {
    @GetMapping("/myproj")
    public String getData(){
        return "Devops is a mixture of Develoment and Operations team";
    }
}
