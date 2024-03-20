package view;

import br.com.fiap.tds.model.Aviao;
import br.com.fiap.tds.model.Carro;
import br.com.fiap.tds.model.Cor;

public class exercicio {
    public static void main(String[] args) {
        Carro unocomEscada = new Carro();
        Cor prata = new Cor();
        prata.alterarCor(20, 12, 231, "Prata");


        unocomEscada.setModelo("Uno");
        unocomEscada.setQuantidadedePortas(4);
        unocomEscada.setQuantidadedeLugares(5);
        unocomEscada.setComprimento(3.2);
        unocomEscada.setAnoFabricacao(1987);
        unocomEscada.setCor(prata);
        unocomEscada.setPlaca("210rt30");
        unocomEscada.setMotor(1);

        System.out.println("Seu carro é do modelo: " + unocomEscada.getModelo() + ". Ele tem "
                + unocomEscada.getQuantidadedePortas() + " e " + unocomEscada.getQuantidadedeLugares() + ". Mede: "
        + unocomEscada.getComprimento() + ", foi fabricado em " + unocomEscada.getAnoFabricacao()
                + " é da cor " + unocomEscada.getCor().getNome() + ". Tem a placa: " + unocomEscada.getPlaca() +
                " e motor é do modelo " + unocomEscada.getMotor());
    }
}
