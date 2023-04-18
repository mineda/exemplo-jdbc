package br.gov.sp.fatec.entity;

import java.time.LocalDateTime;

public class Tarefa {
    
    private Long id;
    
    private String descricao;
    
    private LocalDateTime dataInicioPrevisto;
    
    private LocalDateTime dataInicioReal;
    
    private LocalDateTime dataFimPrevisto;
    
    private LocalDateTime dataFimReal;

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

    public LocalDateTime getDataInicioPrevisto() {
        return dataInicioPrevisto;
    }

    public void setDataInicioPrevisto(LocalDateTime dataInicioPrevisto) {
        this.dataInicioPrevisto = dataInicioPrevisto;
    }

    public LocalDateTime getDataInicioReal() {
        return dataInicioReal;
    }

    public void setDataInicioReal(LocalDateTime dataInicioReal) {
        this.dataInicioReal = dataInicioReal;
    }

    public LocalDateTime getDataFimPrevisto() {
        return dataFimPrevisto;
    }

    public void setDataFimPrevisto(LocalDateTime dataFimPrevisto) {
        this.dataFimPrevisto = dataFimPrevisto;
    }

    public LocalDateTime getDataFimReal() {
        return dataFimReal;
    }

    public void setDataFimReal(LocalDateTime dataFimReal) {
        this.dataFimReal = dataFimReal;
    }

}
