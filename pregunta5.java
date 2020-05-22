import java.io.*;
import java.math.*;

public class pregunta5 {

    public static void IncrementoAlSalarioDeUnProfesorADQY() {}

	public static void main(String args[]) {
		double ano;
		int año;
		int incremento;
		int salario;
		double salario_inicial;
		double salario_recibido;
		// definir variables
		// proceso y datos de entrada
		for (incremento=1;incremento<=6;incremento++) {
			System.out.println("PROCESO "+incremento);
			salario_inicial = 1400;
			ano = incremento;
			salario_recibido = salario_inicial*Math.pow((1.1),(ano));
			// datos de salida
			System.out.println("Valor de salario inicial: "+salario_inicial);
			System.out.println("Valor de salario recibido: "+salario_recibido);
			System.out.println("Valor de año: "+ano);
			System.out.println("");
		}
	}


}

