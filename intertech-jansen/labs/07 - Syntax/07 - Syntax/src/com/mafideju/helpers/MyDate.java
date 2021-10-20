package com.mafideju.helpers;

public class MyDate {

	public int dia;
	public int mes;
	public int ano;
	
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
	
	
	public static void leapYears() {
		for(int i = 1752; i < 2100; i++) {
			if (i % 4 == 0) {
				System.out.println("O ano " + i + " é um ano bissexto");
			}
		}
	}

	@Override
	public String toString() {
		return "MyDate [Hoje é dia = " + this.dia + ", mes = " + this.mes + ", do ano = " + this.ano + "]";
	}
	
	
}
