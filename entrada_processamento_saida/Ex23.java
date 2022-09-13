<<<<<<< HEAD
package entrada_processamento_saida;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.printf("Digite o valor de A:");
		a = ler.nextInt();
		System.out.printf("Digite o valor de B:");
		b = ler.nextInt();
		System.out.printf("Digite o valor de C:");
		c = ler.nextInt();
		
		if (a+b<c) {
			System.out.printf("A soma é menor que o valor de C!");
		}
		else {
			System.out.printf("A soma não é menor!");
		}
		ler.close();

	}

}
=======
package entrada_processamento_saida;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.printf("Digite o valor de A:");
		a = ler.nextInt();
		System.out.printf("Digite o valor de B:");
		b = ler.nextInt();
		System.out.printf("Digite o valor de C:");
		c = ler.nextInt();
		
		if (a+b<c) {
			System.out.printf("A soma é menor que o valor de C!");
		}
		else {
			System.out.printf("A soma não é menor!");
		}
		ler.close();

	}

}
>>>>>>> 1d8e80f (09-09)
