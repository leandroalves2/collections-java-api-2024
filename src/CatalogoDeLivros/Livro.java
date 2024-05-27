package CatalogoDeLivros;

import java.util.Date;

public class Livro {
    public String Titulo;
    public String Autor;
    public int Ano;

    public Livro(String titulo, String autor, int ano) {
        Titulo = titulo;
        Autor = autor;
        Ano = ano;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        Ano = ano;
    }

    @Override
    public String toString() {
        return  "Titulo='" + Titulo + ", Autor='" + Autor + ", Ano=" + Ano;
    }
}
