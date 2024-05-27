import Compras.CarrinhoDeCompras;
import Tarefas.ListaTarefas;

public class Main {
    public static void main(String[] args) {

        CarrinhoDeComprasFunc();

    }

    public static void ListaTarefasFunc(){
        ListaTarefas list = new ListaTarefas();

        System.out.println("Lista atual");
        list.adicionarTarefa("Levantar");
        list.adicionarTarefa("Escovar dentes");
        list.adicionarTarefa("Fazer cafe");
        list.adicionarTarefa("Varrer casa");
        list.adicionarTarefa("Dar comida para a gata");
        list.adicionarTarefa("ligar computador");
        list.adicionarTarefa("Trabalhar");
        list.adicionarTarefa("Fazer cafe");

        list.obterDescricoesTarefas();
        System.out.println("Quantidade de itens na lista: " + list.obterNumeroTotalTarefas());

        System.out.println("");
        System.out.println("Lista sem Fazer cafe");
        list.removerTarefa("Fazer cafe");
        list.obterDescricoesTarefas();
        System.out.println("Quantidade de itens na lista: " + list.obterNumeroTotalTarefas());
    }

    public static void CarrinhoDeComprasFunc(){
        CarrinhoDeCompras compras = new CarrinhoDeCompras();

        System.out.println("Lista de compras atual");
        compras.adicionarItem("Raquete", 22.50, 1);
        compras.adicionarItem("Bolinha", 1.50, 10);
        compras.adicionarItem("Rede", 80.00, 1);
        compras.adicionarItem("Luvas", 7.90, 2);
        compras.adicionarItem("Oculos", 71.20, 1);
        compras.exibirItens();
        System.out.println("Total do carrinho: " + compras.calcularValorTotal());

        System.out.println("");
        compras.removerItem("Oculos");
        System.out.println("Lista de compras atualizada sem Oculos");
        compras.exibirItens();
        System.out.println("Total do carrinho: " + compras.calcularValorTotal());

    }

}