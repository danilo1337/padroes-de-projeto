package br.com.danilo.observer;

import org.junit.Test;

import br.com.danilo.observer.Comentario;
import br.com.danilo.observer.Usuario;

public class ObserverTeste {
	
	@Test
	public void deveriaNotificarUmNovoComentario() {
		Comentario c = new Comentario();
		Usuario u = new Usuario(c, 1, "Danilo");

		c.setComentario("teste");
		c.setComentario("teste123");
	}
}
