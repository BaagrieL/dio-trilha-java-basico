package deafiocontrolefluxo;

import java.util.ArrayList;
import java.util.Scanner;
import exceptions.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		try {
			imprimirResultado(contar(compararNumeros(pedirNumeros(ler))));

			
		} catch (ParametrosInvalidosException e) {
			 System.out.println("Erro: "+ e.getMessage());
		}
	}
	
	private static int[] pedirNumeros(Scanner scanner) {
		System.out.println("Insira o primeiro número:");
		int num1 = scanner.nextInt();
 
		System.out.println("Insira o o segundo número:");
		int num2 = scanner.nextInt();
		
		int[] numeros = {num1, num2};
		return numeros;
		
	}

	static int[] compararNumeros(int[] numeros) throws ParametrosInvalidosException {
		if(numeros[0] > numeros[1]) {
			throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro!");
		} else {
			return numeros;
		}
	}
	
	static ArrayList<Integer> contar(int[] numeros) {
		ArrayList<Integer> numerosContados = new ArrayList<Integer>();
		for(int i = numeros[0] + 1; i <= numeros[1]; i++) {
			numerosContados.add(i);
		}
		
		return numerosContados;
	}
	
	static void imprimirResultado(ArrayList<Integer> numerosContados) {
		System.out.println("Resultado: ");
		
		for(int numero : numerosContados) {
			System.out.println(numero);
		}
	}
}
