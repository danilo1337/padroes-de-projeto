package br.com.danilo.template;

import org.junit.Test;

public class TemplateTeste {
	
	@Test
	public void deveriaRetornarTreinoNoInicioDaTemporada() {
		Treinos treino = new TreinoNoInicioDaTemporada();
		String retornoEsperado = "Preparo fisico leve.;Jogo treino com equipe junior.;Treino tatico";
		
		assert(treino.treinoDiario().equals(retornoEsperado));
	}

	@Test
	public void deveriaRetornarTreinoNoMeioDaTemporada() {
		Treinos treino = new TreinoNoMeioDaTemporada();
		String retornoEsperado = "Preparo fisico intenso.;Jogo treino com equipe reserva.;Treino tatico";
		
		assert(treino.treinoDiario().equals(retornoEsperado));
	}
	
	@Test
	public void deveriaRetornarTreinoNoFimDaTemporada() {
		Treinos treino = new TreinoNoFimDaTemporada();
		String retornoEsperado = "Preparo fisico leve;Jogo treino com equipe reserva.;Treino tatico";
		
		assert(treino.treinoDiario().equals(retornoEsperado));
	}
	
}
