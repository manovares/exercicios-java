package Treinos;

public class Pessoa {
    private String nome;
    private float altura;
    private int dataNascimento;

    public Pessoa(String nome, float altura, int dataNascimento) {
        this.nome = nome;
        this.altura = altura;
        this.dataNascimento = dataNascimento;
        System.out.println("Nova Pessoa criada!");
    }

    public Pessoa() {
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
        System.out.println("Data de nascimento: " + dataNascimento);
    }

    public int calcularIdade() {
        int anoAtual = 2026;
        int idade = (anoAtual - this.dataNascimento);
        System.out.println("a idade da pessoa é: " + idade);
        return this.dataNascimento;

    }

    public void andar(){
        System.out.println(nome + " esta andando");
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", 1.75f, 2005);
        p1.imprimir();
        p1.calcularIdade();
        p1.andar();

        Pessoa p2 = new Pessoa("Pedro", 1.82f, 2015);
        p2.imprimir();
        p2.calcularIdade();
        p2.andar();
    }
}
