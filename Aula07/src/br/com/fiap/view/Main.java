package br.com.fiap.view;
import br.com.fiap.veiculo.model.*;

public class Main {
    public static void main(String[] args) {
        //Instanciar uma Cor
        Cor amarelo = new Cor(255, 255, 0, "amarelo");

        //Instanciar um Carro

        Carro camaro = new Carro("Camaro", 5, 4.8,
                2014, amarelo, 2, "D0C31GU4L",
                6);

        //Exibir alguns dados do carro
        System.out.println("Agora eu fiquei doce, igual caramelo, tô tirando onda de " +
                camaro.getModelo() + " " + camaro.getCor().getNome());
    }
}
