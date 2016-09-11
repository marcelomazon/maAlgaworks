/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.financeiro.entity;

import com.algaworks.financeiro.model.TipoLancamento;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author mazon
 */

@Entity
@Table(name = "lancamento")
public class Lancamento implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Long id;
    private Pessoa pessoa;
    private String descricao;
    private BigDecimal valor;
    private TipoLancamento tipo;
    private Date dataVencimento;
    private Date dataPagamento;

    
    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long ID) {
        this.id = ID;
    }
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "pessoa_id")
    public Pessoa getPessoa(){
        return pessoa;
    }
    
    public void setPessoa(Pessoa p){
        this.pessoa = p;
    }
            
    @Column(length = 60, nullable = false)
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setDescricao(String d){
        this.descricao = d;
    }
    
    @Column(precision = 10, scale = 2, nullable = false)
    public BigDecimal getValor(){
        return this.valor;
    }
    
    public void setValor(BigDecimal v){
        this.valor = v;
    }
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    public TipoLancamento getTipo (){
        return this.tipo;
    }
    
    public void setTipo(TipoLancamento t){
        this.tipo = t;
    }
    
    @Temporal(TemporalType.DATE)
    @Column(name = "dataVencimento", nullable = false)
    public Date getDataVencimento(){
        return this.dataVencimento;
    }
    
    public void setDataVencimento(Date d){
        this.dataVencimento = d;
    }
    
    @Temporal(TemporalType.DATE)
    @Column(name = "dataPagamento", nullable = false)
    public Date getDataPagamento(){
        return this.dataPagamento;
    }
    
    public void setDataPagamento(Date d){
        this.dataPagamento = d;
    }
    
}
