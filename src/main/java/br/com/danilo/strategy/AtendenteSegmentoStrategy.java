package br.com.danilo.strategy;

public class AtendenteSegmentoStrategy extends AtendenteStrategy{

	@Override
	public Object[] saveParameter() {
		Object params[] = new Object[7];
		params[0] = "Segmento";
		params[1] = getCallCenters();
		params[2] = getLogin();
		params[3] = getInicioVigencia().getTime();
		params[4] = getOrigemCadastro();
		params[5] = getIlhas();
		params[6] = getSegmento();
		return params;
	}

}