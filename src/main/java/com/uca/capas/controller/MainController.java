package com.uca.capas.controller;
import com.uca.capas.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/agergarUsuario")
    public String enviarForm(Usuario usuario){
        return "agregarUsuario";
    }
    @PostMapping("/agregarUsuario")
        public String procesarForm(Usuario usuario){

        return "mostrarMensaje";
        }

}
