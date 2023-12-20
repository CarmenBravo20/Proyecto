/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectos.proyectos.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.Table;

/**
 *
 * @author Owner
 */
@Entity
@Table(name = "proposito")
public class Proposito extends CamposAuditoria {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String indicador;
    private String formaCalculo;
    private String medioVerificacion;
    
    @JoinColumn(name = "proyecto", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Proyecto proyecto;

    public Proposito() {
    }
    
 

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

  

    
    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }

    public String getFormaCalculo() {
        return formaCalculo;
    }

    public void setFormaCalculo(String formaCalculo) {
        this.formaCalculo = formaCalculo;
    }

    public String getMedioVerificacion() {
        return medioVerificacion;
    }

    public void setMedioVerificacion(String medioVerificacion) {
        this.medioVerificacion = medioVerificacion;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

   
    
    
    
}
