package br.com.consultaMedica.service;

import java.util.List;

import br.com.consultaMedica.model.Contato;

public interface IContato {

	public void salvar(Contato contato);
	
	public void remover(Long idContato);
	
	public List<Contato> listarContatos();
	
	public void editar(Contato contato);
	
	public Contato buscaContatoNome(String nome);
	
	public Contato buscaContatoEmail(String email);
	
	public Contato buscaPorId(Long idContato);

}
