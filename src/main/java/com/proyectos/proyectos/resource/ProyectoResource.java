/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectos.proyectos.resource;

import com.proyectos.proyectos.dto.ProyectoDto;
import com.proyectos.proyectos.services.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Carmen
 */

@RestController
public class ProyectoResource {
    
    @Autowired//inyectar
    private ProyectoService ProyectoService;
    
    @RequestMapping(value = "consultarProyectos", method = RequestMethod.GET)
    public ResponseEntity<?> consultarProyectos() {
        return new ResponseEntity<>(ProyectoService.consultarProyectos(), HttpStatus.OK);
    }
    
    @RequestMapping(value = "guardarProyecto", method = RequestMethod.POST)
    public ResponseEntity<?> guardarProyecto(@RequestBody ProyectoDto dto) {
        return new ResponseEntity<>(ProyectoService.guardarProyecto(dto), HttpStatus.OK);
    }
}
