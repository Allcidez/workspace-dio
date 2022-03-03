package br.dio.desafios3;

import java.io.IOException;
import java.util.Scanner;

public class NotacaoCientifica {
	
	public static void main(String[] args) {		
		
		Scanner leitor = new Scanner(System.in);
		
		//Escreva aqui o seu código
		double X;
		
		X = leitor.nextDouble();
		
		//System.out.printf("%.4E", X);	
		System.out.println(String.format((String.valueOf(X).startsWith("-") ? "" : "+") + "%.4E", X));
		
	}

}
