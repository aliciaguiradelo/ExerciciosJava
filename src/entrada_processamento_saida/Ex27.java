package entrada_processamento_saida;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
        int i;

		System.out.printf("Digite o número:");
		i = ler.nextInt();
		
		if (i % 2 == 0) {
			System.out.printf("O resultado é: %d", i + 5);
		}
		
		else {
			System.out.printf("O resultado é: %d", i + 8);
		}

		ler.close();
	}
}