package com.automotora.MScolaboradores.service;
import com.automotora.MScolaboradores.entity.PersonaEntity;
import com.automotora.MScolaboradores.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    //private final ColaboradorEntity colaborador;


    @Autowired
    private PersonaRepository repository;

    @Override
    public List<PersonaEntity> buscarTodos() {
        return this.repository.findAll();
    }

    @Override
    public List<PersonaEntity> buscarEjecutivos() {
        return this.repository.findByTipo("Ejecutivo").get();
    }

    @Override
    public List<PersonaEntity> buscarClientes() {
        return this.repository.findByTipo("Cliente").get();
    }

    @Override
    public PersonaEntity buscarPorRut(String rut) {
        return this.repository.findOneByRut(rut).get();
    }

    @Override
    public void ingresarEjecutivo(PersonaEntity persona) {

    }


}
