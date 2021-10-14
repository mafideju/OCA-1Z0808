package com.mafideju.helpers;

public class MyDate {

	int dia, mes, ano;
	
	public MyDate() {
		this(11, 9, 2001);
	}
	
	public MyDate(int dia, int mes, int ano) {
		setDate(dia, mes, ano);
	}
	
	public void setDate(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "MyDate [Hoje é dia = " + this.dia + ", mes = " + this.mes + ", do ano = " + this.ano + "]";
	}
	
	
}
