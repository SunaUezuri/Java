public class Cachorro {
    //Atributo
    String nome;
    float peso;
    int idade;
    boolean castrado;
    //Métodos
    void andar(){
        System.out.println(nome + " andando..");
    }

    //Método para calcular a dose de medicamento
    float calcularDose(int dosePorKg){
        float doses = peso/dosePorKg;
        return doses;
    }

    //Método que calcula a idade humana do cachorro
    int idadeHumana(){
        int idadeReal = idade * 7;
        return idadeReal;
    }


}
