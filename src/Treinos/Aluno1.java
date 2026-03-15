package Treinos;

public class Aluno1 {
    private String nome;
    private int rm;
    private float nota;

    public Aluno1(String nome, float nota, int rm) {
        this.nome = nome;
        this.nota = nota;
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    @Override
    public String toString() {
        return "Aluno1{" +
                "nome='" + nome + '\'' +
                ", rm=" + rm +
                ", nota=" + nota +
                '}';
    }
}
