package cliente;

public class ClientePremium extends Cliente {
	   
	@Override
   public double calculaDesconto() {
       double valorPedido = getValorpedido();
       double desconto = valorPedido * 0.15;
       
       double valorPromocional = valorPedido - desconto;
       
       setValorpromocional(valorPromocional);{
       return valorPromocional;
       }
   }

	public double getValorpromocional() {
		// TODO Auto-generated method stub
		return 0;
	}
}