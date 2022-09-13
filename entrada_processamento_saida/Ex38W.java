package entrada_processamento_saida;

import java.util.Scanner;

public class Ex38W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int ultimo, soma, count;
		
		ultimo = 0;
		soma = 0;
		count = 0;
		
		do {
			soma = count + ultimo;
		    ultimo = soma;
		    count++;
		} while (count <= 100);
		
		System.out.printf("%d", soma);
		
		
		ler.close();

	}

}
