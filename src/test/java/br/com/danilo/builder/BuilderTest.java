package br.com.danilo.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

public class BuilderTest {
	
	@Test
	public void deveriaCompararDoisObjetos() {
		Pessoa pessoaBuilder = construirApartirDaPessoaBuilder(
						"Danilo", 
						"111.111.111-11",
						LocalDate.of(1997, Month.JANUARY, 3));
		
		Pessoa pessoa = construirApartirDaPessoa(
				"Danilo", 
				"111.111.111-11",
				LocalDate.of(1997, Month.JANUARY, 3));
		
		
		assertEquals(pessoa.toString(), pessoaBuilder.toString());
		
	}
	
	
	public Pessoa construirApartirDaPessoaBuilder(String nome, String cpf, LocalDate dataNascimento) {
		return new PessoaBuilder()
				.nome(nome)
				.cpf(cpf)
				.dataNascimento(dataNascimento)
				.build();
	}
	
	public Pessoa construirApartirDaPessoa(String nome, String cpf, LocalDate dataNascimento) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setCpf(cpf);
		pessoa.setDataNascimento(dataNascimento);
		return pessoa; 
	}
}
