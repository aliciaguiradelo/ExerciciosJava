package entrada_processamento_saida;

import java.util.Scanner;

public class Ex49DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int inicio,fim,i,soma=0;
		inicio=0;
		i=inicio;
		System.out.printf("Digite um número inicial");
		inicio = ler.nextInt();
		System.out.printf("Digite um número final");
		fim = ler.nextInt();
		do {
			System.out.printf("Digite um número final que seja válido:");
			fim = ler.nextInt();
		}while(inicio>=fim);
		i=inicio;
		do {
			soma=soma+i;
			i++;
			System.out.println(soma);
		}while(i<=fim);
		ler.close();

	}

}
