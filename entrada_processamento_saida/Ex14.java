package entrada_processamento_saida;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		float peso, altura, imc;
		
		System.out.printf("Entre com o seu peso(kg): ");
		peso = scn.nextFloat();
		
		System.out.printf("Entre com o seu altura(kg): ");
		altura = scn.nextFloat();
		
		imc = peso / (altura * altura);
		
		if(imc < 20) {
			System.out.printf("Abaixo do peso");
		} else if (imc < 25) {
			System.out.printf("Peso ideal");
		}else {
			System.out.printf("Acima do peso");
		}
		
		
		
		scn.close();

	}

}
