package veiculo;
 
public class Veiculo {
 
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private int quantPorta;
	private String cilindrada;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca (String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno (int ano) {
		this.ano = ano;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getQuantPorta() {
		return quantPorta;
	}
	public void setQuantPorta (int quantPorta) {
		this.quantPorta = quantPorta;
	}
	
	public String getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public void exibirInformacoesCarro() {
	        System.out.println("Marca: "+marca);
	        System.out.println("Modelo: "+modelo);
	        System.out.println("Ano: "+ano);
	        System.out.println("Cor: "+cor);
	        System.out.println("Quantidade de Portas: "+quantPorta);
	    }
	
	public void exibirInformacoesMoto() {
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
        System.out.println("Cor: "+cor);
        System.out.println("Cilindrada?: "+cilindrada);
    }
}
