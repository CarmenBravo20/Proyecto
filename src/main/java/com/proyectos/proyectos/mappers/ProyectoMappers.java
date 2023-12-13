/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectos.proyectos.mappers;

import com.proyectos.proyectos.dto.ProyectoDto;
import com.proyectos.proyectos.entity.Proyecto;
import java.util.List;
import org.mapstruct.Mapper;

/**
 *
 * @author Carmen
 */
@Mapper(componentModel = "spring", uses = {AreaMappers.class, PersonaMappers.class, ProcesoMappers.class})
public interface ProyectoMappers {

    ProyectoDto toDto(Proyecto proyecto);
    Proyecto toEntity(ProyectoDto dto);
    List<ProyectoDto> toDto(List<Proyecto> proyectos);
    List<Proyecto> toEntity(List<ProyectoDto> proyectos);

}
