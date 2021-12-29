package G_Streams.basics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class JavaMap {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::println;
		
		List<String> bandas = Arrays.asList("RHCP", "Morcheeba", "Adriana Calcanhoto");
		bandas.stream().map(b -> b).forEach(print);
		
		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeira = n -> n.charAt(0) + "";
		UnaryOperator<String> grito = n -> n + "!!!";
		
		System.out.println("Function Composition: ");
		bandas.stream()
			.map(maiuscula)
			.map(primeira)
			.map(grito)
			.forEach(print);
	}
}
