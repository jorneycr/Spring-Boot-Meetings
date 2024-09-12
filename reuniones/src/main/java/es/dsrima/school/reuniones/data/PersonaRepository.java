package es.dsrima.school.reuniones.data;

import es.dsrima.school.reuniones.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
