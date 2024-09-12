package es.dsrima.school.reuniones.async;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import es.dsrima.school.reuniones.models.Persona;
import es.dsrima.school.reuniones.models.Reunion;
import es.dsrima.school.reuniones.services.PersonaService;
import es.dsrima.school.reuniones.services.ReunionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BuscaListener {
    private static final Logger LOG = LoggerFactory.getLogger(BuscaListener.class);

    private final ObjectMapper mapper;
    private final PersonaService personaService;
    private final ReunionService reunionService;

    public BuscaListener(ObjectMapper mapper, PersonaService personaService, ReunionService reunionService) {
        this.mapper = mapper;
        this.personaService = personaService;
        this.reunionService = reunionService;
    }

    public void recibirMensaje(String mensaje){
        try {
            InfoBusca info = mapper.readValue(mensaje, InfoBusca.class);
            Persona persona = personaService.getById(info.getIdAsistente());
            Reunion reunion = reunionService.getById(info.getIdAsistente());
            LOG.info("{} {} tiene una reunion a las {}",persona.getNombre(), persona.getApellidos(), reunion.getFecha());
        } catch (JsonProcessingException e) {
            LOG.warn("Mensaje incorrecto ", e);
        }
    }

}
