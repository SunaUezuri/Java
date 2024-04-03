package br.com.fiap.seguros.model.model;

public class Profissao {

    private String nome;

    //Construtores

    public Profissao(){}
    public Profissao(String nome){
        this.nome = nome;
    }

    //Getters and Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
