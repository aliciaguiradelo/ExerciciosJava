package entrada_processamento_saida;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		float largura, altura, area;
		
		System.out.printf("Informe a largura(base): ");
		largura = scn.nextFloat();

		System.out.printf("Informe a altura valor: ");
		altura = scn.nextFloat();
		
		area = largura * altura;
		
		if(area > 100) {
			System.out.printf("Area: %.2f\n", area);
			System.out.printf("Terreno grande");
		} else {
			System.out.printf("Area: %.1fm", area);
		}

		scn.close();
	}

}
