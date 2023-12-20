/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectos.proyectos.mappers;

import com.proyectos.proyectos.dto.PropositoDto;
import com.proyectos.proyectos.entity.Proposito;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 *
 * @author Owner
 */

@Mapper(componentModel = "spring")
public interface PropositoMappers {
    @Mapping(target= "objetivoId",source="Proposito.proyecto.id")
    PropositoDto toDto(Proposito Proposito);
    @Mapping(target= "proyecto.id",source="dto.objetivoId")
    Proposito toEntity(PropositoDto dto);
    List<PropositoDto> toDto(List<Proposito> Propositos);
    List<Proposito> toEntity(List<PropositoDto> Propositos);

}

