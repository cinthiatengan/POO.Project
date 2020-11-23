package desafio;

public class Pessoa {
	//atributos
	private String nome;
	private String endereco;
	private int telefone;
	
	//getters & setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public Pessoa() {
		super();
	}
	public Pessoa(String nome, String endereco, int telefone) {
		super();
		this.nome = "Fulano";
		this.endereco = "rua alguma coisa, numero 0";
		this.telefone = 32456798;
	}
}
	