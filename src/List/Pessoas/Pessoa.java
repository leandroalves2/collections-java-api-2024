package List.Pessoas;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {

    public String Nome;
    public int Idade;
    public double Altura;

    public Pessoa(String nome, int idade, double altura) {
        Nome = nome;
        Idade = idade;
        Altura = altura;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(Idade, p.getIdade());
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    @Override
    public String toString() {
        return "Nome: " + Nome + ", Idade: " + Idade + ",  Altura: " + Altura;
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.Altura, p2.getAltura());
    }
}