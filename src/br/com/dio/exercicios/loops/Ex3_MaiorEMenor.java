package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 * Faça um programa que leia 5 números
 * e informe o maior número
 * e a média desses números.
 */

public class Ex3_MaiorEMenor {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero; 
		int maiorNumero = 0;		
		int soma = 0;				
		int count = 0; 
		
		do {
			
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			soma += numero;
			
			if (maiorNumero < numero )
			   maiorNumero = numero;
			   
			++count;
			
		} while (count < 5);
		
		System.out.println("O Maior foi: " + maiorNumero);
		System.out.println("A Média foi: " + (soma/count));
		
	}
	
}
