import javax.swing.*;

public class Maiuscula {
    public static void main(String[] args) {
        //Ler a String

        String palavra = JOptionPane.showInputDialog("Insira uma palavra: ");

        //Mostra em maiusculo

        JOptionPane.showMessageDialog(null, palavra.toUpperCase());
    }
}
