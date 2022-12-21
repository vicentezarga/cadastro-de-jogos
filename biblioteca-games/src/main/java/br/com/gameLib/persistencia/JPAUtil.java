package br.com.gameLib.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("default");

	public static EntityManager getConectar() {

		return FACTORY.createEntityManager();
	}

}
