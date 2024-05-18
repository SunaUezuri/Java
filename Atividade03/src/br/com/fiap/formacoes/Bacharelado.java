package br.com.fiap.formacoes;

public class Bacharelado extends Formacao{

    private String projetoConclusao;
    private int cargaHorariaEstagio;

    @Override
    public String toString() {
        return super.toString() + "\nProjeto para conclusão: " + projetoConclusao +
                "\nCarga horária para o estágio";
    }

    public Bacharelado(String descricao, TipoPeriodo periodo,
                       String projetoConclusao, int cargaHorariaEstagio) {
        super(descricao, periodo);
        this.projetoConclusao = projetoConclusao;
        this.cargaHorariaEstagio = cargaHorariaEstagio;
    }

    public String getProjetoConclusao() {
        return projetoConclusao;
    }

    public void setProjetoConclusao(String projetoConclusao) {
        this.projetoConclusao = projetoConclusao;
    }

    public int getCargaHorariaEstagio() {
        return cargaHorariaEstagio;
    }

    public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
        this.cargaHorariaEstagio = cargaHorariaEstagio;
    }

    @Override
    public void definirDuracao() {
        if (descricao.toUpperCase().contains("ENGENHARIA")){
            duracao = 60;
        }else {
            duracao = 48;
        }
    }

    public double calcularMensalidade(double fator){
        return mensalidade = (duracao * fator * 600) + (cargaHorariaEstagio * 12);
    }


}
