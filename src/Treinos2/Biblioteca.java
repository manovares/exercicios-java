package Treinos2;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<Livro>();
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public void addLivro(Livro livro){
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso");
    }

   public void listarLivro(){
        for(Livro livro : livros){
            System.out.println("Livro: "+livro.getTitulo()
                                +"\nAutor: "+livro.getAutor()
                                + "\n Ano: "+livro.getAno());
        }
   }

   public void removerLivro(int indice){
        if(indice >= 0 && indice < livros.size()){
            livros.remove(indice);
            System.out.println("Livro removido com sucesso");
        }
   }

   public void atualizarLivro(int indice, Livro livro){
        if(indice >= 0 && indice < livros.size() | (livro != null)){
            livros.set(indice, livro);
            System.out.println("Livro atualizado com sucesso");
        }
   }


}
