package br.com.dio.exercicios.loops;
/*
 *  Faça um programa que peça uma nota, entre 0(zero) e 10(dez).
 *  Mostre uma mesnagem caso o valor seja inválido
 *  e continue pedindo até que o usuário informe um valor válido
 */

import java.util.Scanner;

public class Ex2_Nota {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		int nota;
		
		System.out.println("Digite a nota: ");
		nota = scan.nextInt();			
		
		while ( nota < 0 | nota > 10 ) {
			
			System.out.println("Nota Inválida! Digite novamente");
			nota = scan.nextInt();		
		} ;
		
		System.out.println("A Nota informada foi: " + nota);
	}

}
