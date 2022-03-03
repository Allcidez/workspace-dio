package br.dio.desafios.dominio;

import java.time.LocalDate;

public class Mentoria {
	private String titutlo;
	private String descricao;
	private LocalDate data;
	
	public Mentoria(){}
	
	
	public Mentoria(String titutlo, String descricao, LocalDate data) {
		super();
		this.titutlo = titutlo;
		this.descricao = descricao;
		this.data = data;
	}


	public String getTitutlo() {
		return titutlo;
	}


	public void setTitutlo(String titutlo) {
		this.titutlo = titutlo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "Mentoria [titutlo=" + titutlo + ", descricao=" + descricao + ", data=" + data + "]";
	}
		
}
