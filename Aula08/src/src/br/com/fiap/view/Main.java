package br.com.fiap.view;
import br.com.fiap.model.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Criar um objeto do tipo livro com todos os valores
        Livro boneca = new Livro(1, "A boneca de ossos", "Terror com espírito da boneca", 30, 200,
                "Astral", "Terror", "Holly Black");

        //Calcular desconto com %
        double valorComDesconto = boneca.calcularPrecoComDesconto(20.0);
        System.out.println("Desconto com % " + valorComDesconto);

        //Calcular desconto com a quantidade
        valorComDesconto = boneca.calcularPrecoComDesconto(10);
        System.out.println("Desconto com quantidade " + valorComDesconto);

        //Calcular desconto com cupom
        valorComDesconto = boneca.calcularPrecoComDesconto("FIAPLIVRO");
        System.out.println("Desconto com cupom " + valorComDesconto);

        Produto livro2 = new Livro();
        livro2.setPreco(50);
        valorComDesconto = livro2.calcularPrecoComDesconto("FIAPLIVRO");
        System.out.println("Segundo livro com desconto " + valorComDesconto);

        System.out.println(boneca);
    }
}