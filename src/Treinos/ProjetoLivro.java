package Treinos;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa1[] p = new Pessoa1[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa1("Pedro","M",22);
        p[1] = new Pessoa1("Maria","F",23);

        l[0] = new Livro("Marcelo", "Aprendendo java", p[0] , 300 );

    }
}
