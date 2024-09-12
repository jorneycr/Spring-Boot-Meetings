package es.dsrima.school.reuniones.controllers;

import es.dsrima.school.reuniones.models.Persona;
import es.dsrima.school.reuniones.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class PersonasRestController {
    @Autowired
    private PersonaService personaService;

    @GetMapping
    public List<Persona> getAllPersonas(){
        return  personaService.getAllPersonas();
    }
}
