package calculadora;
import java.util.*;
public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
        Scanner in = new Scanner(System.in);
        int soma=1, subtracao=2, operacao;
        calculadora calculadora = new calculadora();
 
        System.out.println("Voc� deseja fazer qual opera��o? Digite 1 para soma e 2 para subtra��o: ");
        operacao = in.nextInt();
 
        if (operacao<=soma) {
            calculadora.soma(6, 7);
            System.out.println("Soma de inteiros: " +calculadora.getResultado());
            
            calculadora.soma(5.5, 2.9);
            System.out.println("Soma de decimais: " +calculadora.getResultado());
 
        } else {
            calculadora.subtracao(10, 5);
            System.out.println("Subtra��o de inteiros: " +calculadora.getResultado());
            
            calculadora.subtracao(0.5, 8.8);
            System.out.println("Subtra��o de decimais: " +calculadora.getResultado());
        }

    }
}