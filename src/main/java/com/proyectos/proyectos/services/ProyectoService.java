/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectos.proyectos.services;


import com.proyectos.proyectos.dto.ProyectoDto;
import com.proyectos.proyectos.entity.Proyecto;
import com.proyectos.proyectos.mappers.ProyectoMappers;
import com.proyectos.proyectos.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carmen
 */
@Service
public class ProyectoService {
    @Autowired
    private ProyectoRepository repository;
    @Autowired
    private ProyectoMappers mapper;
    
    public List<ProyectoDto> consultarProyectos(){
        List<Proyecto> proyectos=repository.findAll();
        return mapper.toDto(proyectos);
        
    }
    
    public ProyectoDto guardarProyecto(ProyectoDto dto) {
        Proyecto proyecto = mapper.toEntity(dto);
        proyecto = repository.save(proyecto);
        return mapper.toDto(proyecto);
    }
   
    
}
