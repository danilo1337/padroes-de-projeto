package br.com.danilo.adapter;

public class AdapterTomada extends TomadaDeDoisPinos {

	private TomadaDeTresPinos tomadaDeTresPinos;

	public AdapterTomada(TomadaDeTresPinos tomadaDeTresPinos) {
		this.tomadaDeTresPinos = tomadaDeTresPinos;
	}

	public String ligarNaTomadaDeDoisPinos() {
		return tomadaDeTresPinos.ligarTomadaDeTresPinos();
	}
}
