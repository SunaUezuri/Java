import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String marca = "Tesla \nCarro elétrico";
        System.out.println(marca);
        JOptionPane.showMessageDialog(null, "CPF: \n12345674-88");

        //Comparar Strings
        String churros = "Chocolate";
        String churros2 = new String("chocolate");
        //Comparar se as Strings são iguais
        if (churros.equalsIgnoreCase(churros2))
            System.out.println("Churros iguais");
        else
            System.out.println("Churros diferentes");

        /**
         * Comentário de bloco
         * 
         */
    }
}