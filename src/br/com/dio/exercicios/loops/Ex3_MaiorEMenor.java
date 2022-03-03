package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 * Fa�a um programa que leia 5 n�meros
 * e informe o maior n�mero
 * e a m�dia desses n�meros.
 */

public class Ex3_MaiorEMenor {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero; 
		int maiorNumero = 0;		
		int soma = 0;				
		int count = 0; 
		
		do {
			
			System.out.println("N�mero: ");
			numero = scan.nextInt();
			
			soma += numero;
			
			if (maiorNumero < numero )
			   maiorNumero = numero;
			   
			++count;
			
		} while (count < 5);
		
		System.out.println("O Maior foi: " + maiorNumero);
		System.out.println("A M�dia foi: " + (soma/count));
		
	}
	
}
