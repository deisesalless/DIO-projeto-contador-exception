package edu.deisesales.exercicio4;

import java.util.Scanner;

public class Contador {
	
	static int numero1 = 0;
	static int numero2 = 0;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Por favor digite um numero inteiro: ");
		numero1 = input.nextInt();
		
		System.out.println("Por favor digite outro numero inteiro: ");
		numero2 = input.nextInt();
		
		try {
			
			calcular(numero1, numero2);
			
		} catch (ParametrosInvalidosException excecao) {
			System.out.println("O segundo parametro deve ser maior que o primeiro.");
		}
				
		input.close();

	}
	
	// Método para calcular a quantidade de interações
	public static void calcular(int numero1, int numero2) throws ParametrosInvalidosException {
		
		if (numero1 >= numero2) {
			throw new ParametrosInvalidosException();
		}
		
		int quantidade = numero2 - numero1;
		
		for (int cont = 1; cont <= quantidade ; cont++) {
			System.out.println("Numero: " + cont);
		}
	}

}
