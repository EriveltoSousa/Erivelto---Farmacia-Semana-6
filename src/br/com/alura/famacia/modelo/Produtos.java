package br.com.alura.famacia.modelo;

public class Produtos {
    private int id;
    private String nome;
    private String fabricante;
    private double preço;

    public Produtos(String nome, String fabricante, double preço) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.preço = preço;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getPreço() {
        return preço;
    }
}
