/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.financeiro.bean;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author mazon
 */

//@Named("ola")
//@javax.faces.bean.ManagedBean
@ManagedBean(name = "ola")

public class OlaBean {

    private String nome;
    private String sobrenome;
    private String nomeCompleto;

    public void dizerOla() {
        this.nomeCompleto = this.nome.toUpperCase() + " "
                + this.sobrenome.toUpperCase();
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto(){
        return this.nomeCompleto;
    }
    
}
