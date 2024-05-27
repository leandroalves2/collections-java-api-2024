package List.Compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    public List<Item> carrinhoDeCompras = new ArrayList<>();

    public CarrinhoDeCompras() {
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> listaDeRemocao = new ArrayList<>();
        for (Item item : carrinhoDeCompras){
            if(item.getNome().equalsIgnoreCase(nome)){
                listaDeRemocao.add(item);
            }
        }
        carrinhoDeCompras.removeAll(listaDeRemocao);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : carrinhoDeCompras) {
            total = item.Quantidade * item.Preco;
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(carrinhoDeCompras);
    }

}