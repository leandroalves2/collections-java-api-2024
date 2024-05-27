package Set.OperacoesBasicasComSet.ConjuntoDeConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    Set<Convidado> listaDeConvidados;

    public ConjuntoConvidados() {
        listaDeConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        listaDeConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoPararemover = null;
        for(Convidado convidado: listaDeConvidados){
            if(convidado.CodigoConvite == codigoConvite){
                convidadoPararemover = convidado;
                break;
            }
        }
        listaDeConvidados.remove(convidadoPararemover);
    }

    public int contarConvidados(){
        return listaDeConvidados.size();
    }

    public void exibirConvidados() {
        for (Convidado convidado : listaDeConvidados) {
            System.out.println(convidado);
        }
    }
}