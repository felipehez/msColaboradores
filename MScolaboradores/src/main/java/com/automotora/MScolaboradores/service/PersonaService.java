package com.automotora.MScolaboradores.service;

import com.automotora.MScolaboradores.entity.PersonaEntity;

import java.util.List;

public interface PersonaService {

    List<PersonaEntity> buscarTodos();
    List<PersonaEntity> buscarEjecutivos();
    List<PersonaEntity> buscarClientes();
    PersonaEntity buscarPorRut(String rut);
    void ingresarEjecutivo(PersonaEntity persona);

    /*
    void eliminarEjecutivo(String id);
    void ingresarColaborador(String fecha);
    int calcularBono();
    P buscarColaboradorPorRut(String rut);
    void cambiarNivelPermiso(String permiso);
    */

}
