import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner analise = new Scanner(System.in);
        Aluno estudante = new Aluno();

        System.out.println("Insira seu nome aqui: ");
        estudante.nome = analise.next();

        System.out.println("Insira sua nota da CP");
        estudante.cp = analise.nextFloat();

        System.out.println("Insira sua nota do Challenge: ");
        estudante.challenge = analise.nextFloat();

        System.out.println("Insira sua nota da GS: ");
        estudante.ws = analise.nextFloat();

        float mediaBimestre = estudante.getCp();
        System.out.println(estudante.nome + " sua média é: " + mediaBimestre);




    }
}
