package entrada_processamento_saida;

import java.util.Scanner;

public class Ex35W {

	public static void main(String[] args) {
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
		
		while( i <= 10) {
			t = a*i;
			System.out.printf("%d X %d = %d\n",a,i,t);	
			i ++;
		}
		System.out.println("FIM");
		
		
		ler.close();

	}

}
