package br.com.danilo.template;

public abstract class Treinos {
	final String treinoDiario() {
		return preparoFisico() + ";" + jogoTreino() + ";" + treinoTatico();
	}

	abstract String jogoTreino();

	abstract String preparoFisico();

	final String treinoTatico() {
		return "Treino tatico";
	}
}
