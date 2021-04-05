package br.com.danilo.decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class DecoratorTeste {
	
	@Test
	public void deveriaDecorarUmaJanela() {
		Janela janelaDecorada = new DecoradorBarraVertical(new JanelaSimples());
		
		assertEquals("desenha uma janela, desenha uma barra vertical na janela", janelaDecorada.desenhar());
	}
}
