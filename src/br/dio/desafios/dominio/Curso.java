package br.dio.desafios.dominio;

import java.util.Objects;

public class Curso {
	private String titutlo;
	private String descricao;
	private int cargaHoraria;

	public Curso() {

	}

	public Curso(String titutlo, String descricao, int cargaHoraria) {
		this.titutlo = titutlo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
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

	@Override
	public String toString() {
		return "Curso [titutlo=" + titutlo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cargaHoraria, descricao, titutlo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return cargaHoraria == other.cargaHoraria && Objects.equals(descricao, other.descricao)
				&& Objects.equals(titutlo, other.titutlo);
	}

}
