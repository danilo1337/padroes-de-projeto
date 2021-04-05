package br.com.danilo.decorator;

public class DecoradorBarraVertical extends JanelaDecorator {

	public DecoradorBarraVertical(Janela janelaDecorada) {
		super(janelaDecorada);
	}

	public String desenhar() {
		return janelaDecorada.desenhar() + ", " + desenharBarraVertical();
	}

	private String desenharBarraVertical() {
		return "desenha uma barra vertical na janela";
	}
}
