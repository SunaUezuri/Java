import javax.swing.*;

public class TesteEleicoes {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i ++){
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));

            if (idade <16){
                JOptionPane.showMessageDialog(null, "Não eleitor");
            } else if (idade >= 18 && idade <=65){
                JOptionPane.showMessageDialog(null, "Eleitor Obrigatório");
            } else {
                JOptionPane.showMessageDialog(null, "Eleitor Facultativo");
            }
        }
    }
}
