package br.com.danilo.proxy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ProxyTeste {
	
	@Test
	public void teste(){
		  List<Pessoa> pessoas = new ArrayList<Pessoa>();

	      //Cria cada Proxy para encapsular o acesso a classe "PessoaImpl"
	            pessoas.add(new ProxyPessoa("A"));
	            pessoas.add(new ProxyPessoa("B"));
	            pessoas.add(new ProxyPessoa("C"));

	            System.out.println("Nome: " + pessoas.get(0).getNome());
	            // busca do banco de dados
	            System.out.println("Nome: " + pessoas.get(1).getNome());
	            // busca do banco de dados
	            System.out.println("Nome: " + pessoas.get(0).getNome());
	            // já buscou esta pessoa... apenas retorna do cache...

	            // A terceira pessoa nunca será consultada no banco de dados
	            // (melhor performance - lazy loading)
	            System.out.println("Id da 3ª - " + pessoas.get(2).getId());
	            //pode imprimir o ID do objeto, e o proxy nao será inicializado.
	}
}
