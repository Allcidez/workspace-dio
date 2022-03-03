package br.com.dio.exercicios.loops;


/*
 Crie um vetor de 6 número inteiros
 e mostre-os na ordem inversa. 
*/
public class Ex1_OrdemInversa {

	public static void main(String[] args) {

		int[] vetor = {-5, -6, 15, 50, 8, 4};
		int count = 0;  		
		
		System.out.println("Vetor Original: ");
		
		while (count < vetor.length) {			
			System.out.print(vetor[count]+" ");
			count++;
		}
		
		System.out.println("\nVetor Inverso: ");
		
		for (int i = (vetor.length-1); i>=0; i-- ) {
			System.out.print(vetor[i]+" ");
		}
			

	}
}
