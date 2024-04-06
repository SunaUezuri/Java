import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Ler duas notas
        String notaStr1 = JOptionPane.showInputDialog("Digite uma nota: ");
        //Converter a String em float
        float nota1 = Float.parseFloat(notaStr1);

        float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite uma segunda nota: "));

        //Calcular a média
        float media = (nota1 + nota2) / 2;

        //Exibir a nota
        JOptionPane.showMessageDialog(null, "Média " + media);

        //Exibir se o aluno passou de ano, ficou de exame ou DP
        //Acima de 6 passou de ano
        //Entre 4 e 5,9 fica de exame
        //Abaixo de 4 fica de DP

        if (media >= 6){
            JOptionPane.showMessageDialog(null, "Parabéns!!! Você passou de ano com média "
                    + media);
        } else if (media < 6 && media >= 4){
            JOptionPane.showMessageDialog(null, "Infelizmente você ficou de exame " +
                    "devido a sua média "
                    + media);
        } else {
            JOptionPane.showMessageDialog(null, "Sentimos informar mas você ficou de DP" +
                    " devido sua média " + media);
        }
    }
}
