package Treinos;

import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno1> alunos;

    public Turma() {
        alunos = new ArrayList<Aluno1>();
    }

    public ArrayList<Aluno1> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno1> alunos) {
        this.alunos = alunos;
    }

    public void adicionarAluno(Aluno1 aluno){
        alunos.add(aluno);
        System.out.println("Aluno adicionado com sucesso!");
    }

    public void listarAlunos(){
        for (Aluno1 aluno : alunos){
            System.out.println(
                    "nome='" + aluno.getNome() + '\'' +
                            ", rm=" + aluno.getRm() +
                            ", nota=" + aluno.getNota() +
                            '}'
            );
        }
    }

    public void removerAluno(int indice){
        if (indice >= 0 && indice < alunos.size()){
            alunos.remove(indice);
            System.out.println("Aluno removido com sucesso!");
        }
    }

    public void atualizarAluno(int indice, Aluno1 aluno){
        if (indice >= 0 && indice < alunos.size() | (aluno != null)){
            alunos.set(indice, aluno);
            System.out.println("Aluno atualizado com sucesso!");
        }
    }


}
