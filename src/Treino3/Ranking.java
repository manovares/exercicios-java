package Treino3;

import java.util.ArrayList;

public class Ranking {
    private ArrayList<Jogador> jogadores;

    public Ranking() {
        this.jogadores = new ArrayList<>();
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void addJogador(Jogador jogador) {
        this.jogadores.add(jogador);
    }

    public void removeJogador(Jogador jogador) {
        this.jogadores.remove(jogador);
    }

    public void listarJogadores() {
        System.out.println("Listando jogadores");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome() + " - " + "Pontuação " + jogador.getPontuacao() + " - " + "Nivel: " + jogador.getNivel());
        }
    }

    public void listarRanking() {
        jogadores.sort((a, b) -> b.getPontuacao() - a.getPontuacao());

        System.out.println("Listando ranking");

        for (int i = 0; i < jogadores.size(); i++) {
            Jogador jogador = jogadores.get(i);

            System.out.println((i + 1) + "º - "
                    + jogador.getNome() + " - " + "Nivel: " +
                    jogador.getNivel() + " - "
                    + jogador.getPontuacao() + " pts");
        }
    }
}