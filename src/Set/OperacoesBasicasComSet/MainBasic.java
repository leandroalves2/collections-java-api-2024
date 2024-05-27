package Set.OperacoesBasicasComSet;

import Set.OperacoesBasicasComSet.ConjuntoDeConvidados.ConjuntoConvidados;
import Set.OperacoesBasicasComSet.ConjuntoDePalavrasUnicas.ConjuntoPalavrasUnicas;

public class MainBasic {
    public static void main(String[] args) {

        ConjuntoConvidadosFunc();

    }

    public static void ConjuntoConvidadosFunc(){
        ConjuntoConvidados listaDeConvidados = new ConjuntoConvidados();

        listaDeConvidados.exibirConvidados();
        System.out.println(listaDeConvidados.contarConvidados());
        System.out.println("");

        listaDeConvidados.adicionarConvidado("Karol", 123);
        listaDeConvidados.adicionarConvidado("Karol", 159);
        listaDeConvidados.adicionarConvidado("Wilian", 456);
        listaDeConvidados.adicionarConvidado("Luis", 789);
        listaDeConvidados.adicionarConvidado("Celisa", 147);
        listaDeConvidados.adicionarConvidado("Kevin", 258);
        listaDeConvidados.adicionarConvidado("Enrique", 369);
        listaDeConvidados.adicionarConvidado("Karol", 123);
        System.out.println("Lista: ");
        listaDeConvidados.exibirConvidados();
        System.out.println(listaDeConvidados.contarConvidados());
        System.out.println("");

        System.out.println("Lista sem o convite 258: ");
        listaDeConvidados.removerConvidadoPorCodigoConvite(258);
        listaDeConvidados.exibirConvidados();
        System.out.println(listaDeConvidados.contarConvidados());
    }

    public static void ConjuntoPalavrasUnicasFunc(){
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        System.out.println("Conjunto inicial:");
        conjunto.adicionarPalavra("Aluminio");
        conjunto.adicionarPalavra("Pandora");
        conjunto.adicionarPalavra("Açafrão");
        conjunto.adicionarPalavra("Beterrava");
        conjunto.adicionarPalavra("Pandora");
        conjunto.exibirPalavrasUnicas();
        System.out.println("");

        System.out.println("Conjunto sem a Beterrava:");
        conjunto.removerPalavra("Beterrava");
        conjunto.exibirPalavrasUnicas();
        System.out.println("");

        System.out.println("A palavra Açafrão existe no conjunto?");
        System.out.println(conjunto.verificarPalavra("Açafrão"));
        System.out.println("A palavra Bola existe no conjunto?");
        System.out.println(conjunto.verificarPalavra("Bola"));
        System.out.println("");

    }

}