package br.com.start.db1.Testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import br.com.start.db1.classes.Cidade;
import br.com.start.db1.classes.Endereco;
import br.com.start.db1.tipos.TipoEndereco;
import br.com.start.db1.tipos.TipoLogradouro;


public class EnderecoTest {

	@Test
	public void insertTest() {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
		EntityManager manager = factory.createEntityManager();
		
		Cidade cidade = new Cidade();
		cidade.setId(9);
				
		Endereco endereco = new Endereco();
		endereco.setTipoLogradouro(TipoLogradouro.BECO);
		endereco.setLogradouro("asdfasdf");
		endereco.setNumero("1571");
		endereco.setTipoEndereco(TipoEndereco.RESIDENCIA);
		endereco.setCep("1234134");
		endereco.setCidade(cidade);
				
		
		manager.getTransaction().begin();
		manager.persist(cidade);
		manager.getTransaction().commit();
		
		factory.close();
		
		
	}
}
