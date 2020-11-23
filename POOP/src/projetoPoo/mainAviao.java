package projetoPoo;

public class mainAviao {
	public static void main(String[] args) {
		//nova instancia
		Aviao airplane = new Aviao();
		
		airplane.setCompania("Tam");
		airplane.setModelo("Boeing 747");
		airplane.setTamanho(77);
		
		//saidas
		System.out.println(airplane.getCompania());
		System.out.println(airplane.getModelo());
		System.out.println(airplane.getTamanho());
		
		airplane.Decolar();
	}

}
