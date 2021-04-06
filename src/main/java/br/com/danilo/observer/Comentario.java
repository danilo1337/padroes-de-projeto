package br.com.danilo.observer;

import java.util.Observable;

public class Comentario extends Observable {

	private String comentario;

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
		setChanged();
		notifyObservers();
	}

}
