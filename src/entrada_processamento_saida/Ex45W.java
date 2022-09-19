package entrada_processamento_saida;

import java.util.Scanner;

public class Ex45W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i=1, qnt;
		float soma, media, positiv, negativ,n,perposi,perneg, maior, menor;
		maior=0;
		menor=0;
		positiv=0;
		negativ=0;
		soma=0;
		media=0;
		perposi=0;
		perneg=0;
		
		System.out.printf("Digite a quantidade de valores:");
		qnt = ler.nextInt();
		while(qnt<0 || qnt>20) {
			System.out.print("Digite um número válido");
		}
		
		while(i<=qnt) {
			System.out.printf("Digite o %d numero", i);
			n=ler.nextFloat();
			if(i==1) {
				maior = n;
				menor=n;
			}
			else {
				if(n>maior) {
					maior=n;
				}
				else if(n<menor) {
					menor=n;
				}
					
			}
			if(n>0) {
				positiv=positiv+1;
			}
			else {
				negativ=negativ+1;
			}
			
			soma=soma+n;
			media=soma/qnt;
			perposi=(positiv*100)/qnt;
			perneg=(negativ*100)/qnt;
			i++;
			
		}
		System.out.printf("O maior numero é:%.2f\n", maior);
		System.out.printf("O menor numero é:%.2f\n", menor);
		System.out.printf("A soma é: %.2f\n", soma);
		System.out.printf("A media é:%.2f\n", media);
		System.out.printf("A poscentagem de positivos é:%.2f\n", perposi);
		System.out.printf("A porcentagem de negativos é:%.2f\n", perneg);
		ler.close();
		

	}

}
