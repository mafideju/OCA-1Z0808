import java.io.*;
import entity.Help;

public class Main {
	public static void main(String... args) {
		Help help = new Help("utils/help.txt");
		PrintWriter printer = new PrintWriter(System.out, true);
		String topic;

		printer.print("for, if, switch, continue, break...");
		printer.println("Escolha o tópico. Digite pare para sair.");
		do{
			topic = help.getSelection();
			if(!help.helpOn(topic)) {
				printer.println("Topico não encontrado!\n");
			}
		} while(topic.compareTo("pare") != 0);		
	}
}
