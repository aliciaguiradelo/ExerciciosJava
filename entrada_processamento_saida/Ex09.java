package entrada_processamento_saida;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int num1, num2;

		System.out.printf("Informe o primeiro valor: ");
		num1 = scn.nextInt();

		System.out.printf("Informe o segundo valor: ");
		num2 = scn.nextInt();

		if (num1 < num2) {
			System.out.printf("Menor valor digitado: %d", num1);
		} else {
			System.out.printf("Menor valor digitado: %d", num2);
		}

		scn.close();
	}

}
