package br.dio.desafios;

import java.time.LocalDate;

import br.dio.desafios.dominio.Curso;
import br.dio.desafios.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso();
		curso1.setTitutlo("Curso Java");
		curso1.setDescricao("Descrição do curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitutlo("Curso JS");
		curso2.setDescricao("Descrição do curso JS");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitutlo("Mentoria Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
		System.out.println("curso1");
		System.out.println("curso2");
		System.out.println("mentoria");

	}

}
