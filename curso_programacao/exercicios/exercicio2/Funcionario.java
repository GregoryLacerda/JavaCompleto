package exercicio2;

public class Funcionario {
	
	String nome;
	double salarioBruto, taxas;
	
	public double salarioLiquido() {
		
		return salarioBruto - taxas;
	}
	
	public void aumentoSalarial(double porcentagem) {
		
		salarioBruto += (porcentagem / 100) * salarioBruto;
		
	}
	
	public String toString() {
		
		return "Employee: " + nome + ", " + salarioLiquido();
				
	}
	
}
