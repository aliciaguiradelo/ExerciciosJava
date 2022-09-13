package entrada_processamento_saida;

import java.util.Scanner;

public class Ex36W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a,b,c,t;
		
		
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
		
		while(b>c) {
			System.out.print("Segundo valor é inválido!\n");
			
			System.out.printf("Digite-o novamente:");
			c = ler.nextInt();
			
		}
		while(b<=c) {
			
			t = a*c;
			
			System.out.printf("%d X %d = %d\n", a,c,t);
			c--;
			
		}
		
		ler.close();
		
		
		

	}

}
