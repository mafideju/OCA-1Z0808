package entity;

import java.io.*;

public class Help {
	PrintWriter printer = new PrintWriter(System.out, true);
	String helpfile;

	public Help(String helpfile) {
		this.helpfile = helpfile;
	}

	public boolean helpOn(String helpTerm) {
		int singleChar;
		String topic;
		String info;

		try(BufferedReader reader = new BufferedReader(new FileReader(this.helpfile))) {
			do {
				singleChar = reader.read();
				if(singleChar == '#') {
					topic = reader.readLine();
					if(helpTerm.compareTo(topic) == 0) {
						do{
							info = reader.readLine();
							if(info != null) printer.println(info);
						}while(info != null && (info.compareTo("") != 0));
						return true;
					}
				}
			} while(singleChar != -1);
		} catch(IOException e) {
			printer.println("Erro ao procurar ajuda." + e);
			return false;
		}
		return false;
	}

	public String getSelection() {
		String topic = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			topic = reader.readLine();
		} catch(IOException e) {
			printer.println(e);
		}
		return topic;
	}
}
