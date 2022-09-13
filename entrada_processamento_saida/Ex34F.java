package entrada_processamento_saida;

import java.util.Scanner;

public class Ex34F {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		System.out.println("TABUADA DO NUMERO 5");
		
		int i,t;
		i=1;
		
		for(i = 1; i<=10; i++) {
			t = 5*i;
			System.out.printf("5 X %d = %d\n", i, t);
		}
		
		System.out.println("FIM");
		
		
		ler.close();

	}

}
