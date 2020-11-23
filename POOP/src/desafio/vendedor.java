package desafio;

public class vendedor extends Pessoa {
	//atributos 
	private double valorVendas;
	private double comissao;
	
	//getters & setters
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}
