package model;

public class Aritmetica {
	
	public int primeiroNumero;
	public int segundoNumero;
	
	
	public void soma (int primeiroNumero, int segundoNumero) {
		
		int result = 0;
		
		int[] primeiroSeparados;
		int[] segundoSeparados;
		int[] somaSeparados;
		
		primeiroSeparados = new int[3];
		segundoSeparados = new int[3];
		somaSeparados = new int [3];
		int i = 0; 
		while(primeiroNumero > 0) {
			
		primeiroSeparados[i] = separaNumero(primeiroNumero);
		primeiroNumero = primeiroNumero/10;
		i++;
		
		}
/*		
		for(int cont = 0; cont < primeiroSeparados.length; cont++) {
			System.out.println(primeiroSeparados[cont]);
		}
*/	
		int j = 0;
		while(segundoNumero > 0) {
		
		segundoSeparados[j] = separaNumero(segundoNumero);
		//System.out.println("Aqui é o segundo número separado "+segundoSeparados[j]);
		segundoNumero = segundoNumero/10;
		j++;	
		
		}
		
		for(int contSoma = 0; contSoma < 3; contSoma++) {
			somaSeparados[contSoma] = primeiroSeparados[contSoma] + segundoSeparados[contSoma];
			System.out.println(somaSeparados[contSoma]);
		}
		
		

		//System.out.println("resultado é: "+primeiroNumeroSeparado+segundoNumeroSeparado);
		//return result;
	}
	
	public int separaNumero(int numero) {
		
		int numeroSeparado = 0;
		
		numeroSeparado = numero % 10;
	
		return numeroSeparado;
	} 

}
