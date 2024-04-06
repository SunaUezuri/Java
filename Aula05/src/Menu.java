import javax.swing.*;

public class Menu {
    public static void main(String[] args) {
        //Calculadora: digite dois numeros e escolha a opção 1-somar, 2-subtrair, 3-multiplicar e 4-dividir

        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo  número: "));
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a operação: " +
                "\n1- somar \n2- subtrair \n3- multiplicar \n4- dividir"));

        switch (opcao){
            case 1:
                int soma = n1 + n2;
                JOptionPane.showMessageDialog(null, "Seu resultado foi: " + soma);
                break;
            case 2:
                int subtracao = n1 - n2;
                JOptionPane.showMessageDialog(null, "Seu resultado foi: " + subtracao);
                break;
            case 3:
                int multiplicacao = n1 * n2;
                JOptionPane.showMessageDialog(null, "Seu resultado foi: " + multiplicacao);
                break;
            case 4:
                int divisao = n1 / n2;
                JOptionPane.showMessageDialog(null, "Seu resultado foi: " + divisao);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Insira um valor válido");
        }
    }
}
