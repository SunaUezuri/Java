public class Conta {

    public String numero;
    private double saldo;

    public void depositar(double valor){
        saldo+= valor;
    }

    public void sacar(double valor){
        if (statusChequeEspecial)
            saldo-= valor;

       else if(saldo<valor)
            System.out.println("Pobre");
       
        else
            saldo-= valor;

    }

    private boolean statusChequeEspecial = false;




}
