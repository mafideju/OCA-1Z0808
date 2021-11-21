package com.mafideju.entity;

public class EncapsulatedMyDate {

	private int dia;
	private int mes;
	private int ano;
	
	public EncapsulatedMyDate() {
		this.setDia(11);
		this.setMes(9);
		this.setAno(2001);
	}
	
	public EncapsulatedMyDate(int dia, int mes, int ano) {
		setDate(dia, mes, ano);
	}
	
	public void setDate(int dia, int mes, int ano) {
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return "MyDate [Hoje é dia = " + getDia() + ", mes = " + getMes() + ", do ano = " + getAno() + "]";
	}
}
