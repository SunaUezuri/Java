package br.com.fiap;
import br.com.fiap.tds.model.livro.Editora;
import br.com.fiap.tds.model.livro.Livro;
import br.com.fiap.tds.model.produto.Produto;


public class Main {
    public static void main(String[] args) {
        Editora harperCollins = new Editora();

        harperCollins.setNome("HarperCollins");
        harperCollins.setEndereco("R. da Quitanda, 86 - Centro, Rio de Janeiro - RJ, 20091-005");

        Livro pequenoPrincipe = new Livro(23, "O Pequeno Príncipe", harperCollins);

        System.out.println("Temos à venda o livro " + pequenoPrincipe.getTitulo() + " da editora "
                + pequenoPrincipe.getEditora().getNome() + " por apenas R$40,00");
    }
}
