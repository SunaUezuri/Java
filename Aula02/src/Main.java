public class Main {
    public static void main(String[] args) {
        //Criar um objeto para representar um cachorro
        Cachorro dogBelga = new Cachorro();
        //Atribuir valores aos atributos do objeto
        dogBelga.nome = "Spike";
        dogBelga.peso = 30;
        dogBelga.idade = 6;
        dogBelga.castrado = true;
        //Exibir os dados do objeto cachorro
        System.out.println(dogBelga.nome + ", tem " + dogBelga.idade + " anos," +
                "pesa " + dogBelga.peso + " Kg e é castrado? " + dogBelga.castrado);

        //Criar um outro objeto cachorro
        Cachorro cao = new Cachorro();

        //Atribuir outros valores
        cao.nome = "Brutus";
        cao.peso = 40;
        cao.idade = 2;
        cao.castrado = false;

        //Exibir os valores do outro objeto
        System.out.println(cao.nome + ", tem " + cao.idade + " anos," +
                "pesa " + cao.peso + " Kg e é castrado? " + cao.castrado);

        //Chamar os métodos
        cao.andar();
        dogBelga.andar();

        //Chamar o método da dose de 1 remédio a cada 7Kg
        float doseBelga = cao.calcularDose(7);
        System.out.println("Doses necessárias: " + doseBelga);

        float doseCao = cao.calcularDose(5);
        System.out.println("Doses necessárias: " + doseCao);

        //Calcular idade e exibir a humana

        int idadeCao = cao.idadeHumana();
        System.out.println("A idade é: " + idadeCao);

        int idadeBelga = dogBelga.idadeHumana();
        System.out.println("A idade é: " + idadeBelga);

    }
}