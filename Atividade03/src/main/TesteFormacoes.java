package main;

import br.com.fiap.formacoes.Bacharelado;
import br.com.fiap.formacoes.Medio;
import br.com.fiap.formacoes.Tecnologo;
import br.com.fiap.formacoes.TipoPeriodo;

import javax.swing.*;

public class TesteFormacoes {
    public static void main(String[] args) {
        //Pedir para o usuário escolher qual formação será preenchida
        String op = JOptionPane.showInputDialog("Digite a formação (Medio, Tecnologo, Bacharelado):");
        String descricao = JOptionPane.showInputDialog("Digite a descrição: ");
        TipoPeriodo periodo = TipoPeriodo.valueOf(
                JOptionPane.showInputDialog("Digite o período(MANHA, TARDE, NOITE, PERIODO_INTEGRAL):"));


        if (op.equalsIgnoreCase("Medio")){

            String tipo = JOptionPane.showInputDialog("Digite o tipo:");
            //instanciar um objeto
            Medio medio = new Medio(descricao, periodo, tipo);

            //Definir a duração
            medio.definirDuracao();

            //Calcular a mensalidade
            medio.calcularMensalidade(0.8);

            //Exibir dados do objeto
            JOptionPane.showMessageDialog(null, medio);
        } else if (op.equalsIgnoreCase("Tecnologo")) {

        boolean planoEstendido = Boolean.parseBoolean(JOptionPane.showInputDialog("Plano estendido?(true, false): "));

            Tecnologo tecnologo = new Tecnologo(descricao, periodo, planoEstendido);

            tecnologo.definirDuracao();

            tecnologo.calcularMensalidade(1);

            JOptionPane.showMessageDialog(null, tecnologo);
        }else {
            String projeto = JOptionPane.showInputDialog("Qual o projeto a ser concluído?: ");
            int estagio = Integer.parseInt(JOptionPane.showInputDialog("Qual a carga horário do estágio obrigatório?: "));

            Bacharelado bacharel = new Bacharelado(descricao, periodo, projeto, estagio);

            bacharel.definirDuracao();
            bacharel.calcularMensalidade(1.1);

            JOptionPane.showMessageDialog(null, bacharel);
        }
    }
}
