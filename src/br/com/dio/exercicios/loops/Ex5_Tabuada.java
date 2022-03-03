package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 Desenvolva um gerador de tabuada,
 capaz de gerar a tabuada de qualquer n�mero inteiro entre 1 a 10.
 O usu�rio deve informar de qual n�mero ele deseja ver a tabuada.
 A sa�da dever ser conforme o eemplo abaixo:
 
  Tabuada de 5:
  5 X 1 = 5 
  5 X 2 = 10
  ...
  5 X 10 = 50  
*/


public class Ex5_Tabuada {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int tabuada;
		
		System.out.println("Informa qual Tabuada: ");
		tabuada = scan.nextInt();

		
		System.out.println("Tabuada de "+ tabuada + " :");
		
		for ( int m = 1; m <= 10; m++ ) {
			
			System.out.println(tabuada + " X " + m + " = " + (tabuada*m));
			
		}	
	
	}

}
