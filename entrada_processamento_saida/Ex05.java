package entrada_processamento_saida;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double tempC, tempF;
		
		System.out.printf("Digite a temperatura em Celsius: ");
		tempC = ler.nextFloat();
		
		tempF = (tempC * 1.8) + 32;
		
		System.out.printf("Temperatura em fahrenheit: %.1f", tempF);
		
		ler.close();
	}

}


