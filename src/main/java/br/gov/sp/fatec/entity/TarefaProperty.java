package br.gov.sp.fatec.entity;

import javafx.beans.property.SimpleStringProperty;

public class TarefaProperty {
    
  private final SimpleStringProperty  id;
  
  private final SimpleStringProperty  descricao;
  
  private final SimpleStringProperty  dataInicioPrevisto;
  
  private final SimpleStringProperty  dataInicioReal;
  
  private final SimpleStringProperty  dataFimPrevisto;
  
  private final SimpleStringProperty  dataFimReal;

  public TarefaProperty(Tarefa tarefa) {
    id = new SimpleStringProperty(String.valueOf(tarefa.getId()));
    descricao = new SimpleStringProperty(tarefa.getDescricao());
    dataInicioPrevisto = new SimpleStringProperty(String.valueOf(tarefa.getDataInicioPrevisto()));
    dataInicioReal = new SimpleStringProperty(String.valueOf(tarefa.getDataInicioReal()));
    dataFimPrevisto = new SimpleStringProperty(String.valueOf(tarefa.getDataFimPrevisto()));
    dataFimReal = new SimpleStringProperty(String.valueOf(tarefa.getDataFimReal()));
  }

  public String  getId() {
    return id.get();
  }

  public void setId(String  id) {
    this.id.set(id);
  }

  public String  getDescricao() {
    return descricao.get();
  }

  public void setDescricao(String  descricao) {
    this.descricao.set(descricao);
  }

  public String  getDataInicioPrevisto() {
    return dataInicioPrevisto.get();
  }

  public void setDataInicioPrevisto(String  dataInicioPrevisto) {
    this.dataInicioPrevisto.set(dataInicioPrevisto);
  }

  public String  getDataInicioReal() {
    return dataInicioReal.get();
  }

  public void setDataInicioReal(String  dataInicioReal) {
    this.dataInicioReal.set(dataInicioReal);
  }

  public String  getDataFimPrevisto() {
    return dataFimPrevisto.get();
  }

  public void setDataFimPrevisto(String  dataFimPrevisto) {
    this.dataFimPrevisto.set(dataFimPrevisto);
  }

  public String  getDataFimReal() {
    return dataFimReal.get();
  }

  public void setDataFimReal(String  dataFimReal) {
    this.dataFimReal.set(dataFimReal);
  }

}

