package Treinos;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    public void apresentar(){
        System.out.println("Nome do Lutador: " + this.nome);
        System.out.println("Nacionalidade do Lutador: " + this.nacionalidade);
        System.out.println("Idade do Lutador: " + this.idade);
        System.out.println("Altura do lutador: " + this.altura);
        System.out.println("Peso do lutador: " + this.peso);
        System.out.println("Vitorias do lutador: " + this.vitorias);
        System.out.println("Derrotas do lutador: " + this.derrotas);
        System.out.println("Empates do lutador: " + this.empates);;

    }

    public void status(){
        System.out.println(this.nome + " É lutador de peso: " + this.peso);
        System.out.println("Ganhou: " + this.vitorias + " vezes");
        System.out.println("Perdeu " + this.derrotas + " derrotas");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    public Lutador(String nacionalidade, String nome, int idade, float peso, float altura, int vitorias, int derrotas, int empates) {
        this.nacionalidade = nacionalidade;
        this.nome = nome;
        this.idade = idade;
        this.setPeso(peso);
        this.altura = altura;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2){
            this.categoria = "Invalido";
        }else if (this.peso < 70.3){
            this.categoria = "Leve";
        }else if (this.peso < 83.9){
            this.categoria = "Medio";
        }else if (this.peso < 120.5){
            this.categoria = "Pesado";
        }else {
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
