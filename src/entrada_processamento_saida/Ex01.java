package entrada_processamento_saida;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
 
		int a, b, area;
		
		System.out.println("Digite a altura do retângulo:");
		a = ler.nextInt();
		
		System.out.println("Digite a base do retângulo:");
		b = ler.nextInt();
		
		area = (a*b);
		
		System.out.printf("A área do retângulo é: %d", area);
		
		ler.close();
	}

}
