package entrada_processamento_saida;

import java.util.Scanner;

public class Ex48W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n,i=0;
		System.out.printf("Digite um número");
		n = ler.nextInt();
		while(i<n+20) {
			i++;
			System.out.println(i);
		}
		ler.close();

	}

}
