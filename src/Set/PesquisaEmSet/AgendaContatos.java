package Set.PesquisaEmSet;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    Set<Contato> agendaDeContatos;

    public AgendaContatos() {
        agendaDeContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        agendaDeContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        for (Contato contato : agendaDeContatos) {
            System.out.println(contato);
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> listaPesquisa = new HashSet<>();
        for (Contato contato : agendaDeContatos) {
            if(contato.getNome().startsWith(nome)){
                listaPesquisa.add(contato);
            }
        }
        return listaPesquisa;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato contato : agendaDeContatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumeroTel(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }
}
