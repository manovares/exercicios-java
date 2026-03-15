package Treinos;

public class Funcionario extends Pessoa2 {
    private String setor;
    private boolean trabalhando;

    public void mudaTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
