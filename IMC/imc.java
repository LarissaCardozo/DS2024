package imc;

public class imc {
    int idade;
    float peso;
    int altura;
    double imc;
    String nome;
    

   void calcularImc  () {
	   
  	 imc = peso/(altura * altura);
  	
   }
   
   String classsificarImc () {
  	 
   
   if(imc < 18.5) {
	   
			return  ("Voc� est� abaixo do peso");
			
		} 
   		else if (imc >= 18.5 && imc <= 24.9) {
			return  ("Voc� est� no peso ideal");
			
		}
		else if (imc >=25 && imc<=29.9) {
			
			return  ("Voc� est� com Sobrepeso");
			
		} 
		else if (imc>=30 && imc<=34.9) {
			
			return  ("voc� esta na obesidade de grau 1");
			
		}
		else if (imc>=35 && imc<=39.9) {
			
			return  ("voc� esta na obesidade de grau 2");
			
		}
		else if (imc >= 40){
			
			return  ("voc� esta na obesidade de grau 3");
			
		}
   
   			return("N�o foi possivel fazer o calculo");
      
   
}
   }