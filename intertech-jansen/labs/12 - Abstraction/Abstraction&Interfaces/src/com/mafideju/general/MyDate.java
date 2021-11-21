package com.mafideju.general;

public class MyDate {

	private byte day;
	private byte month;
	private short year;

	public MyDate() {
		this(1, 1, 1900);
	}
	
	public MyDate(int m, int d, int y) {
		setDate(m, d, y);
	}
	
	public String toString() {
		return month + "/" + day + "/" + year;
	}
	public void setDate(int m, int d, int y) {
		if (valid(d, m, y)) {
			day = (byte) d;
			year = (short) y;
			month = (byte) m;
		}
	}
	
	public static void leapYears() {
		for (int i = 1752; i <= 2020; i = i + 4) {
			if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
				System.out.println("The year " + i + " is a leap year");
			}
		}
	}
			
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (valid(day, month, year)) {
			this.day = (byte) day;
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		if (valid(day, month, year)) {
			this.month = (byte) month;
		}
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		if (valid(day, month, year)) {
			this.year = (short) year;
		}
	}
	
	private boolean valid(int day, int month, int year) {
		if (day > 31 || day < 1 || month > 12 || month < 1) {
			System.out.println("Attempting to create a non-valid date" + month + "/" + day + "/" + year);
			return false;
		}
		
		switch (month) {
			case 4:
			case 6:
			case 9:
			case 11:
				return (day <= 30);
			case 2:
				return day <= 28 || (day == 29 && year % 4 == 0);
			}
		return true;
	}
	
	public boolean equals(Object o) {
		if (o instanceof MyDate) {
			MyDate d = (MyDate) o;
			if ((d.day == day) && (d.month == month) && (d.year == year)) {
				return true;
			}
		}
		return false;
	}
}
