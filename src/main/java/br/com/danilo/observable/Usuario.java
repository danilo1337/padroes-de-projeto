package br.com.danilo.observable;

import java.util.Observable;
import java.util.Observer;

public class Usuario implements Observer {

	private Observable comentario;

	private Integer id;
	private String nome;

	public Usuario(Observable comentario, Integer id, String nome) {
		this.comentario = comentario;
		this.id = id;
		this.nome = nome;
		comentario.addObserver(this);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void update(Observable comentarioSubject, Object arg1) {
		if (comentarioSubject instanceof Comentario) {
			Comentario comentario = (Comentario) comentarioSubject;

			System.out.printf("%s comentou: %s \n", nome, comentario.getComentario());

		}

	}

}
