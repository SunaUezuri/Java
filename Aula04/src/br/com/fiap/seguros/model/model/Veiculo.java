package br.com.fiap.seguros.model.model;

public class Veiculo {

    private String modelo;
    private String placa;
    private String cor;
    private double motor;

    //Criar o construtor com todos os atributos

    public Veiculo(String modelo, String placa, String cor, double motor){
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.motor = motor;
    }

    //Criar um construtor padrão

    public Veiculo(){}

    public String getModelo() {
        return modelo;
    }

    //Getters and Setters

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }
}
