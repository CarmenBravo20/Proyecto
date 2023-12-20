/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectos.proyectos.repository;

import com.proyectos.proyectos.entity.ProyectoHito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Owner
 */
@Repository
public interface ProyectoHitoRepository extends JpaRepository<ProyectoHito, Integer>{
    
}
