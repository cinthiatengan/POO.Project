package desafio;

public class Empregado extends Pessoa {
	//atributos
	private int CodigoSetor;
	private double SalarioBase;
	private double Imposto;
	
	//getters & setters
	public int getCodigoSetor() {
		return CodigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		CodigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return SalarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		SalarioBase = salarioBase;
	}
	public double getImposto() {
		return Imposto;
	}
	public void setImposto(double imposto) {
		Imposto = imposto;
	}
	//metodos
	public double calcularSalario(double SalarioBase, double Imposto) {
		return this.SalarioBase*(1-this.Imposto);
	}
}
