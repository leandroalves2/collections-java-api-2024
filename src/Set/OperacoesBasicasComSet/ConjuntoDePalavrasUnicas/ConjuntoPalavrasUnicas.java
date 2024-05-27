package Set.OperacoesBasicasComSet.ConjuntoDePalavrasUnicas;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoPalavrasUnicas {

    public Set<String> PalavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        PalavrasUnicas = new TreeSet<>();
    }

    public void adicionarPalavra(String palavra){
        PalavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        PalavrasUnicas.remove(palavra);
    }

    public boolean verificarPalavra(String palavra) {
        return PalavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        for(String p : PalavrasUnicas){
                System.out.println(p);
        }
    }


}
