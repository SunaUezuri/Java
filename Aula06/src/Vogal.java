import javax.swing.*;

public class Vogal {
    public static void main(String[] args) {
        String vogal = JOptionPane.showInputDialog("Digite uma palavra");
 //       String vogalSub = vogal.replace('a', '*')
 //               .replace('e', '*')
  //              .replace('i', '*')
  //              .replace('o', '*')
   //             .replace('u', '*');

        for (int i=0; i < vogal.length(); i++){
            char caractere = vogal.charAt(i);
            if ("aeiouAEIOU".indexOf(caractere)!= -1)
                vogal = vogal.replace(caractere, '*');
        }

        JOptionPane.showMessageDialog(null, vogal);
    }
}
