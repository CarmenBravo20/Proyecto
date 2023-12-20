/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectos.proyectos.services;

import com.proyectos.proyectos.dto.PropositoDto;

import com.proyectos.proyectos.entity.Proposito;

import com.proyectos.proyectos.mappers.PropositoMappers;

import com.proyectos.proyectos.repository.PropositoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Owner
 */

@Service
public class PropositoService {
        @Autowired
    private PropositoRepository repository;
    @Autowired
    private PropositoMappers mapper;
    
    public List<PropositoDto> consultarProposito(){
        List<Proposito> propositos=repository.findAll();
        return mapper.toDto(propositos);
        
    }
    
    public PropositoDto guardarProposito(PropositoDto dto) {
        Proposito proposito = mapper.toEntity(dto);
        proposito = repository.save(proposito);
        return mapper.toDto(proposito);
    }
    
}
