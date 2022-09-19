package entrada_processamento_saida;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.printf("Digite o primeiro lado: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o primeiro lado: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o primeiro lado: ");
		c = ler.nextInt();
		
		if ((a>b+c) || (b>a+c) || (c>a+b)) {
			System.out.printf(" Não é um triângulo!");
		}
		
		else if ((a==b) && (b==c)) {
			System.out.printf("É um triângulo equilátero!");
		}
		
		else if ((a != b) && (a !=c)) {
			System.out.printf("É um triângulo escaleno!");
		}
		
		else {
			System.out.printf("É um triângulo isósceles!");
		}

		
		ler.close();
	}

}
