import enums.Transport;

public class EnumBasics {
	public static void main(String... args) {
		Transport[] transports = Transport.values();

		for (Transport transport : transports) {
			System.out.println("A velocidade do " + transport + " é cerca de "  + transport.getSpeed() + " Km/h.");
		}
	}
}
