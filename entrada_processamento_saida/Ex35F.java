package entrada_processamento_saida;

import java.util.Scanner;

public class Ex35F {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		int a,i,t;
		i=1;
		
		System.out.printf("Digite um número positivo:");
		a = ler.nextInt();
		
		while(a<=0) {
			System.out.print("Número inválido!\n");
			
			System.out.printf("Digite novamente:");
			a = ler.nextInt();
			
		}
		for (i=1;i<=10;i++) {
			t = a * i;
			System.out.printf("%d X %d = %d\n", a,i,t);
		}
		
		
		ler.close();
	}

}
