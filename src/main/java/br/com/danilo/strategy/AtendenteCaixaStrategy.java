package br.com.danilo.strategy;

public class AtendenteCaixaStrategy extends AtendenteStrategy{

	@Override
	public Object[] saveParameter() {
		Object params[] = new Object[1];
		params[0] = "Caixa";
		return params;
	}

}
