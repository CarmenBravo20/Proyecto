/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectos.proyectos.services;

import com.proyectos.proyectos.dto.ProcesoDto;
import com.proyectos.proyectos.entity.Proceso;
import com.proyectos.proyectos.mappers.ProcesoMappers;
import com.proyectos.proyectos.repository.ProcesoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carmen
 */
@Service
public class ProcesoService {
    @Autowired
    private ProcesoRepository repository;
    @Autowired
    private ProcesoMappers procesoMapper;
    
    public List<ProcesoDto> consultarProcesos(){
        List<Proceso> Proceso=repository.findAll();
        List<ProcesoDto> procesosDtos=procesoMapper.toDto(Proceso);
 
        return procesosDtos;
    
    }
}

