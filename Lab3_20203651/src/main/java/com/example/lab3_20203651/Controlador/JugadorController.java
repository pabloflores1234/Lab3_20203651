package com.example.lab3_20203651.Controlador;


import com.example.lab3_20203651.Entidad.Jugador;
import com.example.lab3_20203651.Repositorio.JugadorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class JugadorController {

    final JugadorRepository jugadorRepository;

    public JugadorController(JugadorRepository jugadorRepository){
        this.jugadorRepository = jugadorRepository;
    }

    @GetMapping("/lab3/jugador")
    public String listarJugadores(Model model){
        List<Jugador> listaJugadores = jugadorRepository.findAll();
        model.addAttribute("listaJugadores", listaJugadores);
        return "jugador/listJugador";
    }


}
