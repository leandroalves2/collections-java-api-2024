package Set.OrdenacaoEmSet.CadastroDeProdutos;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class CadastroProdutos {

    public Set<Produto> ProdutosSet;

    public CadastroProdutos() {
        ProdutosSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        ProdutosSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(ProdutosSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(ProdutosSet);
        return produtosPorPreco;
    }
}