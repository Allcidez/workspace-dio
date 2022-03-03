package br.dio.desafios;

import java.io.IOException;
import java.util.Scanner;

public class Desaf2_3_ExibeNumPares {

	public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
   	   int numero = 0;

   	   do {
   	     
   	       System.out.println("Digite um número maior que 0 (zero): ");  
   	       numero = scan.nextInt();
   	       
   	       if (numero <=0 )      
   	           System.out.println("* * * número invalido! * * *");
   	              
   	   } while (numero == 0);

   	   for (int num = 1 ; num<=numero; num++) {
   	  
   	       if (num % 2 == 0)
   	           System.out.println(num);
   	     
   	    }
   	    
   	    System.out.println(numero);
   	    
   	}
  
}
