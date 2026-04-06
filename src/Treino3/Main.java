package Treino3;

public class Main {
    public static void main(String[] args) {
        Jogador n1 = new Jogador(0, 0, "Mariano");
        Jogador n2 = new Jogador(50, 1, "Ana");
        Jogador n3 = new Jogador(70, 2, "Maria");
        Jogador n4 = new Jogador(80, 3, "Pedro");

        n1.ganharPontos(120);

        Ranking r1 = new Ranking();
        r1.addJogador(n1);
        r1.addJogador(n2);
        r1.addJogador(n3);
        r1.addJogador(n4);

        r1.listarJogadores();

        r1.listarRanking();


    }
}
