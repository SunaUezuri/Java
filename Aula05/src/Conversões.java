public class Conversões {
    public static void main(String[] args) {
        //byte, short, int, long
        //float, double

        byte digito = 1;
        int digitoInt = digito;

        int numero = 1;
        byte numeroByte = (byte) numero; //int maior que byte
                          //Forçando o cast desta maneira pode haver perda de precisão

        float nota = 10;
        double notaDouble = nota;

        double preco = 5;
        float precoFloat = (float) preco; //float maior que double
    }
}
