package br.com.danilo.observer;

import org.junit.Test;

import br.com.danilo.observable.Comentario;
import br.com.danilo.observable.Usuario;

public class ObserverTeste {
	
	@Test
	public void deveriaNotificarUmNovoComentario() {
		Comentario c = new Comentario();
		Usuario u = new Usuario(c, 1, "Danilo");

		c.setComentario("teste");
		c.setComentario("teste123");
	}
}
