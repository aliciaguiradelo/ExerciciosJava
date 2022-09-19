package entrada_processamento_saida;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float cotacao, valor, total;
		
		System.out.printf("Informe o valor da cotação do hoje: ");
		cotacao = ler.nextFloat();
		
		System.out.printf("Informe o valor em dólares: ");
		valor = ler.nextFloat();
		
		
		total = valor / cotacao;
		
		System.out.printf("O valor total em reais é R$%.2f", total);
		
		ler.close();

	}

}
