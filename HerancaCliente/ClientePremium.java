package cliente;

public class ClientePremium extends Cliente {
	public double calculaDesconto() {
		return getValorPedido()*0.15;
	}
}