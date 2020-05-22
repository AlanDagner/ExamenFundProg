import java.io.*;

class pregunta1  {

	public static void calcularnotafinalADQY() {}

	public static void main(final String args[]) throws IOException {
		final BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String nota;
		double notafinal;
		final int nota_a;
		final int nota_b;
		final int nota_c;
		final int nota_d;
		String _a;
		String _b;
		String _c;
		String _d;
		// definir datos
		// datos de entrada 
		System.out.println("ingrese su primera nota");
		nota = bufEntrada.readLine();
		_a = bufEntrada.readLine();
		System.out.println("ingrese su segunda nota");
		nota = bufEntrada.readLine();
		_b = bufEntrada.readLine();
		System.out.println("ingrese su tercera nota");
		nota = bufEntrada.readLine();
		_c = bufEntrada.readLine();
		System.out.println("ingrese su cuarta nota");
		nota = bufEntrada.readLine();
		_d = bufEntrada.readLine();
		// proceso
		notafinal = nota_a*0.15+nota_b*0.20+nota_c*0.25+nota_d*0.40;
		// datos de salida 
		System.out.println("Su promedio final es: "+notafinal);
	}

}
