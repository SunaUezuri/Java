public class Aluno {
    String nome;
    float cp;
    float challenge;
    float ws;

    float getCp(){
        return + cp * 0.2f + challenge * 0.2f + ws * 0.6f;

    }
}
