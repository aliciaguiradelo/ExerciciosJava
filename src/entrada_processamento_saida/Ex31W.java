package entrada_processamento_saida;

import java.util.Scanner;

public class Ex31W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a;
		
		System.out.printf("Digite um número qualquer:");
		a = ler.nextInt();
		
		while (a<=0) {
			System.out.printf("Erro, número negativo!\nDigite um número positivo:");
			a = ler.nextInt();
		}
		System.out.printf("Número psitivo válido!");
		
		ler.close();

	}

}

