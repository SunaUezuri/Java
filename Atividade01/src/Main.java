
        import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
        public class Main {
            public static void main(String[] args) {
                Scanner analise = new Scanner(System.in);
                System.out.println("insira o nome do cachorro aqui: ");
                String nome = analise.next();
                System.out.println("insira a idade do cachorro: ");
                double idade = analise.nextDouble();
                System.out.println("insira o peso do cachorro aqui: ");
                float peso = analise.nextFloat();
                System.out.println("insira a raça do seu cachorro");
                String raca = analise.next();
                System.out.println("O nome do seu cachorro é: " + nome + " ele tem " + idade + " anos, pesa " +
                        peso + "Kg e é da raça " + raca);



            }
        }

