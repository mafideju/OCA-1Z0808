package com.mafideju.tests;

import com.mafideju.entity.EncapsulatedMyDate;

public class TestsEncapsulatedMyDate {
	public static void main(String[] args) { 
		
		EncapsulatedMyDate date1 = new EncapsulatedMyDate(11,11,1918);
		EncapsulatedMyDate date2 = new EncapsulatedMyDate();
		
		date2.setDia(02);
		date2.setMes(05);
		date2.setAno(1983);
		
		EncapsulatedMyDate date3 = new EncapsulatedMyDate();
		date3.setDate(21,4,1988);
		
		EncapsulatedMyDate date4 = new EncapsulatedMyDate();
		
		String str1 = date1.toString();
		String str2 = date2.toString();
		String str3 = date3.toString();
		String str4 = date4.toString();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}

}
