package br.com.fiap.formacoes;

public class Medio extends Formacao{

    private String tipo;

    @Override
    public String toString() {
        return super.toString() + "\nTipo: " + tipo;
    }

    public Medio(String descricao, TipoPeriodo periodo, String tipo) {
        super(descricao, periodo);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void definirDuracao() {
        duracao = 36;
    }

    public double calcularMensalidade(double fator) {
        return mensalidade = duracao * fator * 500;
    }
}
