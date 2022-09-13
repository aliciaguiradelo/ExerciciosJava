package entrada_processamento_saida;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float p, a, imc;
		String g;
		
		System.out.printf("Digite seu gênero:");
		g = ler.next();
		
		System.out.printf("Digite seu peso:");
		p = ler.nextFloat();
		
		System.out.printf("Digite sua altura:");
		a = ler.nextFloat();
		
		imc = p/(a*a);
		
		if ((g == "Masculino") || (g == "masculino")) {
			if (imc<20) {
				System.out.printf("Abaixo do peso! Seu imc é %.2f", imc);
			}
			
			else if (imc >=25) {
				System.out.printf("Acima do peso! Seu imc é %.2f", imc);
			}
			
			else {
				System.out.printf("Peso ideal! Seu imc é %.2f", imc);
			}
		}
		
		else {
			if (imc<19) {
				System.out.printf("Abaixo do peso! Seu imc é %.2f", imc);
			}
			
			else if (imc >=24) {
				System.out.printf("Acima do peso! Seu imc é %.2f", imc);
			}
			
			else {
				System.out.printf("Peso ideal! Seu imc é %.2f", imc);
			}
		}
		
		ler.close();


	}

}
