package Treinos;

public class Contador {
    private int valor;

    public Contador(int valor) {
        this.valor = valor;
        System.out.println("Contador gerado valor: " + this.valor);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void zerarValor() {
        this.valor = 0;
        System.out.println("Contador zerado");
    }

    public void incrementarValor() {
        this.valor++;
        System.out.println("Contador incrementado valor: " + this.valor);
    }

    public int retornarValor() {
        System.out.println("Valor do contador: " + this.valor);
        return this.valor;
    }

    public static void main(String[] args) {
        Contador contador = new Contador(1);
        contador.incrementarValor();
        contador.incrementarValor();
        contador.incrementarValor();
        contador.retornarValor();
        contador.zerarValor();
        contador.retornarValor();
    }
}
