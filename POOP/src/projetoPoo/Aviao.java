package projetoPoo;
//2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
//em seguida crie um objeto avião, defina as instancias deste objeto e apresente as informações deste objeto no console.

public class Aviao {
	//atributos
	private String modelo;
	private int tamanho;
	private String compania;
	private int velocidadeMaxima;
	
	//getters & setters
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	//metodos
	public static String Decolar() {
		return "Decolando";
	}
	public static String Pousar() {
		return "Pousando";
	}
	public static String Turbulencia() {
		return "Chacoalhando";
	}
	

}
