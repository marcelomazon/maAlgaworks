/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.financeiro.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author mazon
 */

@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String nome;
    
    @Id
    @GeneratedValue
    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }
    
    @Column(length = 60, nullable = false)
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
        
}
