package cliente;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String resposta;
        String nome, endereco;
        int idade;
        double valorp;
        double valorComDesconto = 0;
        double valorComDesconto1 = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Você é premium? (sim/não)");
        resposta = in.next();

        if (resposta.equalsIgnoreCase("sim")) {
            
        	ClientePremium cp1 = new ClientePremium();
            System.out.println("Digite seu nome:");
            nome = in.next();
            cp1.setNome(nome);

            System.out.println("Digite sua idade:");
            idade = in.nextInt();
            cp1.setIdade(idade);

            System.out.println("Digite seu endereço:");
          
            in.nextLine();
            endereco = in.nextLine();
            cp1.setEndereco(endereco);

            System.out.println("Digite o valor do produto:");
            valorp = in.nextDouble();
            cp1.setValorpedido(valorp);
            
            cp1.calculaDesconto();
            
            // Calcula o desconto após definir o valor do pedido
            
           valorComDesconto1 = cp1.getValorpedido() - cp1.getValorpromocional();

            System.out.println("\nInformações do cliente");
            System.out.println("Nome: " + cp1.getNome());
            System.out.println("Idade: " + cp1.getIdade());
            System.out.println("Endereço: " + cp1.getEndereco());
            System.out.println("Valor original do produto: " + cp1.getValorpedido());
            System.out.println("Valor do produto com desconto: " + cp1.getValorpromocional());

        } else {
            Cliente cc1 = new Cliente();
            System.out.println("Digite seu nome:");
            nome = in.next();
            cc1.setNome(nome);

            System.out.println("Digite sua idade:");
            idade = in.nextInt();
            cc1.setIdade(idade);

            System.out.println("Digite seu endereço:");
           
            in.nextLine();
            endereco = in.nextLine();
            cc1.setEndereco(endereco);

            System.out.println("Digite o valor do produto:");
            valorp = in.nextDouble();
            cc1.setValorpedido(valorp);

            cc1.calculaDesconto();
           
            // Calcula o desconto após definir o valor do pedido
 
        valorComDesconto = cc1.getValorpedido() - cc1.getValorpromocional();

        System.out.println("\nInformações do cliente");
        System.out.println("Nome: " + cc1.getNome());
        System.out.println("Idade: " + cc1.getIdade());
        System.out.println("Endereço: " + cc1.getEndereco());
        System.out.println("Valor original do produto: " + cc1.getValorpedido());
        System.out.println("Valor do produto com desconto: " + cc1.getValorpromocional());
        
        }

        in.close();
    }
}