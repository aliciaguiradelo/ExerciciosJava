package entrada_processamento_saida;

import java.util.Scanner;

public class Ex36F {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		int a,b,c,t, i;
		
		System.out.printf("Digite um número positivo:");
		a = ler.nextInt();
		
		while(a<=0) {
			System.out.print("Número inválido!\n");
			
			System.out.printf("Digite novamente:");
			a = ler.nextInt();
			
		}
		System.out.printf("Digite o primeiro valor do intervalo:");
		b = ler.nextInt();
		System.out.printf("Digite o segundo valor do intervalo:");
		c = ler.nextInt();
		
		while(b>=c) {
			System.out.print("Segundo valor é inválido!\n");
			
			System.out.printf("Digite-o novamente:");
			c = ler.nextInt();
			
		}
		
		for(i = c; i >= b; i--) {
			t = a * i;
			System.out.printf("%d X %d = %d\n", a,i,t);
		}
		
		ler.close();
	}

}
