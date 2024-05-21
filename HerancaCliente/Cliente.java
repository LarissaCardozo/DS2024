package cliente;
public class Cliente {
	
	private String nome;
	private int idade;
	private String endereco;
	private double valorPedido;
	private double valorPromocional;
	
	public String getNome() {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade ) {
		this.idade = idade;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco ) {
		this.endereco = endereco;
	}
	
	public double getValorPedido() {
		return valorPedido;
	}
	public void setvalorPedido(double valorPedido ) {
		this.valorPedido = valorPedido;
	}
	
	public double getValorPromocional() {
		return valorPromocional;
	}
	public void set(double valorPromocional ) {
		this.valorPromocional = valorPromocional;
	}
	
	public double calculaDesconto() {
		return valorPromocional= valorPedido*0.10;
	}
}