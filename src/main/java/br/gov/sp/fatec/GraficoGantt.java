package br.gov.sp.fatec;

import java.util.List;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.IntervalCategoryDataset;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;

import br.gov.sp.fatec.entity.Tarefa;

public class GraficoGantt extends JFrame {
    
    private static final long serialVersionUID = 1L;

    public GraficoGantt(String title, List<Tarefa> tarefas) {
       super(title);
       // Create dataset
       IntervalCategoryDataset dataset = getCategoryDataset(tarefas);
     
       // Create chart
       JFreeChart chart = ChartFactory.createGanttChart(
             "Gantt", // Chart title
             "Tarefas", // X-Axis Label
             "Linha do tempo", // Y-Axis Label
             dataset);

       ChartPanel panel = new ChartPanel(chart);
       setContentPane(panel);
    }

    private IntervalCategoryDataset getCategoryDataset(List<Tarefa> tarefas) {

       TaskSeries series1 = new TaskSeries("Estimado");
       for(Tarefa tarefa: tarefas) {
           series1.add(new Task(tarefa.getDescricao(), tarefa.getDataInicioPrevisto(), tarefa.getDataFimPrevisto()));
               
       }
       
       TaskSeries series2 = new TaskSeries("Real");
       for(Tarefa tarefa: tarefas) {
           if(tarefa.getDataInicioReal() != null && tarefa.getDataFimReal() != null) {
               series2.add(new Task(tarefa.getDescricao(), tarefa.getDataInicioReal(), tarefa.getDataFimReal()));
           }
       }
       TaskSeriesCollection dataset = new TaskSeriesCollection();
       dataset.add(series1);
       dataset.add(series2);
       return dataset;
    }


}
