package br.com.danilo.strategy;

public class AtendenteContexto {
	private AtendenteStrategy atendenteStrategy = null;

	public Object[] configurarAtendente() {
		Object[] parametros = atendenteStrategy.saveParameter();

		return parametros;

	}

	public AtendenteStrategy getAtendenteStrategy() {
		return atendenteStrategy;
	}

	public void setAtendenteStrategy(AtendenteStrategy atendenteStrategy) {
		this.atendenteStrategy = atendenteStrategy;
	}

}