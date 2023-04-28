import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Locale;

class Gravity {
	public static void main(String[] args) {

		Locale locale = new Locale("en", "US");
		DecimalFormat df = (DecimalFormat) DecimalFormat.getInstance(locale);
		double peso, gravidade, pesoNaLua, taxaGravitacional = 0;

		peso = 80;
		gravidade = 0.17;
		System.out.println("gravidade " + df.format(gravidade));

		taxaGravitacional = peso * gravidade;
		System.out.println("taxa " + df.format(taxaGravitacional));

		pesoNaLua = peso - taxaGravitacional;
		System.out.println("Se você pesa " + df.format(peso) + " na Terra, então na Lua você vai pesar " + df.format(taxaGravitacional) + " quilos a menos, ou seja, " + df.format(pesoNaLua) + " KG.");
 	}
}

