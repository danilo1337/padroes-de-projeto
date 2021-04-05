package br.com.danilo.builder;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private String cpf;
	private LocalDate DataNascimento;

	public Pessoa() {
	}

	public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		DataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		DataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", DataNascimento=" + DataNascimento + "]";
	}

}
