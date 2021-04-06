package br.com.danilo.strategy;

public class AtendenteIlhaStrategy extends AtendenteStrategy{

	@Override
	public Object[] saveParameter() {
		Object params[] = new Object[6];
		params[0] = "Ilha";
		params[1] = getCallCenters();
		params[2] = getLogin();
		params[3] = getInicioVigencia().getTime();
		params[4] = getOrigemCadastro();
		params[5] = getIlhas();
		return params;
	}

}