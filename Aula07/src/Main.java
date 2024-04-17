import br.com.fiap.lavanderia.model.Cliente;
import br.com.fiap.lavanderia.model.Funcionario;

import java.lang.ref.Cleaner;
import br.com.fiap.lavanderia.model.Cliente;

public class Main {

    public static void main(String[] args) {
        //Instanciar um funcionário

        Funcionario f = new Funcionario();
        Cliente a = new Cliente();

        //Setar o nome e cargo do funcionário

        f.setNome("Clodoaldo");
        f.setCargo("Assistente técnico");

        System.out.println("Bem vindo funcionário " + f.getNome() + " , seu cargo é: "
        + f.getCargo());

        a.setNome("Nicole");
        a.pagar(300);
        a.setAssinante(true);
        a.pagar(300);

    }
}