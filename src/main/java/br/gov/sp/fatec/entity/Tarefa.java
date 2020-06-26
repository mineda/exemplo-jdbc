package br.gov.sp.fatec.entity;

import java.util.Date;

public class Tarefa {
    
    private Long id;
    
    private String descricao;
    
    private Date dataInicioPrevisto;
    
    private Date dataInicioReal;
    
    private Date dataFimPrevisto;
    
    private Date dataFimReal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataInicioPrevisto() {
        return dataInicioPrevisto;
    }

    public void setDataInicioPrevisto(Date dataInicioPrevisto) {
        this.dataInicioPrevisto = dataInicioPrevisto;
    }

    public Date getDataInicioReal() {
        return dataInicioReal;
    }

    public void setDataInicioReal(Date dataInicioReal) {
        this.dataInicioReal = dataInicioReal;
    }

    public Date getDataFimPrevisto() {
        return dataFimPrevisto;
    }

    public void setDataFimPrevisto(Date dataFimPrevisto) {
        this.dataFimPrevisto = dataFimPrevisto;
    }

    public Date getDataFimReal() {
        return dataFimReal;
    }

    public void setDataFimReal(Date dataFimReal) {
        this.dataFimReal = dataFimReal;
    }

}
