package Treinos;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa2 p1 = new Pessoa2();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Joao");
        p4.setNome("Antonio");

        p1.setSexo("M");
        p2.setSexo("F");
        p2.setIdade(18);
        p3.setSalario(1580.9f);
        p4.setSetor("Estoque");




        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
