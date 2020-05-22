import java.io.*;
import java.math.*;

class pregunta4 {

    public static void calcularoperacionesADQY() {}

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int n1;
		int n2;
		int opc;
		int respuesta;
		// definir variables
		// datos de entrada
		System.out.println("Ingrese número 1: ");
		n1 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese número 2: ");
		n2 = Integer.parseInt(bufEntrada.readLine());
		// opciones
		System.out.println("Ingrese una opción: ");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Dividir");
		System.out.println("4. Multiplicar");
		System.out.println("5. pontencia");
		opc = Integer.parseInt(bufEntrada.readLine());
		// proceso y datos de salida
		switch (opc) {
		case 1:
			respuesta = n1+n2;
			System.out.println("la suma es: "+respuesta);
			break;
		case 2:
			respuesta = n1-n2;
			System.out.println("la resta es: "+respuesta);
			break;
		case 3:
			respuesta = n1/n2;
			System.out.println("la división es: "+respuesta);
			break;
		case 4:
			respuesta = n1*n2;
			System.out.println("la multiplicación es: "+respuesta);
			break;
		case 5:
			respuesta = Math.pow(n1,n2);
			System.out.println("la potencia es: "+respuesta);
			break;
		default:
			System.out.println("Opción incorrecta");
		}
	}


}