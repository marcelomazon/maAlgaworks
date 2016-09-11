/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.financeiro.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author mazon
 */
public class Lancamento implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private Pessoa pessoa;
    private String descricao;
    private BigDecimal valor;
    private TipoLancamento tipo;
    private Date dataVencimento;
    private Date dataPagamento;
    
    
    public Long getId(){
        return this.id;
    }
    
    public void setId(Long id){
        this.id = id;
    }
    
    public Pessoa getPessoa(){
        return pessoa;
    }
    
    public void setPessoa(Pessoa p){
        this.pessoa = p;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setDescricao(String d){
        this.descricao = d;
    }
    
    public BigDecimal getValor(){
        return this.valor;
    }
    
    public void setValor(BigDecimal v){
        this.valor = v;
    }
    
    public TipoLancamento getTipoLancamento(){
        return this.tipo;
    }
    
    public void setTipoLancamento(TipoLancamento t){
        this.tipo = t;
    }
    
    public Date getDataVencimento(){
        return this.dataVencimento;
    }
    
    public void setDataVencimento(Date d){
        this.dataVencimento = d;
    }
    
    public Date getDataPagamento(){
        return this.dataPagamento;
    }
    
    public void setDataPagamento(Date d){
        this.dataPagamento = d;
    }
    
}
