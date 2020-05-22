import java.io.*;

class pregunta2 {

    public static void calcularmontodebonoadqy() {}

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double bono;
		double montodebono;
		int premio;
		int puntos;
		int salariominimo;
		// definir variables
		// datos de entrada
		System.out.print("Ingrese el valor de puntos: ");
		puntos = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Escriba de cuanto es su salario minimo: ");
		salariominimo = Integer.parseInt(bufEntrada.readLine());
		// proceso
		bono = 0;
		if (puntos>=20 && puntos<=100) {
			bono = salariominimo*0.10;
		}
		if (puntos>=101 && puntos<=200) {
			bono = salariominimo*0.50;
		}
		if (puntos>=201) {
			bono = salariominimo*1;
		}
		// datos de salida
		System.out.println("Valor de bono: "+bono);
	}


}
