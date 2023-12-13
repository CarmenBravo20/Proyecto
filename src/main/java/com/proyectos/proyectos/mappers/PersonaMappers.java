/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectos.proyectos.mappers;


import com.proyectos.proyectos.dto.PersonaDto;
import com.proyectos.proyectos.entity.Persona;
import java.util.List;
import org.mapstruct.Mapper;

/**
 *
 * @author Carmen
 */
@Mapper(componentModel="spring")
public interface PersonaMappers {
    PersonaDto toDto(Persona persona);
    Persona toEntity(PersonaDto dto);
    List<PersonaDto>toDto(List<Persona> personas);
    List<Persona>toEntity(List<PersonaDto> personas);
}
