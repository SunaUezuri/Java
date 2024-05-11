package br.com.fiap.formacoes;

public class Medio extends Formacao{

    private String tipo;

    @Override
    public String toString() {
        return super.toString() + "\nTipo: " + tipo;
    }

    public Medio(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
        super(descricao, periodo, mensalidade, duracao);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double calcularMensalidade(double fator) {
        return getDuracao() * fator * 500;
    }

}
