package entrada_processamento_saida;

import java.util.Scanner;

public class Ex49W {

	public static void main(String[] args) {
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
		i=inicio;
		while(i<=fim) {
			soma=soma+i;
			i++;
			System.out.println(soma);
		}
		ler.close();

	}

}
