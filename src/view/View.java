package view;

import java.util.Scanner;

import model.Aritmetica;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o Primeiro Número");
		int primeiroNumero = scanner.nextInt();
		System.out.println("Digite o Segundo Número");
		int segundoNumero = scanner.nextInt();
		
		Aritmetica aritmetica = new Aritmetica();
		aritmetica.soma(primeiroNumero, segundoNumero);
	
	}

}
