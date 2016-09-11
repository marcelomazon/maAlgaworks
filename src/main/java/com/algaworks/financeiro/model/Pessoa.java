/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.financeiro.model;

import java.io.Serializable;

/**
 *
 * @author mazon
 */
public class Pessoa implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String nome;
    
    public Long GetId(){
        return this.id;
    }
    
    public void SetId(Long id){
        this.id = id;
    }
    
    public String GetNome(){
        return this.nome;
    }
    
    public void SetNome(String nome){
        this.nome = nome;
    }
            
}
