package entrada_processamento_saida;

import java.util.Scanner;

public class Ex50F {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int inicio,fim,i;
		System.out.printf("Digite um número inicial");
		inicio = ler.nextInt();
		System.out.printf("Digite um número final");
		fim = ler.nextInt();
		while(fim<10) {
			System.out.printf("Digite um número final maior que 10:");
			fim = ler.nextInt();
		}
		for(i=inicio;i<=fim;i++) {
			if(i>=10 && i%2==0) {
				System.out.println(i);
			}
			
			
		}
		ler.close();

	}

}
