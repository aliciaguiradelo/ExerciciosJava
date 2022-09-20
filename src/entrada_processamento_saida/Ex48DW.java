package entrada_processamento_saida;

import java.util.Scanner;

public class Ex48DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n,i=0;
		System.out.printf("Digite um número");
		n = ler.nextInt();
		do {
			i++;
			System.out.println(i);
		}while(i<n+20);
		ler.close();

	}

}
