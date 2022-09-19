package entrada_processamento_saida;

import java.util.Scanner;

public class Ex38F {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int ultimo, soma, count;
		
		ultimo = 0;
		soma = 0;
		
		for (count = 0; count <= 100; count++) {
			soma = count + ultimo;
		    ultimo = soma;
		}
		
		System.out.printf("%d", soma);
		
		ler.close();
	}

}
