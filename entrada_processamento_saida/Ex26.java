<<<<<<< HEAD
package entrada_processamento_saida;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float a, b, c;
		
		System.out.printf("Digite um número qualquer:");
		a = ler.nextFloat();
		
		b = a*2;
		c=a*3;
				
		if (a>=0) {
			System.out.printf("O seu dobro é: %.2f", b);
		}
		else {
			System.out.printf("Seu triplo é: %.2f", c);
		}
		
		ler.close();

	}

}
=======
package entrada_processamento_saida;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float a, b, c;
		
		System.out.printf("Digite um número qualquer:");
		a = ler.nextFloat();
		
		b = a*2;
		c=a*3;
				
		if (a>=0) {
			System.out.printf("O seu dobro é: %.2f", b);
		}
		else {
			System.out.printf("Seu triplo é: %.2f", c);
		}
		
		ler.close();

	}

}
>>>>>>> 1d8e80f (09-09)
