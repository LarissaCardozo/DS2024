package cliente;
public class Cliente {
    private String nome;
    private int idade;
    private String endereco;
    private double valorpedido;
    private double valorpromocional;
   
    //GET E SET
    public String getNome() {
        return nome;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade (int idade) {
        this.idade = idade;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco (String endereco) {
        this.endereco = endereco;  
    }
    public double getValor_promocional() {
        return valorpromocional;
    }
    public void setValorpromocional (double valorpromocional) {
        this.valorpromocional = valorpromocional;
    }
    public double getValorpedido() {
        return valorpedido;
    }
    public void setValorpedido (double valorpedido) {
        this.valorpedido = valorpedido;
    }
 
    
    //MÉTODOS
    
    public double calculaDesconto() {      
        double desconto = this.valorpedido - (this.valorpedido * 0.1);
        this.setValorpromocional(desconto);
        return desconto;
    }
	public double getValorpromocional() {
		// TODO Auto-generated method stub
		return 0;
	}
}
 