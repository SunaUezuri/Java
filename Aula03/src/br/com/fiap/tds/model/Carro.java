package br.com.fiap.tds.model;

public class Carro {
    private String modelo;
    private int quantidadedeLugares;
    private int quantidadedePortas;
    private double comprimento;
    private int anoFabricacao;
    private Cor cor;
    private String placa;
    private float motor = 1;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidadedeLugares() {
        return quantidadedeLugares;
    }

    public void setQuantidadedeLugares(int quantidadedeLugares) {
        this.quantidadedeLugares = quantidadedeLugares;
    }

    public int getQuantidadedePortas() {
        return quantidadedePortas;
    }

    public void setQuantidadedePortas(int quantidadedePortas) {
        this.quantidadedePortas = quantidadedePortas;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }
}
