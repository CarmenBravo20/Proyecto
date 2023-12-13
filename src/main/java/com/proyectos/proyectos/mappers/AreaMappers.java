/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectos.proyectos.mappers;

import com.proyectos.proyectos.dto.AreaDto;
import com.proyectos.proyectos.entity.Area;
import java.util.List;
import org.mapstruct.Mapper;

/**
 *
 * @author Carmen
 */
@Mapper(componentModel="spring")
public interface AreaMappers {
    
    AreaDto toDto(Area area);
    Area toEntity(AreaDto dto);
    List<AreaDto>toDto(List<Area> areas);
    List<Area>toEntity(List<AreaDto> areas);
    
    
    
    
    
}
