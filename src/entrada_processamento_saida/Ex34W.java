package entrada_processamento_saida;

import java.util.Scanner;

public class Ex34W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("TABUADA DO NUMERO 5");
		
		int i,t;
		i=1;
		
		while( i <= 10) {
			t = 5*i;
			System.out.printf("5 X %d = %d\n",i,t);	
			i ++;
		}
		
		System.out.println("FIM");
		
		
		ler.close();

	}

}
