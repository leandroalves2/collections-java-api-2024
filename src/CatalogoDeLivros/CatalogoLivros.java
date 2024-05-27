package CatalogoDeLivros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogoLivros {

    List<Livro> ListaDeLivros;

    public CatalogoLivros() {
        ListaDeLivros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        ListaDeLivros.add(livro);
    }

    public void pesquisarPorAutor(String autor){
        List<Livro> listaPesquisa = new ArrayList<>();
        if(!ListaDeLivros.isEmpty()) {
                for (Livro livro : ListaDeLivros) {
                    if (livro.Autor.equalsIgnoreCase(autor))
                        listaPesquisa.add(livro);
                }
                System.out.println(listaPesquisa);
        }
    }

    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listaPesquisa = new ArrayList<>();
        if(!ListaDeLivros.isEmpty()) {
            for (Livro livro : ListaDeLivros) {
                if (livro.Ano >= anoInicial && livro.Ano <= anoFinal) {
                    listaPesquisa.add(livro);
                }
            }
        }
        listaPesquisa.sort((Livro l1, Livro l2) -> Integer.compare(l1.Ano, l2.Ano));
        for (Livro livro : listaPesquisa) {
            System.out.println(livro);
        }
    }

    public void pesquisarPorTitulo(String titulo){
        if(!ListaDeLivros.isEmpty()) {
            for (Livro livro : ListaDeLivros) {
                if (livro.Titulo == titulo)
                    System.out.println(livro);
            }
        }
    }

    public void listaDeLivros(){
        for(Livro livro : ListaDeLivros){
            System.out.println(livro);
        }
    }
}
