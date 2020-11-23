package projetoPoo;

public class main {
	public static void main (String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.setNome("Chris");
		cliente.setContato(1996556320);
		cliente.setCpf("42515634210");
		cliente.setCodigoCompra(404);
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getContato());
		System.out.println(cliente.getCpf());
		System.out.println(cliente.getCodigoCompra());
		
		cliente.ClienteCodigo();
	}

}
