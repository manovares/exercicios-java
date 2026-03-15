package Treinos2;

public class App2 {
    public static void main(String[] args) {
        Empresa e1 = new Empresa();
        Funcionario f1 = new Funcionario("Gerente", 1567,"João");
        Funcionario f2 = new Funcionario("Dono", 10000.50f,"Manovares");
        Funcionario f3 = new Funcionario("Estagiario", 800,"Roberto");

        e1.addFuncionario(f1);
        e1.addFuncionario(f2);
        e1.addFuncionario(f3);

        e1.listarFuncionarios();
        e1.atualizarFuncionario(0, new Funcionario("Supervisor",2500,"João"));
        e1.removerFuncionario(2);
        e1.listarFuncionarios();
    }
}
