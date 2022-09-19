package entrada_processamento_saida;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float p1, p2, media;
		
		System.out.printf("Digite o valor da primeira prova:");
		p1 = ler.nextFloat();
		
		System.out.printf("Digite o valor da segunda prova:");
		p2 = ler.nextFloat();
		
		media = (p1+ (2*p2))/3;
				
		if (media>=5) {
			System.out.printf("Aprovado!");
		}
		
		else {
			System.out.printf("Reprovado!");
		}
		
		ler.close();
				

	}

}
