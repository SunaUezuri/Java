package br.com.fiap.seguros.model.model;

public class Cliente {

    private String nome;
    private Veiculo veiculo;
    private String cpf;

    //Metodo construtor, não tem retorno (nem void) e possui o mesmo nome da classe.
    public Cliente(String nome){
        this.nome = nome;
    }

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    //Construtor padrão
    public Cliente(){}

    //Criar um construtor com todos os atributos
    public Cliente(String nome, String cpf, Veiculo veiculo){
        this(nome, cpf); //Chamando o construtor que recebe o nome e o cpf.
        this.veiculo = veiculo;
    }

    //Getters and Setters (ALT+INSERT)


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
