package entrada_processamento_saida;

import java.util.Scanner;

public class Ex44DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;
		float num, maior,soma,media;
		
		i=1;
		maior=0;
		soma=0;
		media=0;
		
		do {
			System.out.printf("Digite o %d número", i);
			num = ler.nextFloat();
			do {
				System.out.printf("Digite um número válido:");
				num = ler.nextFloat();
			}while(num<0);
			if(i==1) {
				maior=num;
			}
			else if(i>maior) {
				maior = num;
			}
			soma = soma + num;
			i ++;
			media=soma/10;
		}while(i<=20);
		System.out.printf("O maior número é:%.2f", maior);
		System.out.printf("A soma é:%.2f", soma);
		System.out.printf("A média é:%.2f", media);
		ler.close();

	}

}
