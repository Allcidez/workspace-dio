package br.dio.desafios;

import java.util.Scanner;

public class DioDesafio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		int N = leitor.nextInt();		
		
		for (int i = 1; i<= N; i++) {
			if (i %2 == 0 ) System.out.println(i);
		}

	}

}
