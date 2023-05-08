class Queue {

	private int[] queue;
	private int putData, getData = 0;

	Queue(int size) {
		queue = new int[size];
	}

	void put(int num) {
		if(putData == queue.length) {
			System.out.println(" - Fila Cheia!");
			return;
		}

		queue[putData++] = num;
	}

	int get() {
		if (getData == putData) {
			System.out.println(" - Fila Vazia...");
			return 0;
		}
		return queue[getData++];
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[[ ");
		for (int i = getData; i < putData; i++) {
			sb.append((char) queue[i]);
			if (i < putData - 1) {
				sb.append(", ");
			}
		}
		sb.append(" ]]");
		return sb.toString();
	}

	public static void main(String... args) {
		System.out.println("Start Queueing...");
		Queue myQueue = new Queue(2);
		myQueue.put('a');
		myQueue.put('c');
		System.out.println("Minha fila - " + myQueue);

		Queue bookQueue = new Queue(30);
		for(int i = 0; i < 26; i++) {
			char ch = (char) ('A' + i);
			bookQueue.put(ch);
		}
		System.out.println("Alpha Line - " + bookQueue);

		Queue empty = new Queue(10);
		empty.get();
		System.out.println("Fila Vazia " + empty);

		Queue random = new Queue(10);
		for(int i = 0; i < 10; i++) {
			random.put((char) ('0' + i));
		}
		System.out.println("Fila Aleatória - " + random);
	}
}
