package br.com.gameLib.dao.jogo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.gameLib.negocio.entidades.Jogo;

public class JogoDaoIMPL implements JogoDAO {

	private EntityManager em;

	public JogoDaoIMPL(EntityManager em) {
		this.em = em;
	}

	@Override
	public void salvar(Jogo jogo) {
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(jogo);
		tx.commit();
		em.close();

	}

	@Override
	public void atualizar(Jogo jogo) {
		// TODO Auto-generated method stub

	}

	@Override
	public Jogo consultarByCd(String cdJogo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Jogo> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
