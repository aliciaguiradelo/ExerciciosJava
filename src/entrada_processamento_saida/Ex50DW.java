package entrada_processamento_saida;

import java.util.Scanner;

public class Ex50DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int inicio,fim,i;
		System.out.printf("Digite um número inicial");
		inicio = ler.nextInt();
		System.out.printf("Digite um número final");
		fim = ler.nextInt();
		do {
			System.out.printf("Digite um número final maior que 10:");
			fim = ler.nextInt();
		}while(fim<10);
		i=inicio+1;
		do {
			if(i>=10 && i%2==0) {
				System.out.println(i);
			}
			i=i+1;
			
		}while(i>inicio && i<=fim);
		ler.close();

	}

}
