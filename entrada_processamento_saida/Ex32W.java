<<<<<<< HEAD
package entrada_processamento_saida;

import java.util.Scanner;

public class Ex32W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b;
		
		System.out.printf("Digite o primeiro valor:");
		a = ler.nextInt();
		System.out.printf("Digite o segundo valor:");
		b = ler.nextInt();
		
		while (a>b) {
			System.out.printf("O segundo valor é inválido!\n Digite-o novamente:");
			b = ler.nextInt();
			
		}
		System.out.printf(" %d < %d", a,b);

	}

}
=======
package entrada_processamento_saida;

import java.util.Scanner;

public class Ex32W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b;
		
		System.out.printf("Digite o primeiro valor:");
		a = ler.nextInt();
		System.out.printf("Digite o segundo valor:");
		b = ler.nextInt();
		
		while (a>b) {
			System.out.printf("O segundo valor é inválido!\n Digite-o novamente:");
			b = ler.nextInt();
			
		}
		System.out.printf(" %d < %d", a,b);
		
		ler.close();

	}

}
>>>>>>> 1d8e80f (09-09)
