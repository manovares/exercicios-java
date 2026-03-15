package ArrayCrud;

public class App {
	public static void main(String[] args) {
		
		//criar uma agenda
		Agenda agenda = new Agenda();
		
		//criando contatos
		Contato c1 = new Contato("Marcos");
		c1.setTelefone("5432-1234");
		
		//adicionando c1 na lista
		agenda.adicionar(c1);
		
		Contato c2 = new Contato("Andrew", "1234-5678", "andrew@andrew.com");
		agenda.adicionar(c2);
		
		Contato c3 = new Contato("Gustavo", "9876-4563", "gustavo@gustavo.com");
		agenda.adicionar(c3);
		
		//listando os contatos
		System.out.println(">>> primeira listagem...");
		agenda.listar();
		System.out.println("--------------------------------");
		
		//atualizar
		agenda.atualizar(0, new Contato("Marcos", "1234-5678", "123@123.com"));
		
		//listando os contatos
		System.out.println(">>> segunda listagem...");
		agenda.listar();
		
		//remover
		agenda.remover(0);

		//listando os contatos
		System.out.println(">>> terceira listagem...");
		agenda.listar();
		
	}
}
