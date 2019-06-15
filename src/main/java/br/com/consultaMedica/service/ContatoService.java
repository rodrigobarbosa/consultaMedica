package br.com.consultaMedica.service;

import java.util.List;

import br.com.consultaMedica.dao.ContatoDAO;
import br.com.consultaMedica.model.Contato;

public class ContatoService implements IContato{
	
	// ANTIGAMENTE ERA FEITO DESSA FORMA ABAIXO, USANDO O DAO;
	private ContatoDAO dao;
	
	public ContatoService() { 
		this.dao = new ContatoDAO();
	}
	// ANTIGAMENTE ERA FEITO DESSA FORMA ACIMA, USANDO O DAO;

	public void salvar(Contato contato) {
		this.dao.salvar(contato);
	}
	
	public void editar(Contato contato) {
		this.dao.editar(contato);
	}

	public void remover(Long idContato) {
		this.dao.remover(idContato);
	}
	
	public List<Contato> listarContatos() {
		return this.dao.contatos();
	}
	
	public Contato buscaPorId(Long idContato) {
		return this.dao.buscaPorId(idContato);
	}

	public Contato buscaContatoNome(String nome) {
		return this.dao.buscaPorNome(nome);
	}
	
	public Contato buscaContatoEmail(String email) {
		return this.dao.buscaPorEmail(email);
	}

}
