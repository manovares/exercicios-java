package Treinos;

public class Conta {
    private int numeroConta;
    private double saldo;
    private String nome;

    public Conta(int numeroConta, double saldo, String nome) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.nome = nome;
        System.out.println("Nova conta criada!");
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if(saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! saldo atual: " + saldo);
        }else  {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
            System.out.println("Depositado com sucesso!" + saldo);
        }else  {
            System.out.println("Valor de deposito invalido!");
        }
    }

    public static void main(String[] args) {
        Conta c1 = new Conta(1,1,"Joao");
        c1.depositar(12);
        c1.sacar(5);

        Conta c2 = new Conta(2,2,"Maria");
        c2.sacar(10);
    }
}
