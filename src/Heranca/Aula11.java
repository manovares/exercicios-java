package Heranca;

public class Aula11 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Maria");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(211);
        a1.setCurso("Informatica");
        a1.setIdade(21);
        a1.setSexo("M");
        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setMatricula(12223);
        b1.setNome("Jose");
        b1.setBolsa(12.75f);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
}
