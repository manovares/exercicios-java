package Treinos2;

public class ContaBancaria {

    private String nomeCliente;
    private float saldo;
    private float numeroConta;

    public boolean sacar(float valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado. Saldo atual: " + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    public boolean depositar(float valor) {
        if (valor <= 0) {
            System.out.println("Valor insuficiente");
            return false;
        }else  {
            saldo += valor;
            System.out.println("Saldo realizado. Saldo atual: " + saldo);
            return true;
        }
    }
}

