/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectos.proyectos.services;


import com.proyectos.proyectos.dto.ProyectoDto;
import com.proyectos.proyectos.entity.Proyecto;
import com.proyectos.proyectos.entity.ProyectoHito;
import com.proyectos.proyectos.mappers.ProyectoHitoMappers;
import com.proyectos.proyectos.mappers.ProyectoMappers;
import com.proyectos.proyectos.repository.ProyectoHitoRepository;

import com.proyectos.proyectos.repository.ProyectoRepository;
import java.util.Date;
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
    @Autowired
    private ProyectoHitoMappers hitoMapper;
    @Autowired
    private ProyectoHitoRepository hitoRepository;
    

    public List<ProyectoDto> consultarProyectos() {
        List<Proyecto> proyectos = repository.findAll();
        return mapper.toDto(proyectos);
    }

    public ProyectoDto guardarProyecto(ProyectoDto dto) {
        Proyecto proyecto = mapper.toEntity(dto);
        if (proyecto.getFechaCreacion() == null) {
            proyecto.setFechaCreacion(new Date());
        }
        proyecto.setEstado("A".charAt(0));
        if (proyecto.getUsuarioCreacion() == null) {
            proyecto.setUsuarioCreacion("admin");
        }
       
        proyecto = repository.save(proyecto);
        if(dto.getHitos()!=null&& dto.getHitos().isEmpty()){
            List<ProyectoHito> hitos=hitoMapper.toEntity(dto.getHitos());
            for(ProyectoHito ph:hitos){
                ph.setProyecto(proyecto);
                
            }
            hitoRepository.saveAll(hitos);
        }
        return mapper.toDto(proyecto);
    }

}
