package Set.OrdenacaoEmSet;

import Set.OrdenacaoEmSet.CadastroDeProdutos.CadastroProdutos;
import Set.OrdenacaoEmSet.ListaDeAlunos.GerenciadorAlunos;

public class MainOrdenacao {
    public static void main(String[] args) {

        CadastroProdutosFunc();

    }

    public static void CadastroProdutosFunc(){

        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        System.out.println("Lista vazia");
        System.out.println(cadastroProdutos.ProdutosSet);
        System.out.println("");

        cadastroProdutos.adicionarProduto(001, "Sabonete", 1.50, 2);
        cadastroProdutos.adicionarProduto(002, "Creme Dental", 4.59, 1);
        cadastroProdutos.adicionarProduto(003, "Escova de dentes", 8.90,2);
        cadastroProdutos.adicionarProduto(004, "Toalha", 24.49, 2);
        System.out.println("Lista atualizada");
        System.out.println(cadastroProdutos.ProdutosSet);
        System.out.println("");

        System.out.println("Lista por Nome");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println("");

        System.out.println("Lista por Preco");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        System.out.println("");


    }

    public static void GerenciadorAlunosFunc(){
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        System.out.println("Lista vazia");
        gerenciadorAlunos.exibirAlunos();
        System.out.println("");

        gerenciadorAlunos.adicionarAluno("Leandro", 1001L, 10);
        gerenciadorAlunos.adicionarAluno("Celisa",1002L, 8);
        gerenciadorAlunos.adicionarAluno("Luis", 1003L, 7);
        gerenciadorAlunos.adicionarAluno("Luis", 1003L, 7);
        gerenciadorAlunos.adicionarAluno("Karoline",1004L, 10);
        System.out.println("Lista Preenchida");
        gerenciadorAlunos.exibirAlunos();
        System.out.println("");

        System.out.println("exibir Alunos Por Nome");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println("");

        System.out.println("exibir Alunos Por Nota");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
        System.out.println("");

        gerenciadorAlunos.removerAluno(1002);
        System.out.println("Lista Com Celisa removida");
        gerenciadorAlunos.exibirAlunos();
        System.out.println("");
    }

}