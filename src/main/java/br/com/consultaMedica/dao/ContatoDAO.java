package br.com.consultaMedica.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.consultaMedica.model.Contato;
import br.com.consultaMedica.utils.JPAUtils;

public class ContatoDAO {

	EntityManagerFactory emf = JPAUtils.getEntityManagerFactory();
	EntityManager factory = emf.createEntityManager();
	
	public void salvar(Contato contato) {
		this.factory.getTransaction().begin();
		this.factory.persist(contato);
		this.factory.getTransaction().commit();
		this.factory.close();
	}
	
	public void remover(Long idContato) {
		this.factory.getTransaction().begin();
		this.factory.remove(buscaPorId(idContato));
		this.factory.getTransaction().commit();
		this.factory.close();
	}
	
	public Contato buscaPorId(Long idContato) {
		this.factory.getTransaction().begin();
		Contato contato = this.factory.find(Contato.class, idContato);
		return contato;
	}
}
