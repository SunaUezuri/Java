package br.com.fiap.seguros.model.view;
import br.com.fiap.seguros.model.model.Funcionario;
import br.com.fiap.seguros.model.model.Profissao;


public class Executar {

    //Classes
    public static void main(String[] args) {

        //Profissão instanciada
        Profissao cto = new Profissao("CTO");

        //Funcionário instanciado
        Funcionario funcionario = new Funcionario(55489, "Letícia", cto);
        funcionario.setSalario(85000.00);

        //Exibir os dados

        System.out.println(funcionario.exibirDados());
    }
}
