import threadings.Threader;
import threadings.TicToc;
import java.io.PrintWriter;

public class MainThread {
	public static void main(String... args) {
		TicToc tictoc = new TicToc();
		Threader threadOne = new Threader("tic", tictoc);
		Threader threadTwo = new Threader("toc", tictoc);
		PrintWriter printer = new PrintWriter(System.out, true);

		try {
			threadOne.threader.join();
			threadTwo.threader.join();
		} catch(InterruptedException e) {
			printer.println("Exceção na Main: " + e);
		}
	}
}

