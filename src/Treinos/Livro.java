package Treinos;

import java.io.Serializable;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa1 leitor;

    public Livro(String autor, String titulo, Pessoa1 leitor, int totPaginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.leitor = leitor;
        this.totPaginas = totPaginas;
    }


    @Override
    public void abrir() {
        if (this.aberto == false) {
            this.aberto = true;
            System.out.println("Abrindo o Livro");
        }else {
            System.out.println("O livro esta aberto");
        }
    }

    @Override
    public void fechar() {
        if (this.aberto == true) {
            this.aberto = false;
            System.out.println("Fechando o Livro");
        }else  {
            System.out.println("O livro está fechado");
        }
    }

    @Override
    public void avancarpag() {
        this.pagAtual++;
        System.out.println("Avançando uma pagina");
    }

    @Override
    public void voltarpag() {
        this.pagAtual--;
        System.out.println("Voltando uma pagina");
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", totPaginas=" + totPaginas +
                ", pagAtual=" + pagAtual +
                ", aberto=" + aberto +
                ", leitor=" + leitor +
                '}';
    }
}
