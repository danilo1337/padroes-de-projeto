package br.com.danilo.builder;

import java.time.LocalDate;

public class PessoaBuilder {
	private String nome;
	private String cpf;
	private LocalDate DataNascimento;

	public Pessoa build() {
		return new Pessoa(nome, cpf, DataNascimento);
	}

	public PessoaBuilder nome(String nome) {
		this.nome = nome;
		return this;
	}

	public PessoaBuilder cpf(String cpf) {
		this.cpf = cpf;
		return this;
	}

	public PessoaBuilder dataNascimento(LocalDate dataNascimento) {
		DataNascimento = dataNascimento;
		return this;
	}

}
