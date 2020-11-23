package projetoPoo;
//1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
//em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as 
//informações deste objeto no console.

public class Cliente {
	private String nome;
	private int contato;
	private String cpf;
	private int codigoCompra;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getContato() {
		return contato;
	}
	public void setContato(int contato) {
		this.contato = contato;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getCodigoCompra() {
		return codigoCompra;
	}
	public void setCodigoCompra(int codigoCompra) {
		this.codigoCompra = codigoCompra;
	}
	//metodo
	public void ClienteCodigo() {
		this.codigoCompra = 85780;
		System.out.println(this.codigoCompra);
	}
	

}
