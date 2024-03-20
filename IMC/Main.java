package imc;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner (System.in);
		
        imc primeiro = new imc();
		
		System.out.println("Entre aqui com seu nome: ");
	    primeiro.nome=in.next();		
		
		System.out.println("Entre com seu peso: ");
		primeiro.peso=in.nextFloat();
		
		System.out.println("Entre aqui com sua altura: ");
		primeiro.altura=in.nextInt();
		
	    System.out.println("Entre com sua idade: ");
		primeiro.idade=in.nextInt();
	
		primeiro.calcularImc();
	
	    System.out.println("Nome: " +primeiro.nome);
	    
	    System.out.println("Peso: " +primeiro.peso+"Kg");
	    
	    System.out.println("Altura: " +primeiro.altura+"cm");

	    System.out.println("Idade: " +primeiro.idade);
	    
	    System.out.println("Imc: " +primeiro.imc);
	    
	    System.out.println(primeiro.classsificarImc());
	 
		}

	
}