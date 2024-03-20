import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		Quadrado quadrado = new Quadrado();
		
		System.out.println("Entre com o valor da base: ");
		quadrado.base = in.nextDouble();
		
		System.out.println("Entre com o valor da altura: ");
		quadrado.altura = in.nextDouble();
		
		System.out.println(quadrado.calcularArea(0));
	}

}
