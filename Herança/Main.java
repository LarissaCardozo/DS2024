package veiculo;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Veiculo Carro = new Veiculo();
		Veiculo Moto = new Veiculo();
		
		Carro.setMarca("Volkswagen");
		Carro.setModelo("Nivus");
		Carro.setAno(2022);
		Carro.setCor("Cinza");
		Carro.setQuantPorta(4);
		System.out.println("Informações do Carro:");
	    Carro.exibirInformacoesCarro();
 
	    
	    Moto.setMarca("Honda");
	    Moto.setModelo("Gold Wing GL1000");
	    Moto.setAno(1975);
	    Moto.setCor("Vermelho");
	    Moto.setCilindrada("Sim");
	    System.out.println("\nInformações da Moto:");
	    Moto.exibirInformacoesMoto();
	}
}