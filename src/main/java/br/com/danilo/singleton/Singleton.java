package br.com.danilo.singleton;

/**
 * @author Danilo Ribeiro
 *
 */
public class Singleton {
	
	private static Singleton uniqueInstance;
	private String nome;
	private String sobrenome;
	private String cpf;

	private Singleton() {

	}

	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new Singleton();

		return uniqueInstance;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Singleton [nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + "]";
	}
	
}
