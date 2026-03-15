package Treinos2;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Funcionario> funcionarios;

    public Empresa() {
        funcionarios = new ArrayList<Funcionario>();
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
        System.out.println("Funcionario adicionado com sucesso!");
    }

    public void listarFuncionarios(){
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome()
            + "\nSalario: " + funcionario.getSalario() +
            "\n Cargo: " + funcionario.getCargo());
        }
    }

    public void removerFuncionario(int indice){
        if(indice >= 0 && indice < funcionarios.size()){
            funcionarios.remove(indice);
            System.out.println("Funcionario removido com sucesso!");
        }
    }

    public void atualizarFuncionario(int indice, Funcionario funcionario){
        if(indice >= 0 && indice < funcionarios.size() | (funcionario != null)){
            funcionarios.set(indice, funcionario);
            System.out.println("Funcionario atualizado com sucesso!");
        }
    }


}
