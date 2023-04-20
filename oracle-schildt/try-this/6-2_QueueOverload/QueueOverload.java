class QueueOverload {

	private int[] queueOverloaded;
	private char putData, getData = 0;

	QueueOverload(int size) {
		queueOverloaded = new int[size];
	}

	QueueOverload(QueueOverload objectOfItself) {
		putData = objectOfItself.putData;
		getData = objectOfItself.getData;
		queueOverloaded = new int[objectOfItself.queueOverloaded.length];

		for (int i = getData; i < putData; i++) {
			queueOverloaded[i] = objectOfItself.queueOverloaded[i];
		}
	}

	QueueOverload(char[] charArray) {
		putData = 0;
		getData = 0;
		queueOverloaded = new int[charArray.length];

		for (int pos = 0; pos < charArray.length; pos++) {
			put(charArray[pos]);
		}
	}

	void put(char num) {
		if(putData == queueOverloaded.length) {
			System.out.println(" - Fila Cheia!");
			return;
		}

		queueOverloaded[putData++] = num;
	}

	int get() {
		if (getData == putData) {
			System.out.println(" - Fila Vazia...");
			return (char) 0;
		}
		return queueOverloaded[getData++];
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[[ ");
		for (int i = getData; i < putData; i++) {
			sb.append((char) queueOverloaded[i]);
			if (i < putData - 1) {
				sb.append(", ");
			}
		}
		sb.append(" ]]");
		return sb.toString();
	}

	public static void main(String... args) {
		System.out.println("Start Queueing...");
		QueueOverload myQueue = new QueueOverload(2);
		myQueue.put('a');
		myQueue.put('c');
		System.out.println("Minha fila - " + myQueue);

		QueueOverload bookQueue = new QueueOverload(30);
		for(int i = 0; i < 26; i++) {
			char ch = (char) ('A' + i);
			bookQueue.put(ch);
		}
		System.out.println("Alpha Line - " + bookQueue);

		QueueOverload empty = new QueueOverload(10);
		empty.get();
		System.out.println("Fila Vazia " + empty);

		QueueOverload random = new QueueOverload(10);
		for(int i = 0; i < 10; i++) {
			random.put((char) ('0' + i));
		}
		System.out.println("Fila Aleatória - " + random);
	}
}
