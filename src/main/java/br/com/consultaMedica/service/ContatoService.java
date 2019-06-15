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
		
	}
	
	public void remover(Long idContato) {
		
	}
	
	public List<Contato> listarContatos() {
		return null;
	}
	
	public void editar(Contato contato) {
		
	}
	
	public Contato buscaContatoNome(String nome) {
		return null;
	}
	
	public Contato buscaContatoEmail(String email) {
		return null;
	}

	@Override
	public Contato buscaPorId(Long idContato) {
		return null;
	}
}
