package entrada_processamento_saida;

import java.util.Scanner;

public class Ex48F {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int n,i;
		System.out.printf("Digite um número");
		n = ler.nextInt();
		for(i=0;i<n+20;i++) {
			i++;
			System.out.println(i);
		}
		ler.close();

	}

}
