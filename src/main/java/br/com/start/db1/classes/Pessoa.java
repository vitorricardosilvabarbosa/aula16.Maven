package br.com.start.db1.classes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Pessoa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50, nullable = false)
	private String nome;

	@Column(length = 14, nullable = false)
	private String documento;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="Endereco")
	private List<Endereco> endereco;
}
