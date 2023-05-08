import java.io.*;
import tretas.Threader;

public class MainThreader {
	public static void main(String... args) {
		Threader treta = new Threader("Teste Uno");
		Threader treta_dois = new Threader("Treta Dois");
		Threader treta_three = new Threader("Treta Three");
		PrintWriter printer = new PrintWriter(System.out, true);
		treta.setPriority(Thread.NORM_PRIORITY+2);
		treta_dois.setPriority(Thread.NORM_PRIORITY);
		treta_three.setPriority(Thread.NORM_PRIORITY-2);

		
		printer.println("Prioridade Treta: " + treta.getPriority());
		printer.println("Prioridade Treta Dois: " + treta_dois.getPriority());
		printer.println("Prioridade Treta Tres: " + treta_three.getPriority());

		printer.println("Thread Principal Começando...");
		do {
			for(int i = 0; i < 50; i++) {
				try {
					Thread.sleep(100);
				} catch(InterruptedException e) {
					printer.println("Interrompida: " + e);
				}
			}
		} while(treta.isAlive() || treta_dois.isAlive() || treta_three.isAlive());
		printer.println("Thread Principal Terminada.");
	}
}
