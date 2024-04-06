import javax.swing.*;

public class TesteTamanho {
    public static void main(String[] args) {
        String pessoa1 = JOptionPane.showInputDialog(null, "Insira o nome da primeira pessoa: ");
        float alturaPessoa1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a altura da primeira pessoa: "));
        float pesoPessoa1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o peso da primeira pessoa: "));

        String pessoa2 = JOptionPane.showInputDialog(null, "Insira o nome da segunda pessoa: ");
        float alturaPessoa2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a altura da segunda pessoa: "));
        float pesoPessoa2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o peso da segunda.1 pessoa: "));

        if (alturaPessoa1 > alturaPessoa1 && pesoPessoa1 > pesoPessoa2){
            JOptionPane.showMessageDialog(null,  pessoa1 + " é mais alta e tem um peso maior.");
        }else if (alturaPessoa1 > alturaPessoa2 && pesoPessoa1 < pesoPessoa2){
            JOptionPane.showMessageDialog(null, "A " + pessoa1 + "é mais alta" +
                    "\nA " + pessoa2 + "é mais pesada.");
        }else if (alturaPessoa1 < alturaPessoa2 && pesoPessoa1 > pesoPessoa2){
            JOptionPane.showMessageDialog(null, "A " + pessoa2 + " é mais alta." +
                    "\nA " + pessoa1 + " é mais pesada.");
        }else if (alturaPessoa1 < alturaPessoa2 && pesoPessoa1 < pesoPessoa2) {
            JOptionPane.showMessageDialog(null, "A " + pessoa2 + " é mais alta." +
                    "\nA " + pessoa2 + " é mais pesada.");
        }else if (alturaPessoa1 == alturaPessoa2 && pesoPessoa1 > pesoPessoa2) {
            JOptionPane.showMessageDialog(null, "As duas possuem a mesma altura" +
                    "\nA " + pessoa1 + " é mais pesada.");
        }else if (alturaPessoa1 == alturaPessoa2 && pesoPessoa1 < pesoPessoa2){
            JOptionPane.showMessageDialog(null, "As duas possuem a mesma altura" +
                    "\nA " + pessoa2 + " é mais pesada.");
        } else if (alturaPessoa1 > alturaPessoa2 && pesoPessoa1 == pesoPessoa2) {
            JOptionPane.showMessageDialog(null, "A " + pessoa1 + " é a mais alta" +
                    "\nAs duas possuem o mesmo peso.");
        } else if (alturaPessoa1 < alturaPessoa2 && pesoPessoa1 == pesoPessoa2) {
            JOptionPane.showMessageDialog(null, "A " + pessoa2 + " é a mais alta" +
                    "\nAs duas possuem o mesmo peso.");
        }else {
            JOptionPane.showMessageDialog(null, "As duas possuem mesmo peso e altura.");
        }
    }
}
