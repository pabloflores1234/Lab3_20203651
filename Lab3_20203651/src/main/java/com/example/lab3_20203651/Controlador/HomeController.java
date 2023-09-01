package com.example.lab3_20203651.Controlador;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {


    @GetMapping("/lab3")
    @ResponseBody
    public String PagPrincipal(){
        return "Vean The Bear, de las mejores series de 2023. Demasiado, pero demasiado buena.";
    }
}
