package desafio;

public class mainEmpregado {
	public static void main (String[] args) {
		//instancia
		double SalarioBase = 0;
		double Imposto = 0;
		Empregado emp = new Empregado();
		
		emp.setCodigoSetor(79797);
		emp.setSalarioBase(5000);
		emp.setImposto(0.15);
		
		//saidas
		System.out.println(emp.getCodigoSetor());
		System.out.println(emp.getSalarioBase());
		System.out.println(emp.getImposto());
		
		//sei la
		System.out.println(emp.calcularSalario(SalarioBase, Imposto));
	}

}
