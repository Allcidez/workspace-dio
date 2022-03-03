package br.dio.desafios.dominio;

public class Curso {
	private String titutlo;
	private String descricao;
	private int cargaHoraria;
	
	public Curso() {
		
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
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
}
