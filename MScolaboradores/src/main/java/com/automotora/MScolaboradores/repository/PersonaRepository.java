package com.automotora.MScolaboradores.repository;
import com.automotora.MScolaboradores.entity.PersonaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Repository
public interface PersonaRepository extends MongoRepository<PersonaEntity, Serializable> {

    Optional<PersonaEntity> findOneByRut(String rut);
    Optional<List<PersonaEntity>> findByTipo(String tipo);

}
