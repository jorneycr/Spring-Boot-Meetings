package es.dsrima.school.reuniones.services;

import es.dsrima.school.reuniones.controllers.PersonaController;
import es.dsrima.school.reuniones.data.PersonaRepository;
import es.dsrima.school.reuniones.models.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> getAllPersonas(){
        return personaRepository.findAll();
    }
}
