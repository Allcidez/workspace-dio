package br.dio.desafios2;

import java.io.IOException;
import java.util.Scanner;

	public class AumentoCinema {
		
	    public static void main(String[] args) throws IOException {

	    	Scanner leitor = new Scanner(System.in);
	    	double A = leitor.nextDouble();
	    	double B = leitor.nextDouble();
	    	
	    	//Escreva aqui a sua lógica
	    	
	    	System.out.println(String.format("%.2f", (((B/A)-1)*100)) + "%");
	    	//System.out.printf("%.2f", ((B/A)-1)*100);
	    	
	    	
	    }
		
	}
