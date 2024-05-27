package Set.PesquisaEmSet;

import java.util.Objects;

public class Contato {

    public String Nome;
    public int NumeroTel;

    public Contato(String nome, int numeroTel) {
        Nome = nome;
        NumeroTel = numeroTel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumeroTel());
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getNumeroTel() {
        return NumeroTel;
    }

    public void setNumeroTel(int numeroTel) {
        NumeroTel = numeroTel;
    }

    @Override
    public String toString() {
        return "Nome: " + Nome + ", Número de telefone: " + NumeroTel;
    }
}
