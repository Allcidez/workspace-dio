package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 * Faça um programa que leia um vetor de 6 caracteres,
 * e diga quantas consoants foram lidas.
 * Imprima as consoantes.
 * 
 */
public class Ex2_Consoantes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String letras[] = new String[6];
		int quantidadeConsoantes = 0;
		
		int count = 0;
		
		do {
			System.out.println("Letra:");
			String letra = scan.next();			
			
			String anotherString;
			if ( !(letra.equalsIgnoreCase("a")|
			       letra.equalsIgnoreCase("e")|
				   letra.equalsIgnoreCase("i")|
				   letra.equalsIgnoreCase("o")|
				   letra.equalsIgnoreCase("u")) ) {
				letras[count] = letra;
				quantidadeConsoantes++;
			}
			
			count++;
				
		} while (count < letras.length);
		
		for (String consoante : letras) {
			if (consoante != null)
			System.out.print(consoante + " ");
		}
		
	}

}
