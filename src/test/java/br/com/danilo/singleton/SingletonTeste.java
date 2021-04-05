package br.com.danilo.singleton;

import org.junit.Test;

public class SingletonTeste {
	
	@Test
	public void deveriaVerificarNomeDaInstancia() {
		//iniciando a instancia
		Singleton.getInstance();
		
		Singleton.getInstance().setNome("João");
		
		Singleton.getInstance().setNome("Danilo");
		
		//Verficando o nome atual da instancia
		assert(Singleton.getInstance().getNome().equals("Danilo"));
	}
}
