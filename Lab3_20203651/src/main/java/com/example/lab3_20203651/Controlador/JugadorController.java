package com.example.lab3_20203651.Controlador;


import com.example.lab3_20203651.Entidad.Jugador;
import com.example.lab3_20203651.Entidad.Seleccion;
import com.example.lab3_20203651.Repositorio.JugadorRepository;
import com.example.lab3_20203651.Repositorio.SeleccionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JugadorController {

    final JugadorRepository jugadorRepository;
    final SeleccionRepository seleccionRepository;

    public JugadorController(JugadorRepository jugadorRepository, SeleccionRepository seleccionRepository){
        this.jugadorRepository = jugadorRepository;
        this.seleccionRepository = seleccionRepository;
    }




    @GetMapping("/lab3/jugador")
    public String listarJugadores(Model model){
        List<Jugador> listaJugadores = jugadorRepository.findAll();
        model.addAttribute("listaJugadores", listaJugadores);
        return "jugador/listJugador";
    }

    @GetMapping("/lab3/jugador/nuevo")
    public String nuevoJugador(Model model){
        List<Seleccion> listaSeleccion = seleccionRepository.findAll();
        model.addAttribute("listaSeleccion",listaSeleccion);
        return "jugador/newFormJugador";
    }

    @PostMapping("/lab3/jugador/nuevo")
    public String crearArtista(Jugador jugador){
        jugadorRepository.save(jugador);
        return "redirect:/lab3/jugador";
    }


}
