package com.mafideju.tests;

import com.mafideju.helpers.MyDate;
import java.lang.String;

public class PassByExperiment {

	public static void passObject(MyDate date) {
		date.ano = 2009;
	}
	
	public static void passPrimitive(int i) {
		i = 2010;
	}
	
	public static void passString(String s) {
		int yearSlash =s.lastIndexOf('/');
		s = s.substring(0, yearSlash + 1);
		s += "2012";
		System.out.println("New date string: " + s);
	}
	
	public static void passStringBuilder (String string) {
		StringBuilder builder = new StringBuilder();
		int yearSlash = string.lastIndexOf('/');
		string.substring(0, yearSlash + 1);
		builder.append("2012");
		System.out.println("New date string: " + builder); 
	}
	
	
	public static void main(String[] args) {
		MyDate date = new MyDate(1,20,2008);
		
		System.out.println("Before passing an object " + date);
		passObject(date);
		System.out.println("After passing an object " + date);
		
		System.out.println("Before passing a primitive " + date.ano);
		passPrimitive(date.ano);
		System.out.println("After passing a primitive " + date.ano);
		
		String x = date.toString();
		System.out.println("Before passing a String " + x);
		passString(x);
		System.out.println("After passing a String " + x);
		
		System.out.println("......................................................");
		
		String y = date.toString();
		System.out.println("Before passing a String " + y);
		passStringBuilder(y);
		System.out.println("After passing a String " + y);
	}

}
