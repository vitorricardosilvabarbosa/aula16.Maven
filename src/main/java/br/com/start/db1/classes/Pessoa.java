package br.com.start.db1.classes;

import javax.persistence.Column;

public class Pessoa {
	
	@Column(length = 50, nullable = false)
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	@Column(length = 14, nullable = false)
	private String documento;
}
