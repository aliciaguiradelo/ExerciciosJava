package entrada_processamento_saida;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.printf("Digite o primeiro valor:");
		a = ler.nextInt();
		System.out.printf("Digite o segundo valor:");
		b = ler.nextInt();
		System.out.printf("Digite o terceiro valor:");
		c = ler.nextInt();
		
		if ((a>b) && (b>c)) {
			System.out.printf("%d>%d>%d", c, b, a);
		}
		
		else if ((a>c) && (c>b)) {
			System.out.printf("%d<%d<%d", b, c, a);
		}
		else if ((b>a) && (a>c)) {
			System.out.printf("%d<%d<%d", c, a, b);
		}
		else if ((b>c) && (c>a)) {
			System.out.printf("%d<%d<%d", a, c, b);
		}
		else if ((c>a) && (a>b)) {
			System.out.printf("%d<%d<%d", b, a, c);
		}
		else {
			System.out.printf("%d<%d<%d", a, b, c);
		}
		
		
		
		ler.close();

	}

}