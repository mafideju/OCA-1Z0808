package com.mafideju.tests;

import com.mafideju.helpers.MyDate;

public class TestMyDate { 

	public static void main(String[] args) { 
	
		MyDate date1 = new MyDate(11,11,1918);
		MyDate date2 = new MyDate();
		
		date2.dia = 02;
		date2.mes = 05;
		date2.ano = 1983;
		
		MyDate date3 = new MyDate();
		date3.setDate(21,4,1968);
		
		MyDate date4 = new MyDate();
		
		String str1 = date1.toString();
		String str2 = date2.toString();
		String str3 = date3.toString();
		String str4 = date4.toString();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		// MyDate.leapYears();
	}
	
}