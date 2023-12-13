/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectos.proyectos.services;

import com.proyectos.proyectos.dto.AreaDto;
import com.proyectos.proyectos.entity.Area;
import com.proyectos.proyectos.mappers.AreaMappers;
import com.proyectos.proyectos.repository.AreaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carmen
 */
@Service
public class AreaService {
    @Autowired
    private AreaRepository repository;
    @Autowired
    private AreaMappers areaMapper;
    
    public List<AreaDto> consultarAreas(){
        List<Area> area=repository.findAll();
        List<AreaDto> areasDtos=areaMapper.toDto(area);
        /*for(Area a: areas){
            AreaDto dto=new AreaDto();
            dto.setId(a.getId());
            dto.setDescripcion(a.getDescripcion());
            areasDtos.add(dto);
           
    }*/
        return areasDtos;
    
    }
}
