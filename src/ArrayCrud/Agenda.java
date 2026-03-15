package ArrayCrud;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	//atributo de classe - lista
	private List<Contato> contatos;
	
	//construtor
	public Agenda() {
		contatos = new ArrayList<Contato>();
		System.out.println("--- Lista CRIADA ---");
	}
	
	//inserir
	public void adicionar(Contato contato) {
		contatos.add(contato);
		System.out.println("Contato Adicionado!");
	}
	
	//listar
	public void listar() {
		
		for (Contato contato : contatos) {
			//System.out.println(contato.toString());
		
			
			//ou
			System.out.println("---------------------------------");
			System.out.println(
					"Nome: " + contato.getNome() + "\n"
					+ "Telefone: " + contato.getTelefone() + "\n" 
					+ "Email: " + contato.getEmail() + "\n"
					);
			
		}
	}
	
	//remover
	public void remover(int indice) {
		if(indice >= 0 && indice <contatos.size()) {
			contatos.remove(indice);
			System.out.println("Contato removido!");
		}
		
	}
	
	//atualizar
	public void atualizar(int indice, Contato contato) {
		if (indice >= 0 && indice <contatos.size() || (contato != null)) {
			contatos.set(indice, contato);
			System.out.printf("O contato %s foi alterado", contato.getNome());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
