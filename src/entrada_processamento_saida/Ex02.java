package entrada_processamento_saida;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int l, area;
		
		System.out.println("Digite o lado do quadrado:");
		l = ler.nextInt();
		
		area = (l*l);
		
		System.out.printf("A área do quadrado é: %d", area);
		
		ler.close();
	}

}
