package br.com.danilo.decorator;

public class JanelaDecorator extends Janela {

	protected Janela janelaDecorada;

	public JanelaDecorator(Janela janelaDecorada) {
		this.janelaDecorada = janelaDecorada;
	}

	@Override
	public String desenhar() {
		return "Desenha uma janela decorada";
	}

}
