/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.financeiro.bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author mazon
 */
@ManagedBean
//@RequestScoped
@ViewScoped
public class NomesBean {

    private String nome;
    private List<String> nomes = new ArrayList<>();
    
    public void adicionar(){
        this.nomes.add(nome);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public List getNomes(){
        return nomes;
    }


}
