import javax.swing.*;

public class Exemplo {
    public static void main(String[] args) {
        //Ler uma senha
        String senha = JOptionPane.showInputDialog("Insira uma senha: ");

        //Validar se a senha possui mais do que 8 caracteres
        if (senha.length() > 8)
            JOptionPane.showMessageDialog(null, "Senha aprovada!!!");
        else
            JOptionPane.showMessageDialog(null, "A senha deve ter mais de 8 caracteres.");

        //Ler uma hora e minuto (ex. 10:01 e transformar todos em minutos
        String horas = JOptionPane.showInputDialog("Insira um horário no formato (hh:mm)");

        //Forma 1
//        char h1 = horas.charAt(0); //Recupera o primeiro caractere (1)
//        char h2 = horas.charAt(1); //Recupera o segundo caractere (0)
//        int horario = Integer.parseInt(String.valueOf(h1) + String.valueOf(h2));
//
//        int minutos = Integer.parseInt(String.valueOf(horas.charAt(3)) + String.valueOf(horas.charAt(4)));
//        int total = horario * 60 + minutos;
//        JOptionPane.showMessageDialog(null, "Total em minutos: " + total);

        //Forma 2 - permitir os padrões com um único número e o de dois números (1:11 e 12:20)
        int posicaoDoDoisPontos = horas.indexOf(":");
        String horasString = horas.substring(0, posicaoDoDoisPontos); //Obtém a String do começo e do fim excluindo os dois pontos (:)

        String minutosString = horas.substring(posicaoDoDoisPontos + 1); //Obtém a String até o final
        int horario = Integer.parseInt(horasString);
        int minutos = Integer.parseInt(minutosString);
        int totalString = horario * 60 + minutos;

        JOptionPane.showMessageDialog(null, "Total em minutos: " + totalString);

    }
}
