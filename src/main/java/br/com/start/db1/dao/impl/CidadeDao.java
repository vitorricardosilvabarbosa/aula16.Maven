package br.com.start.db1.dao.impl;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.start.db1.classes.Cidade;
import br.com.start.db1.dao.DAO;

public class CidadeDao implements DAO<Cidade>{

	@Inject
	private EntityManager entityManager;
	
	public List<Cidade> findAll() {
		
		return entityManager.createQuery("select from Cidade").getResultList();		
	}

	public Cidade findById(Integer id) {

		return (Cidade) entityManager.createQuery("select from Cidade where id = :pId").getSingleResult();
	}

	public List<Cidade> findByName(String name) {

		return entityManager.createQuery("select from Cidade where nome = :pId").getResultList();
	}

	public boolean save(Cidade t) {

		return false;
	}

	public boolean delete(Integer id) {

		return false;
	}

}
