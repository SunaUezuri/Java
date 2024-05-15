package br.com.fiap.formacoes;

//Classe abstrata -> não pode ser instanciada
public abstract class Formacao {

    protected String descricao;
    private int periodo;
    private double mensalidade;
    protected int duracao;

    @Override
    public String toString() {
        return  "\nDescrição do curso: " + descricao +
                "\nPeriodo: " + periodo +
                "\nMensalidade: " + mensalidade +
                "\nDuração: " + duracao;
    }

    public Formacao(String descricao, int periodo, double mensalidade, int duracao) {
        this.descricao = descricao;
        this.periodo = periodo;
        this.mensalidade = mensalidade;
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public int getDuracao() {
        return duracao;
    }


    //Método abstrato, sem imlementação
    public abstract void definirDuracao();

    public double calcularMedia(double checkpoint1, double checkpoint2, double checkpoint3){
        double media = 0;
        if (checkpoint1 >= checkpoint2 && checkpoint3 >= checkpoint2){
            media = (checkpoint1 + checkpoint3) / 2;
        } else if (checkpoint1 >= checkpoint3 && checkpoint2 >= checkpoint3) {
            media = (checkpoint1 + checkpoint2) / 2;
        } else {
            media = (checkpoint2 + checkpoint3) / 2;
        }
        return media;
    }

    public double calcularMedia(double global1, double global2){
        return global1 * 0.4 + global2 * 0.6;
    }

    public double calcularMedia(double global1, double checkpoint1, double challenge1,
                                double global2, double checkpoint2, double challenge2){
        double semestre1 = global1 * 0.6 + checkpoint1 * 0.2 + challenge1 * 0.2;
        double semestre2 = global2 * 0.6 + checkpoint2 * 0.2 + challenge2 * 0.2;
        return semestre1 * 0.4 + semestre2 * 0.6;
    }

}
