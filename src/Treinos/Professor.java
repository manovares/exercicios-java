package Treinos;

public class Professor extends Pessoa2 {
    private String especialidade;
    private float salario;

    public void receberAumentp(float aumento){
        this.salario += aumento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
