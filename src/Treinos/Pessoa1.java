package Treinos;

public class Pessoa1 {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa1(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int fazerAniversario(){
        this.idade++;
        System.out.println(this.nome + "Fez aniversario agora sua idade é" + this.idade);
        return this.idade;
    }
}
