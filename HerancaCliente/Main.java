package cliente;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c1 = new Cliente();
		ClientePremium c2 = new ClientePremium();
		
		c1.setNome("Geraldo Alckmin");
		c1.setIdade(55);
		c1.setEndereco("Rua Salvador Dali, 29");
		c1.setvalorPedido(234.99);
		
		c2.setNome("Fernando Reis");
		c2.setIdade(42);
		c2.setEndereco("Rua Brasiliano de Tavares, 35");
		c2.setvalorPedido(152.99);
		

		System.out.println("Nome: " + c1.getNome());
		System.out.println("Endereço: " +c1.getEndereco());
		System.out.println("Idade: " + c1.getIdade());
		System.out.println("Valor do pedido: " + c1.getValorPedido());
		System.out.println("Valor com desconto: " + c1.calculaDesconto());
		
		System.out.println(" ");
		
		System.out.println("Nome: " + c2.getNome());
		System.out.println("Endereço: " +c2.getEndereco());
		System.out.println("Idade: " + c2.getIdade());
		System.out.println("Valor do pedido: " + c2.getValorPedido());
		System.out.println("Valor com desconto: " + c2.calculaDesconto());

	}
 
}