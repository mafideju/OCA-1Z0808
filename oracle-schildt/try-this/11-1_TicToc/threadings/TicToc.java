package threadings;

import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class TicToc {
	PrintWriter printer = new PrintWriter(System.out, true);
	String state;
	LocalDateTime now = LocalDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	String formattedDateTime = now.format(formatter);

	public synchronized void tic(boolean running) {
		if(!running) {
			state = "ticado";
			notify();
			return;
		}
		printer.println(formattedDateTime);

		
		state = "ticado";
		notify();
		
		try {
			while(!state.equals("tocado")) wait();
		} catch(InterruptedException e) {
			printer.println("Ruim no TIC" + e);
		}
	}

	public synchronized void toc(boolean running) {
		if(!running) {
			state = "tocado";
			notify();
			return;
		}
		printer.println(formattedDateTime);

		state = "tocado";
		notify();

		try {
			while(!state.equals("ticado")) wait();
		} catch(InterruptedException e) {
			printer.println("TOC broken " + e);
		}
	}
}
