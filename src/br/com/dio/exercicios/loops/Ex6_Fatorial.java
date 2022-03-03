package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 
 Ex.: 5!= 120 ( 5 x 4 x 3 x 2 x 1 = 120 )
 
*/
public class Ex6_Fatorial {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Fatorial de: ");
		int fatorial = scan.nextInt();
		
		int multiplicacao = 1;
		
		for (int fat=fatorial; fat >= 1; fat-- ) {
			
			multiplicacao *= fat; 
			
		}
		
		System.out.println("Fatorial de " + fatorial + " != " + multiplicacao);
		
	}

}
