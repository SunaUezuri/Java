package br.com.fiap.seguros.model.view;

import br.com.fiap.seguros.model.model.Veiculo;
import br.com.fiap.seguros.model.model.Cliente;

public class Main {
    public static void main(String[] args) {
        //instanciar o Cliente
        Cliente cliente = new Cliente("Erick");

        System.out.println(cliente.getNome());

        //Instanciar um Veiculo

        Veiculo veiculo = new Veiculo("Opala", "2350BT32", "Bege", 1.6);

        //Instanciar um novo cliente com nome, veículo e cpf
        Cliente senhor = new Cliente("Adilson", "7788899913", veiculo);

        //Exibir os dados do cliente
        System.out.println("Seu nome e CPF são: " + senhor.getNome() + " " + senhor.getCpf());
        System.out.println("Seu carro é um: " + senhor.getVeiculo().getModelo() + ", placa " +
                senhor.getVeiculo().getPlaca() + ", com cor " + senhor.getVeiculo().getCor() +
                " e motor " + senhor.getVeiculo().getMotor());
    }
}
