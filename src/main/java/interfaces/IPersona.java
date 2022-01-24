package interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{

}
