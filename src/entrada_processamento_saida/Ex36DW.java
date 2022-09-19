package entrada_processamento_saida;

import java.util.Scanner;

public class Ex36DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a,b,c,t;
		
		do {
			System.out.printf("Digite um número positivo:");
			a = ler.nextInt();
		} while(a<=0);
		
		System.out.printf("Digite o primeiro valor do intervalo:");
		b = ler.nextInt();
		
		do {
			System.out.printf("Digite o segundo valor do intervalo:");
			c = ler.nextInt();
		} while(b>=c);
		
		do {
			t = a*c;
			System.out.printf("%d X %d = %d\n", a,c,t);
			c--;
		} while(b<c);
		
		ler.close();
		

	}

}
