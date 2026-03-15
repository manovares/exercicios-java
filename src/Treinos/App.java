package Treinos;

public class App {
    public static void main(String[] args) {
        Turma t1 = new Turma();
        Aluno1 a1 = new Aluno1("Matheus", 10, 56);
        Aluno1 a2 = new Aluno1("Samuel", 9, 30);
        Aluno1 a3 = new Aluno1("Lucas", 8, 30);

        t1.adicionarAluno(a1);
        t1.adicionarAluno(a2);
        t1.adicionarAluno(a3);

        t1.listarAlunos();
        t1.removerAluno(0);
        t1.listarAlunos();
    }
}
