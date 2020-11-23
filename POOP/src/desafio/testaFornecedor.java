package desafio;

public class testaFornecedor {
	public static void main (String[] args) {
		int valorCredito=0; 
		int valorDivida=0;
		//instancia
		Fornecedor forn = new Fornecedor();
		
		forn.setValorCredito(5000);
		forn.setValorDivida(1500);
		
		//saidas
		System.out.println(forn.getValorCredito());
		System.out.println(forn.getValorDivida());
	
		//magia semi oculta
		System.out.println(forn.obterSaldo(valorCredito, valorDivida));
		
	}

}
