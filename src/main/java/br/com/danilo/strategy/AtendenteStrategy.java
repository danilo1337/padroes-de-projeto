package br.com.danilo.strategy;

import java.util.Calendar;
import java.util.HashMap;

public abstract class AtendenteStrategy {
	
	public String getLogin() {
		return "Danilo";
	}
	
	public HashMap<Integer, String> getCallCenters(){
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(0,"Perfil Call center");
		return hm;
	}
	
	public HashMap<Integer, String> getIlhas(){
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(0,"Perfil Ilhas");
		return hm;
	}
	public HashMap<Integer, String> getSegmento(){
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(0,"Perfil Segmento");
		return hm;
	}
	
	public Calendar getInicioVigencia() {
		return Calendar.getInstance();
	}
	
	public String getOrigemCadastro() {
		return "Site";
	}
	
	public abstract Object[] saveParameter();
}