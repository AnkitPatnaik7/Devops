package com.example.Radical;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bus_ticket {
    @GetMapping("/mybus")
    public String getData() {
        return "Please book a Bus Ticket";
    }
}

