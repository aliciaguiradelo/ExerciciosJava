package entrada_processamento_saida;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, d, media;
		
		System.out.println("Digite o primeiro número:");
		a = ler.nextInt();
		
		System.out.println("Digite o segundo número:");
		b = ler.nextInt();
		
		System.out.println("Digite o terceiro número:");
		c = ler.nextInt();
		
		System.out.println("Digite o quarto número:");
		d = ler.nextInt();
		
		media = (a+b+c+d)/4;
		
		System.out.printf("A média é: %d", media);
		
		ler.close();

	}

}
