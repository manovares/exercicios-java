package Treino3;

public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(int pontuacao, int nivel, String nome) {
        this.pontuacao = pontuacao;
        this.nivel = nivel;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void ganharPontos(int pontos){
        this.pontuacao += pontos;
        subirDeNivel();
    }

   public void subirDeNivel(){
        if(pontuacao >= 100){
            nivel++;
            pontuacao = 0;
        }
   }
}
