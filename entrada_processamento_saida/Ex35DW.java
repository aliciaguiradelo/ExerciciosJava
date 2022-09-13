package entrada_processamento_saida;

import java.util.Scanner;

public class Ex35DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a,i,t;
		i=1;
		
		do {
			System.out.printf("Digite um numero positivo:");
			a = ler.nextInt();
		}
		while (a<=0);
		
		do {
			t = a * i;
			i ++;
			System.out.printf("%d X %d = %d\n", a,i,t);
		}
		while (i<=10);
		
		
		
		
		ler.close();

	}

}
