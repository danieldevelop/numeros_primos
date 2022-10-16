package numeros_primos;

import java.util.Scanner;

public class Numeros_primos {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		System.out.println("Ingrese un numero, para calcular sus numeros primos");
		int numero = Integer.parseInt(cin.nextLine());
		
		System.out.println("\n======= NUMEROS PRIMOS =======");
		for (int i = 1; i <= numero; i++) {
			int divisores = 0;
			
			for (int j = 1; j <= (i/2); j++) {
				if (divisores > 2) {
					break;
				}
				
				if ((i % j) == 0) {
					divisores += 2;
				}
			}
			
			if (divisores == 2) {
				System.out.print(i + " ");
			}
		}
		System.out.println(); // Salto de linea

	}

}
