package br.gov.sp.fatec.controller;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ResourceBundle;

import br.gov.sp.fatec.dao.TarefaDao;
import br.gov.sp.fatec.entity.Tarefa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class TarefaController implements Initializable{

    @FXML
    private Button buttonCadastrar;

    @FXML
    private TableColumn<Tarefa, String> clnDescricao;

    @FXML
    private TableColumn<Tarefa, LocalDateTime> clnFimPrevisto;

    @FXML
    private TableColumn<Tarefa, LocalDateTime> clnFimReal;

    @FXML
    private TableColumn<Tarefa, Long> clnId;

    @FXML
    private TableColumn<Tarefa, LocalDateTime> clnInicioPrevisto;

    @FXML
    private TableColumn<Tarefa, LocalDateTime> clnInicioReal;

    @FXML
    private DatePicker dataHoraFimPrevisto;

    @FXML
    private DatePicker dataHoraInicioPrevisto;

    @FXML
    private TextField descricao;

    @FXML
    private Label labelDescricao;

    @FXML
    private Label labelFimPrevisto;

    @FXML
    private Label labelInicioPrevisto;

    @FXML
    private TableView<Tarefa> tableTarefa;

    @FXML
    void cadastrarTarefa(ActionEvent event) {
      TarefaDao tarefaDao = new TarefaDao();
      tarefaDao.nova(descricao.getText(), 
        dataHoraInicioPrevisto.getValue().atStartOfDay(), 
        dataHoraFimPrevisto.getValue().atStartOfDay());
      atualizar();
    }

    public void atualizar() {
      ObservableList<Tarefa> dados = FXCollections.observableArrayList();

      TarefaDao tarefaDao = new TarefaDao();
      List<Tarefa> tarefas = tarefaDao.buscarTarefas();

      for(Tarefa tarefa: tarefas) {
        dados.add(tarefa);
      }

      tableTarefa.setItems(dados);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
      clnId.setCellValueFactory(new PropertyValueFactory<Tarefa, Long>("id"));
      clnDescricao.setCellValueFactory(new PropertyValueFactory<Tarefa, String>("descricao"));
      clnInicioPrevisto.setCellValueFactory(new PropertyValueFactory<Tarefa, LocalDateTime>("dataInicioPrevisto"));
      clnFimPrevisto.setCellValueFactory(new PropertyValueFactory<Tarefa, LocalDateTime>("dataFimPrevisto"));
      clnInicioReal.setCellValueFactory(new PropertyValueFactory<Tarefa, LocalDateTime>("dataInicioReal"));
      clnFimReal.setCellValueFactory(new PropertyValueFactory<Tarefa, LocalDateTime>("dataFimReal"));

      atualizar();
    }

}

