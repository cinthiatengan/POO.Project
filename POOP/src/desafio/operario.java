package desafio;

public class operario extends Pessoa {
	//atributos
	private double comissao;
	private double valorProducao;
	
	//getters & setters
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
}
