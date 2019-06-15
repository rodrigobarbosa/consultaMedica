package br.com.consultaMedica.utils;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.consultaMedica.model.Contato;
import br.com.consultaMedica.service.ContatoService;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory emf = JPAUtils.getEntityManagerFactory();
		EntityManager factory = emf.createEntityManager();

		ContatoService service = new ContatoService();
		
//		System.out.println("Criando o contato ");

//		Contato contato = new Contato();
//		contato.setId(null);
//		contato.setNome("Rodrigo Barbosa Costa de Carvalho");
//		contato.setEmail("rodrigo.barba.88@gmail.com");
//		contato.setTelefone("83 9 8843-7194");

//		factory.getTransaction().begin();
//		factory.persist(contato);
//		factory.getTransaction().commit();
//		factory.close();
		
//		System.out.println("Contato criado");

//		Contato contatoEditado = new Contato();
//		contatoEditado.setId(contato.getId());
//		contatoEditado.setNome(contato.getNome());
//		contatoEditado.setEmail(contato.getEmail());
//		contatoEditado.setTelefone(contato.getTelefone());
		
//		service.editar(contatoEditado);
		
//		List<Contato> contatos = service.listarContatos();
		
		service.listarContatos();
		
//		System.out.println("Contato " + contato.getNome() + "cadastrado com sucesso !");
	}

}
