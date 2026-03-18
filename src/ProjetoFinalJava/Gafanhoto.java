package ProjetoFinalJava;

import Heranca.Pessoa;

public class Gafanhoto extends Pessoa1 {
    private String login;
    private int totAssistido;

    public Gafanhoto(String sexo, String nome, int idade, String login) {
        super(sexo, nome, idade);
        this.login = login;
        this.totAssistido = 0;
    }


    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + ", login=" + login + ", totAssistido=" + totAssistido + '}';
    }
}
