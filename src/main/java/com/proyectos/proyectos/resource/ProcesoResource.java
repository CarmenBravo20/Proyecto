/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectos.proyectos.resource;

import com.proyectos.proyectos.services.ProcesoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Carmen
 */
@RestController
public class ProcesoResource {
    @Autowired//inyectar
    private ProcesoService service;
            
    @RequestMapping(value = "consultarProceso", method = RequestMethod.GET)
    public ResponseEntity<?> consultarProceso() {
        return new ResponseEntity<>(service.consultarProcesos(), HttpStatus.OK);
}
}
