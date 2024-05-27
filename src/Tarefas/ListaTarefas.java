package Tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    public List<Tarefa> listaTarefas;

    public ListaTarefas() {
        listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasRemover = new ArrayList<>();
        for (Tarefa tarefa : listaTarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemover.add(tarefa);
            }
        }
        listaTarefas.removeAll(tarefasRemover);
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaTarefas);
    }
}
