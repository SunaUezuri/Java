import br.com.fiap.lavanderia.model.Cliente;
import br.com.fiap.lavanderia.model.Funcionario;

import java.lang.ref.Cleaner;
import br.com.fiap.lavanderia.model.Cliente;

public class Main {

    public static void main(String[] args) {
        //Instanciar um funcionário

        Funcionario f = new Funcionario(12, "Renan", "555555555", null, "Estagiário",
                1.400);

        //Setar o nome e cargo do funcionário

        f.setNome("Clodoaldo");
        f.setCargo("Assistente técnico");





    }
}