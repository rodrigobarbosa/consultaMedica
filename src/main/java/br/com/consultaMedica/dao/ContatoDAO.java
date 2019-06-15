package br.com.consultaMedica.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import br.com.consultaMedica.model.Contato;
import br.com.consultaMedica.utils.JPAUtils;

public class ContatoDAO {

	EntityManagerFactory emf = JPAUtils.getEntityManagerFactory();
	EntityManager factory = emf.createEntityManager();

	public Contato buscaPorId(Long idContato) {
		this.factory.getTransaction().begin();
		Contato contatoRetorno = this.factory.find(Contato.class, idContato);
		return contatoRetorno;
	}
	
	public Contato buscaPorNome(String nome) {
		this.factory.getTransaction().begin();
		Query query = this.factory.createQuery("SELECT c FROM Contato c WHERE c.nome =:" + nome);
		Contato contatoNome = (Contato) query.getSingleResult();
		return contatoNome;
	}
	
	public Contato buscaPorEmail(String email) {
		this.factory.getTransaction().begin();
		Query query = this.factory.createQuery("SELECT c FROM Contato c WHERE c.nome =:" + email);
		Contato contatoEmail = (Contato) query.getSingleResult();
		return contatoEmail;
	}
	
	public List<Contato> contatos() {
		this.factory.getTransaction().begin();
		Query query = this.factory.createQuery("SELECT c FROM CONTATO c");
		List<Contato> contatos = query.getResultList();
		for(Contato contato : contatos) {
			System.out.println(contato.getNome());
		}
		
		return contatos;
	}

	public void salvar(Contato contato) {
		this.factory.getTransaction().begin();
		this.factory.persist(contato);
		this.factory.getTransaction().commit();
		this.factory.close();
	}
	
	public void editar(Contato contato) {
		this.factory.getTransaction().begin();
		this.factory.merge(contato);
		this.factory.getTransaction().commit();
		this.factory.close();
	}
	
	public void remover(Long idContato) {
		this.factory.getTransaction().begin();
		this.factory.remove(buscaPorId(idContato));
		this.factory.getTransaction().commit();
		this.factory.close();
	}
	
	
}
