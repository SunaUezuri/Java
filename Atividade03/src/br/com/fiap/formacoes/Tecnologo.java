package br.com.fiap.formacoes;

public class Tecnologo extends Formacao{

    private boolean planoEstendido = false;

    @Override
    public String toString() {
        return super.toString() + "\nPlano estendido: " + planoEstendido;
    }

    public Tecnologo(String descricao, TipoPeriodo periodo, boolean planoEstendido) {
        super(descricao, periodo);
        this.planoEstendido = planoEstendido;
    }

    public boolean isPlanoEstendido() {
        return planoEstendido;
    }

    public void setPlanoEstendido(boolean planoEstendido) {
        this.planoEstendido = planoEstendido;
    }

    @Override
    public void definirDuracao() {
        duracao = 24;
    }

    public double calcularMensalidade(double fator){
        return mensalidade =  duracao * fator * 600;
    }


}
