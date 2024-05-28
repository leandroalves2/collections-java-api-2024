package Map;

import Map.OperacoesBasicasComMap.AgendaDeContatos.AgendaContatos;
import Map.OrdenacaoNosMap.AgendadeEventos.AgendaEventos;
import Map.PesquisaEmMap.EstoquedeProdutosComPreco.EstoqueProdutos;

import java.time.LocalDate;
import java.time.Month;

public class MainMap {

    public static void main(String[] args) {

        AgendaEventosFunc();

    }

    public static void AgendaEventosFunc(){
        AgendaEventos agendaEventos = new AgendaEventos();
        System.out.println("Sem eventos");
        agendaEventos.exibirAgenda();
        System.out.println("");

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

        System.out.println("Exibe a agenda completa de eventos");
        agendaEventos.exibirAgenda();
        System.out.println("");

        System.out.println("Obtém e exibe o próximo evento na agenda");
        agendaEventos.obterProximoEvento();
        System.out.println("");


    }

    public static void EstoqueProdutosFunc(){
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        System.out.println("Lista vazia");
        estoqueProdutos.exibirProdutos();
        System.out.println("");

        estoqueProdutos.adicionarProduto(110, "Colher", 10, 2.00);
        estoqueProdutos.adicionarProduto(111, "Garfo", 5, 1.20);
        estoqueProdutos.adicionarProduto(112, "Faca", 5, 3.00);
        estoqueProdutos.adicionarProduto(113, "Prato", 2, 16.90);
        estoqueProdutos.adicionarProduto(114, "Copo", 6, 5.99);
        estoqueProdutos.adicionarProduto(112, "Copo Descartavel", 20, 0.99);

        System.out.println("Lista preenchida");
        estoqueProdutos.exibirProdutos();
        System.out.println("");

        System.out.println("calcular Valor Total Estoque");
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("");

        System.out.println("obter Produto Mais Caro");
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("");

        System.out.println("obter Produto Mais Barato");
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("");

        System.out.println("Retorna o produto que está em maior quantidade no estoque, considerando o valor total de cada produto (quantidade * preço).");
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
        System.out.println("");
    }

    public static void agendaContatosMapFun(){
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.removerContato("Enrique");
        System.out.println("");

        agendaContatos.adicionarContato("Leandro", 999999999);
        agendaContatos.adicionarContato("Karol", 1212121212);
        agendaContatos.adicionarContato("Karol", 888888888);
        agendaContatos.adicionarContato("Karoline", 1212121212);
        agendaContatos.adicionarContato("Wilian", 343434343);
        agendaContatos.adicionarContato("Enrique", 878787878);
        System.out.println("Lista preenchida");
        agendaContatos.exibirContatos();
        System.out.println("");

        System.out.println("Lista sem Enrique");
        agendaContatos.removerContato("Enrique");
        agendaContatos.exibirContatos();
        System.out.println("");

        System.out.println("Numedo da Karol");
        System.out.println(agendaContatos.pesquisarPorNome("Karol"));
        System.out.println("");
    }
}