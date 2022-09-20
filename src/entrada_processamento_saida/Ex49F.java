package entrada_processamento_saida;

import java.util.Scanner;

public class Ex49F {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int inicio,fim,i,soma=0;
		inicio=0;
		i=inicio;
		System.out.printf("Digite um número inicial");
		inicio = ler.nextInt();
		System.out.printf("Digite um número final");
		fim = ler.nextInt();
		while(inicio>=fim) {
			System.out.printf("Digite um número final que seja válido:");
			fim = ler.nextInt();
		}
		
		for(i=inicio;i<=fim;i++) {
			soma=soma+i;
			System.out.println(soma);
		}
		ler.close();

	}

}
