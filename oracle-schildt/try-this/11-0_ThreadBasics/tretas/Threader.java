package tretas;

import java.io.*;
import java.lang.Thread;
import java.lang.Runnable;

public class Threader extends Thread {
	PrintWriter printer = new PrintWriter(System.out, true);

	public Threader(String name) {
		super(name);
		start();
	}

	public void run() {
		printer.println(getName() + " começando...");
		try {
			for(int i = 0; i < 10; i++) {
				Thread.sleep(400);
				printer.println("Thread: " + i);
			}
		} catch(InterruptedException e) {
			printer.println(getName() + " interropida!!");
		}
		printer.println(getName() + " finalizada.");
	}
}
