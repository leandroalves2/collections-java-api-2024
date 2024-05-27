package Set.OrdenacaoEmSet.ListaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    public Set<Aluno> AlunosSetList;

    public GerenciadorAlunos() {
        AlunosSetList = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        AlunosSetList.add(new Aluno(matricula, nome, media));
    }

    public void removerAluno(long matricula){
        for(Aluno aluno:AlunosSetList){
            if(aluno.getMatricula() == matricula){
                AlunosSetList.remove(aluno);
                break;
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> AlunosPorNome = new TreeSet<>(AlunosSetList);
        return AlunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> AlunosPorNota = new TreeSet<>(new ComparatorPorNota());
        AlunosPorNota.addAll(AlunosSetList);
        return AlunosPorNota;
    }

    public void exibirAlunos(){
        for(Aluno aluno:AlunosSetList){
            System.out.println(aluno);
        }
    }
}