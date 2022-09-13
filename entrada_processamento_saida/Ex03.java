package entrada_processamento_saida;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, area;
		
		System.out.println("Digite a altura do triângulo:");
		a = ler.nextInt();
		
		System.out.println("Digite a base do triângulo:");
		b = ler.nextInt();
		
		area = (a*b);
		
		System.out.printf("A área do triângulo é: %d", area);
		
		ler.close();

	}

}
