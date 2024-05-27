package Set.OperacoesBasicasComSet.ConjuntoDeConvidados;

import java.util.Objects;

public class Convidado {

    public String Nome;
    public int CodigoConvite;

    public Convidado(String nome, int codigoConvite) {
        Nome = nome;
        CodigoConvite = codigoConvite;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getCodigoConvitee() {
        return CodigoConvite;
    }

    public void setCodigoConvite(int codigoConvite) {
        CodigoConvite = codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return CodigoConvite == convidado.CodigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(CodigoConvite);
    }

    @Override
    public String toString() {
        return "Convidado: " + Nome + ", Código: "  + CodigoConvite;
    }
}