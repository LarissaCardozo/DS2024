package exer2;

public class Funcionario {

	String nome;
	double salarioBruto;
	double imposto;
	double valor;
	
	String salarioLiquido (double salarioLiquido) {
		salarioLiquido = salarioBruto - imposto;
		return ("O salário líquido é "+salarioLiquido);
		
	}
	
}
