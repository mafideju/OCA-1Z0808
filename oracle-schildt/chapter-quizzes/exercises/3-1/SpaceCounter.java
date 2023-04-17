import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SpaceCounter implements Runnable {
	public static void main (String[] args) throws java.io.IOException {
		OperationStuff ops = new OperationStuff();
		ops.basicOps();

		char userInput;
		int userInputCount = 0, space = 0, enterCount = 1;

		System.out.println("Insira um caracter e pressione enter. Contaremos os espaços apenas.");
		System.out.println("Aperte '9' para sair.");

		do {
			userInput = (char) System.in.read();
			if (userInput != '\n') {
				if (userInput == '9') {
					int newTotal = userInputCount + 1;
					printer("Enters => ", enterCount);
					printer("Espaços => ", space);
					printer("Caracteres => ", (newTotal - space));
					printer("Entradas => ", newTotal);
					printer("Entradas Totais => ", (newTotal + enterCount));
					printer("Saiu!");
					return;
				} else if (userInput == '5') {
					SpaceCounter spaceCounter = new SpaceCounter();
					Thread thr = new Thread(spaceCounter);
					thr.start();
					printer("Thread do 5!");
					System.out.println("Thread do " + Thread.currentThread().getName());
					System.out.println("Rodando " + Thread.activeCount() + " Threads");
					thr.interrupt();
					System.out.println("Rodando " + Thread.activeCount() + " Threads");
					userInputCount++;
				} else {
					userInputCount++;
				}
			} else if (userInput == '\n') {
				enterCount++;
			}
			if (userInput == ' ') {
				space++;
			}
		} while (userInput != '9');
	}

	static void printer(String key, int... value) {
		if (value.length == 1) {
			System.out.println(key + value[0]);
		} else {
			System.out.println(key + Arrays.toString(value).replaceAll("\\[|\\]", ""));
		}
	}

	@Override
	public void run() {
		System.out.println("Thread Auxiliar!");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.activeCount());
	}
}

class OperationStuff {
	protected void basicOps() {
		List<String> lista = new ArrayList<>();
		Map<String, String> frases = new HashMap<>();

		StringBuilder str = new StringBuilder("Basic Operations");
		lista.add(String.valueOf(str));
		StringBuilder revstr = str.reverse();
		lista.add(String.valueOf(revstr));

		StringBuilder palin = new StringBuilder("socorram me subi no onibus em marrocos");
		frases.put("Normal", String.valueOf(palin));
		StringBuilder palinVerse = palin.reverse();
		frases.put("Reverse", String.valueOf(palinVerse));

		if (palinVerse == palin) {
			lista.add("\n\t@#$*** PALINDROMO DETECTED ***$#@\n");
		}

		System.out.println(frases);
		System.out.println(lista);

		System.out.println(Thread.currentThread().getState());
	}
}