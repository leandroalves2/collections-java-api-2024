package Map.OperacoesBasicasComMap.AgendaDeContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    public Map<String, Integer> agendaContatosMap;

    public AgendaContatos(){
        agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
        else
            System.out.println("LISTA VAZIA");
    }

    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer  numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()) {
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }
}