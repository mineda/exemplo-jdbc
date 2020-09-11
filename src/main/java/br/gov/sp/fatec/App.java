package br.gov.sp.fatec;

import java.util.List;

import br.gov.sp.fatec.dao.TarefaDao;
import br.gov.sp.fatec.entity.Tarefa;
import br.gov.sp.fatec.entity.TarefaProperty;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class App extends Application {
  public static void main(String[] args) {

    Application.launch(args);

  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    
    TarefaDao tarefaDao = new TarefaDao();
    List<Tarefa> tarefas = tarefaDao.buscarTarefas();

    final ObservableList<TarefaProperty> dados = FXCollections.observableArrayList();

    for(Tarefa tarefa: tarefas) {
      dados.add(new TarefaProperty(tarefa));
    }

    TableView<TarefaProperty> tabela = new TableView<TarefaProperty>();

    TableColumn idCol = new TableColumn("Id");
    TableColumn descricaoCol = new TableColumn("Descrição");
    TableColumn dataInicioPrevistoCol = new TableColumn("Início Previsto");
    TableColumn dataInicioRealCol = new TableColumn("Início Real");
    TableColumn dataFimPrevistoCol = new TableColumn("Fim Previsto");
    TableColumn dataFimRealCol = new TableColumn("Fim Real");

    idCol.setCellValueFactory(
        new PropertyValueFactory<TarefaProperty, String>("id")
    );
    descricaoCol.setCellValueFactory(
        new PropertyValueFactory<TarefaProperty, String>("descricao")
    );
    dataInicioPrevistoCol.setCellValueFactory(
        new PropertyValueFactory<TarefaProperty, String>("dataInicioPrevisto")
    );
    dataInicioRealCol.setCellValueFactory(
        new PropertyValueFactory<TarefaProperty, String>("dataInicioReal")
    );
    dataFimPrevistoCol.setCellValueFactory(
        new PropertyValueFactory<TarefaProperty, String>("dataFimPrevisto")
    );
    dataFimRealCol.setCellValueFactory(
        new PropertyValueFactory<TarefaProperty, String>("dataFimReal")
    );

    tabela.setItems(dados);
    tabela.getColumns().addAll(idCol, descricaoCol, dataInicioPrevistoCol, 
        dataInicioRealCol, dataFimPrevistoCol, dataFimRealCol);
    tabela.setEditable(false);

    primaryStage.setTitle("Tarefas");
    primaryStage.setWidth(800);
    primaryStage.setHeight(400);

    Scene primaryScene = new Scene(tabela);
    primaryStage.setScene(primaryScene);

    primaryStage.show();

  }
}
