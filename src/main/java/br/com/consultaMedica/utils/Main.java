package br.com.consultaMedica.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.consultaMedica.model.Contato;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory emf = JPAUtils.getEntityManagerFactory();
		EntityManager factory = emf.createEntityManager();

		System.out.println("Criando o contato ");

		Contato contato = new Contato();
		contato.setId(null);
		contato.setNome("Rodrigo Barbosa Costa de Carvalho");
		contato.setEmail("rodrigo.barba.88@gmail.com");
		contato.setTelefone("83 9 8843-7194");

		System.out.println("Contato criado");

		factory.getTransaction().begin();
		factory.persist(contato);
		factory.getTransaction().commit();
		factory.close();

		System.out.println("Contato " + contato.getNome() + "cadastrado com sucesso !");
	}

}
