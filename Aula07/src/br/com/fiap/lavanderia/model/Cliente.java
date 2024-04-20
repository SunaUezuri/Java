package br.com.fiap.lavanderia.model;

import java.lang.ref.Cleaner;

public class Cliente  extends Pessoa{

    private boolean assinante;


    public Cliente(int id, String nome, String cpf, Endereco endereco, boolean assinante){
        super(id, nome, cpf, endereco); //chamar o construtor pai
        this.assinante = assinante;
    }

    public void pagar(double valor){
        //Se for assinante tem 10% de desconto
        if (assinante) valor *= 0.9;

        //Exibir o nome e o valor a ser pago
        System.out.println("Olá " + nome
                + " o valor a ser pago é: R$"
                + valor);
    }


    public boolean isAssinante() {
        return assinante;
    }


    public void setAssinante(boolean assinante) {
        this.assinante = assinante;
    }
}
