package entrada_processamento_saida;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.printf("Informe um número: ");
		a = scn.nextInt();
		System.out.printf("Informe outro número: ");
		b = scn.nextInt();
		System.out.printf("Informe mais um número: ");
		c = scn.nextInt();
		
		if(a > b && a > c){
			System.out.printf("O maior número digitado: %d", a);
		} else if (b > a && b > c ) {
			System.out.printf("O maior número digitado: %d", b);
		} else {
			System.out.printf("O maior número digitado: %d", c);
		}
		

		scn.close();
	}

}
