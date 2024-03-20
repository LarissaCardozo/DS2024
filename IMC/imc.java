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
	   
			return  ("Você está abaixo do peso");
			
		} 
   		else if (imc >= 18.5 && imc <= 24.9) {
			return  ("Você está no peso ideal");
			
		}
		else if (imc >=25 && imc<=29.9) {
			
			return  ("Você está com Sobrepeso");
			
		} 
		else if (imc>=30 && imc<=34.9) {
			
			return  ("você esta na obesidade de grau 1");
			
		}
		else if (imc>=35 && imc<=39.9) {
			
			return  ("você esta na obesidade de grau 2");
			
		}
		else if (imc >= 40){
			
			return  ("você esta na obesidade de grau 3");
			
		}
   
   			return("Não foi possivel fazer o calculo");
      
   
}
   }