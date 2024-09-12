package es.dsrima.school.reuniones.controllers;

import es.dsrima.school.reuniones.models.Persona;
import es.dsrima.school.reuniones.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    public String getAllReuniones(Model model){
        model.addAttribute("personas", personaService.getAllPersonas());
        return "personas";
    }
}
