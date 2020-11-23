package projetoPoo;
//3) Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, 
//em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e apresente as 
//informações deste objeto no console.

public class produtoEletronico {
	//atributos
	private String tela;
	private String recarregavel;
	private String marca;
	
	//getters & setters
	public String getTela() {
		return tela;
	}
	public void setTela(String tela) {
		this.tela = tela;
	}
	public String getRecarregavel() {
		return recarregavel;
	}
	public void setRecarregavel(String recarregavel) {
		this.recarregavel = recarregavel;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	//metodos
	public static String Ligar() {
		System.out.println("ligado");
		return "Ligado";
		
	}
	public static String Desligar() {
		System.out.println("desligado");
		return "Desligado";
	}
	
	

}
