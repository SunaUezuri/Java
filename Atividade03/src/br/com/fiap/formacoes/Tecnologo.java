package br.com.fiap.formacoes;

public class Tecnologo extends Formacao{

    private boolean planoEstendido = false;

    @Override
    public String toString() {
        return super.toString() + "\nPlano estendido: " + planoEstendido;
    }

    public Tecnologo(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
        super(descricao, periodo, mensalidade, duracao);
        this.planoEstendido = planoEstendido;
    }

    public boolean isPlanoEstendido() {
        return planoEstendido;
    }

    public void setPlanoEstendido(boolean planoEstendido) {
        this.planoEstendido = planoEstendido;
    }

    public double calcularMensalidade(double fator){
        return getDuracao() * fator * 600;
    }

    @Override
    public void definirDuracao() {
        duracao = 24;
    }
}
