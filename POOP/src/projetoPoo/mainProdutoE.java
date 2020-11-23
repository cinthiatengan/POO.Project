package projetoPoo;

public class mainProdutoE {
	public static void main (String[] args) {
	//nova instancia
	produtoEletronico celular = new produtoEletronico();
		celular.setMarca("Xiaomi");
		celular.setRecarregavel("tipo C");
		celular.setTela("Led");
		
		//saidas
		System.out.println(celular.getMarca());
		System.out.println(celular.getRecarregavel());
		System.out.println(celular.getTela());
	
		celular.Ligar();
		celular.Desligar();
	}
}
