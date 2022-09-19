package entrada_processamento_saida;

import java.util.Scanner;

public class Ex32DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b;
		
		System.out.printf("Digite o primeiro número: ");
        a = ler.nextInt();
		do {
	            System.out.printf("Digite o segundo número: ");
	            b = ler.nextInt();
	        }
	    while(a>b);
		System.out.printf(" %d < %d", a,b);

		
		
		ler.close();

	}

}

