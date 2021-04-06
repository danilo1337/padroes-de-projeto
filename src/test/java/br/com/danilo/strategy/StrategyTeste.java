package br.com.danilo.strategy;

import org.junit.Before;
import org.junit.Test;

public class StrategyTeste {
	
	private AtendenteContexto perfil;
	
	@Test
	public void deveriaRetornarPefilCallCenter() {
		perfil.setAtendenteStrategy(new AtendenteCallCenterStrategy());
		String perfilRetornado = perfil(perfil.configurarAtendente());
		
		assert(perfilRetornado.equals("CallCenter"));
	}
	
	@Test
	public void deveriaRetornarPefilIlha() {
		perfil.setAtendenteStrategy(new AtendenteIlhaStrategy());
		String perfilRetornado = perfil(perfil.configurarAtendente());
		
		assert(perfilRetornado.equals("Ilha"));
	}

	@Test
	public void deveriaRetornarPefilCallSegmento() {
		perfil.setAtendenteStrategy(new AtendenteSegmentoStrategy());
		String perfilRetornado = perfil(perfil.configurarAtendente());
		
		assert(perfilRetornado.equals("Segmento"));
	}
	
	@Test
	public void deveriaRetornarPefilCallCaixa() {
		perfil.setAtendenteStrategy(new AtendenteCaixaStrategy());
		String perfilRetornado = perfil(perfil.configurarAtendente());
		
		assert(perfilRetornado.equals("Caixa"));
	}
	
	@Before
	public void beforeContexto() {
		this.perfil = new AtendenteContexto();
	}
	
	public String perfil(Object[] objeto) {
		return objeto[0].toString();
	}
}
