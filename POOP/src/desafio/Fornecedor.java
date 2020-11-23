package desafio;

public class Fornecedor extends Pessoa {
	//atributos de fornecedor 
	private int valorCredito;
	private int valorDivida;
	
	//getters & setters
	public int getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}
	public int getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(int valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	//metodo
	public int obterSaldo(int valorCredito, int valorDivida) {
		return  this.valorCredito-this.valorDivida;
	}
}
