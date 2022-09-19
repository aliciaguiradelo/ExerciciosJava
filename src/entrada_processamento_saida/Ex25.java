package entrada_processamento_saida;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i;

		
		System.out.printf("Digite o número:");
		i = ler.nextInt();
		
		if (i % 2 == 0) {
			System.out.printf("O número é par!");
		}
		
		else {
			System.out.printf("O número é ímpar!");
		}

		ler.close();
	}

}
