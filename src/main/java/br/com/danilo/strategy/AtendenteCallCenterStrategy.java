package br.com.danilo.strategy;

public class AtendenteCallCenterStrategy extends AtendenteStrategy{

	@Override
	public Object[] saveParameter() {
		Object params[] = new Object[5];
		params[0] = "CallCenter";
		params[1] = getCallCenters();
		params[2] = getLogin();
		params[3] = getInicioVigencia().getTime();
		params[4] = getOrigemCadastro();
		return params;
	}

}