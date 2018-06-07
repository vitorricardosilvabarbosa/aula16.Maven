package br.com.start.db1.dao.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CidadeDaoTest extends AbstractTestCase {
	
	private CidadeDao dao;
	
	@Before
	public void init() {
		dao = new CidadeDao(manager);
	}
	
	@Test
	public void findAllTest() {
		Assert.assertTrue(dao.findAll().size()>0);
	}

}
