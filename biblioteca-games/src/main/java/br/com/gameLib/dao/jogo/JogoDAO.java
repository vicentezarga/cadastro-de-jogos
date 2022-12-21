package br.com.gameLib.dao.jogo;

import java.util.List;

import br.com.gameLib.negocio.entidades.Jogo;

public interface JogoDAO {

	public void salvar (Jogo jogo);
	
	public void atualizar (Jogo jogo);
	
	public Jogo consultarByCd (String cdJogo);
	
	public List<Jogo> getAll();
	
}
