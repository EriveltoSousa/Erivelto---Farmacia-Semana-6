package br.com.alura.famacia.service;
public class Produto {

    private int id;
    private String nome;
    private String fabricante;
    private double preço;

    public Produto(String nome,String fabricante, double preço) {
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
