package model;

public class Aritmetica {
	
	public int primeiroNumero;
	public int segundoNumero;
	
	public void soma (int primeiroNumero, int segundoNumero) {
		
		int result = 0, primeiroNumeroSeparado=0,segundoNumeroSeparado=0;
		
		while(primeiroNumero > 0) {
		
		primeiroNumeroSeparado = separaNumero(primeiroNumero);
		System.out.println("Aqui � o primeiro n�mero separado "+primeiroNumeroSeparado);
		primeiroNumero = primeiroNumero/10;
		
		}
		
		while(segundoNumero > 0) {
		
		segundoNumeroSeparado = separaNumero(segundoNumero);
		System.out.println("Aqui � o segundo n�mero separado "+segundoNumeroSeparado);
		segundoNumero = segundoNumero/10;
			
		}
		

		//System.out.println("resultado �: "+primeiroNumeroSeparado+segundoNumeroSeparado);
		//return result;
	}
	
	public int separaNumero(int numero) {
		
		int numeroSeparado = 0;
		
		numeroSeparado = numero % 10;
	
		return numeroSeparado;
	} 

}
