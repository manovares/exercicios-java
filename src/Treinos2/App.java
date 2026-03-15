package Treinos2;

public class App {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();
        Livro l1 = new Livro("A morte da vida",2025,"Gustavo");
        Livro l2 = new Livro("A historia do java",2025,"Gustavo");
        Livro l3 = new Livro("A luz do java");

        b.addLivro(l1);
        b.addLivro(l2);
        b.addLivro(l3);
        b.listarLivro();
        b.removerLivro(0);
        b.atualizarLivro(1, new Livro("Luz do amanhecer",2022,"Manovares"));
        b.listarLivro();
    }
}
