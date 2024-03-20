package exer2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		Funcionario Pedro = new Funcionario();
		Funcionario Vagner = new Funcionario();
		
		System.out.println("Entre com o valor do salario bruto: ");
		Pedro.salarioBruto = in.nextDouble();
		Vagner.salarioBruto = in.nextDouble();
		
		System.out.println("Entre com o valor do imposto: ");
		Pedro.imposto = in.nextDouble();
		Vagner.imposto = in.nextDouble();
		
		System.out.println("Entre com o valor que será aumentado: ");
		Pedro.valor = in.nextDouble();
		Vagner.valor = in.nextDouble();
		
		System.out.println(Pedro.salarioLiquido(0));
	}

}
