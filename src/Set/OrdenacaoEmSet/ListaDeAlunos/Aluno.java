package Set.OrdenacaoEmSet.ListaDeAlunos;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {

    public long matricula;
    public String nome;
    public double nota;

    public Aluno(long matricula, String nome, double nota) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno alunos)) return false;
        return getMatricula() == alunos.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}

class ComparatorPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}
