package com.automotora.MScolaboradores.controller;
import com.automotora.MScolaboradores.entity.PersonaEntity;
import com.automotora.MScolaboradores.service.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin(value = {})
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService service;

    @GetMapping
    public ResponseEntity<?> obtenerPersonas() {  // funcionando =)
        ResponseEntity<?> response;
        try {
            List<PersonaEntity> personas = this.service.buscarTodos();
            response = new ResponseEntity<>(personas, HttpStatus.OK);
        } catch(Exception ex) {
            log.error(ex.getMessage(), ex);
            response = new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return response;
    }

    @GetMapping("/ejecutivos")
    public ResponseEntity<?> obtenerEjecutivos() {  // funcionando =)
        ResponseEntity<?> response;
        try {
            List<PersonaEntity> ejecutivos = this.service.buscarEjecutivos();
            response = new ResponseEntity<>(ejecutivos, HttpStatus.OK);
        } catch(Exception ex) {
            log.error(ex.getMessage(), ex);
            response = new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return response;
    }
    @GetMapping("/{rut}")
    public ResponseEntity<?> getPorRut(@PathVariable String rut) {
        ResponseEntity<?> response;
        System.out.println("El rut: "+rut);
        try {
            PersonaEntity persona = this.service.buscarPorRut(rut);
            response = new ResponseEntity<>(persona, HttpStatus.OK);
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            response = new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return response;
    }
/*
    @GetMapping("/rut")
    public ResponseEntity<?> getPorRut(@RequestParam String rut){
        ResponseEntity<?> response;

        PersonaEntity persona =this.service.buscarEjecutivoPorRut(rut);
        response = new ResponseEntity<>(persona, HttpStatus.OK);
        return response;
       // return new ColaboradorEntity("rut");
    }

    @GetMapping("/rut")
    public ResponseEntity<?> obtenerColaboradorPorRut(@RequestParam String rut) {
        ResponseEntity<?> response;
        try {
            ColaboradorEntity colaborador = this.service.buscarColaboradorPorRut(rut);
            response = new ResponseEntity<>(colaborador, HttpStatus.OK);
        } catch (Exception ex){
            Log.error(ex.getMessage(), ex);
            response = new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return response;
*/
}
