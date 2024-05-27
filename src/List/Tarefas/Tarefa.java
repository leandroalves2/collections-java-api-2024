package List.Tarefas;

public class Tarefa {
    public String Descricao;

    public Tarefa(String descricao) {
        Descricao = descricao;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    @Override
    public String toString() {
        return Descricao;
    }
}
