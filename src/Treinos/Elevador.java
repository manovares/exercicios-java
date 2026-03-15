package Treinos;

import java.util.List;

public class Elevador {
    private int andarAtual;
    private int andares;
    public int proximoAndar;
    private int capacidade;
    private int pessoas;
    private int pessoasPresentes;

    public Elevador(int capacidade, int pessoasPresentes, int andares, int andarAtual) {
        this.capacidade = capacidade;
        this.pessoasPresentes = pessoasPresentes;
        this.andares = andares;
        this.andarAtual = andarAtual;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }


    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andarAtual) {
        this.andares = andares;
    }

    public int sobe(int proximoAndar) {
        if (proximoAndar < andares) {
            andarAtual = proximoAndar;
            System.out.println("Elevador subiu para: " + proximoAndar);
        }else{
            System.out.println("Não temos esse andar");
        }
        return andarAtual;
    }

    public int desce(int proximoAndar) {
        if (proximoAndar > 0 || andarAtual != proximoAndar) {
            andarAtual = proximoAndar;
        }else{
            System.out.println("O predio não contem Subsolo");
        }
        return andarAtual;
    }

    public int entra(int pessoas) {
        if (pessoas + this.pessoasPresentes > capacidade) {
            System.out.println("Não temos espaço suficiente");
        }else{
            System.out.println(pessoas + " pessoas entrou no elevador");
            pessoasPresentes = pessoasPresentes + pessoas;
        }
        return pessoasPresentes;
    }

    public int sai(int pessoas){
        if (pessoasPresentes > 0 || pessoas <= pessoasPresentes) {
            pessoasPresentes = pessoasPresentes - pessoas;
            System.out.println("Saiu um total de " + pessoas + " pessoas");
        }else{
            System.out.println("Não saiu tinha ninguem no elevador");
        }
        return pessoasPresentes;
    }

    public static void main(String[] args) {
        Elevador e1 = new Elevador(8,0,12,0);
        e1.entra(5);
        e1.sobe(8);
        e1.entra(6);
        e1.sobe(12);
        e1.sai(4);
        e1.desce(0);
    }

}
