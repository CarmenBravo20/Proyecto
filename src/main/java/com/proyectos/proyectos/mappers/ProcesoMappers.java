/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectos.proyectos.mappers;


import com.proyectos.proyectos.dto.ProcesoDto;
import com.proyectos.proyectos.entity.Proceso;
import java.util.List;
import org.mapstruct.Mapper;

/**
 *
 * @author Carmen
 */
@Mapper(componentModel="spring")
public interface ProcesoMappers {
    Proceso toEntity(ProcesoDto dto);
    List<ProcesoDto>toDto(List<Proceso> procesos);
    List<Proceso>toEntity(List<ProcesoDto> procesos);
    
}
