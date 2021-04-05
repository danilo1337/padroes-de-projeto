package br.com.danilo.adapter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AdapterTeste {
	
	@Test
	public void deveriaAdaptarTomadaDeTresPinos() {
		TomadaDeTresPinos t3 = new TomadaDeTresPinos();
		
		AdapterTomada adapterTomada = new AdapterTomada(t3);
		
		assertEquals("Ligado na Tomada de Tres Pinos", adapterTomada.ligarNaTomadaDeDoisPinos());
	}
}
