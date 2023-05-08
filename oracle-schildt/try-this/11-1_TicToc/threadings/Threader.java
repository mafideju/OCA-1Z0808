package threadings;

import threadings.TicToc;

public class Threader implements Runnable {
	public Thread threader;
	public TicToc tictoc;

	public Threader(String name, TicToc tictoc) {
		threader = new Thread(this, name);
		this.tictoc = tictoc;
		threader.start();
	}

	public void run() {
		if(threader.getName().compareTo("tic") == 0) {
			for(int i = 0; i < 5000; i++) this.tictoc.tic(true);
			this.tictoc.tic(false);
		} else {
			for(int i = 0; i < 5000; i++) this.tictoc.toc(true);
			this.tictoc.toc(false);
		}
	}
}
