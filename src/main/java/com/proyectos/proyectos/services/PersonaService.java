/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectos.proyectos.services;


import com.proyectos.proyectos.dto.PersonaDto;
import com.proyectos.proyectos.entity.Persona;
import com.proyectos.proyectos.mappers.PersonaMappers;
import com.proyectos.proyectos.repository.PersonaReporsitory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carmen
 */
@Service
public class PersonaService {
    
    @Autowired
    private PersonaReporsitory repository;
      @Autowired
    private PersonaMappers personaMapper;
    
    public List<PersonaDto> consultarPersonas(){
        List<Persona> persona=repository.findAll();
        List<PersonaDto> personasDtos=personaMapper.toDto(persona);
        return personasDtos;
    
    }
    
}
