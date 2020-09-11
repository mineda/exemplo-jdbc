package br.gov.sp.fatec;

import java.util.List;

import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import br.gov.sp.fatec.dao.TarefaDao;
import br.gov.sp.fatec.entity.Tarefa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TarefaDao tarefaDao = new TarefaDao();
        List<Tarefa> tarefas = tarefaDao.buscarTarefas();
        SwingUtilities.invokeLater(() -> {
            GraficoGantt example = new GraficoGantt("Gráfico de Gantt", tarefas);
            example.setSize(800, 400);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);
         });
    }
}
