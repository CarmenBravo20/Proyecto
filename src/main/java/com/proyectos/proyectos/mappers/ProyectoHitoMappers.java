/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectos.proyectos.mappers;


import com.proyectos.proyectos.dto.ProyectoHitoDto;
import com.proyectos.proyectos.entity.ProyectoHito;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 *
 * @author Owner
 */
@Mapper(componentModel = "spring")
public interface ProyectoHitoMappers {
    @Mapping(target= "proyectoId",source="proyectoHito.proyecto.id")
    ProyectoHitoDto toDto(ProyectoHito proyectoHito);
    @Mapping(target= "proyecto.id",source="dto.proyectoId")
    ProyectoHito toEntity(ProyectoHitoDto dto);
    List<ProyectoHitoDto> toDto(List<ProyectoHito> proyectoHitos);
    List<ProyectoHito> toEntity(List<ProyectoHitoDto> proyectoHitos);
}
