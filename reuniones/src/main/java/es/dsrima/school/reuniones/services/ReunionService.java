package es.dsrima.school.reuniones.services;

import es.dsrima.school.reuniones.data.ReunionRepository;
import es.dsrima.school.reuniones.models.Reunion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReunionService {
    private final ReunionRepository reunionRepository;

    public ReunionService(ReunionRepository reunionRepository) {
        this.reunionRepository = reunionRepository;
    }

    public List<Reunion> getAllReuniones(){
        return reunionRepository.findAll();
    }

    public Reunion getById(long id){
        return reunionRepository.findById(id).get();
    }
}
