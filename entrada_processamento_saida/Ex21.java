<<<<<<< HEAD
package entrada_processamento_saida;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float a, b, m, ad, d, sub;
		int s;
		
		System.out.printf("Digite o primeiro valor:");
		a = ler.nextFloat();
		
		System.out.printf("Digite o segundo valor:");
		b = ler.nextFloat();
		
		System.out.println("\nMENU\n");
		System.out.println("1.Multiplicação \n2.Adição \n3.Divisão \n4.Subtração \n5.Fim do processo");
		
		System.out.printf("Digite a opção desejada:");
		s = ler.nextInt();
		
		if (s==1) {
			m=a*b;
			System.out.printf("O resultado da multiplicação é: %.2f", m);
		}
		
		else if (s==2) {
			ad=a+b;
			System.out.printf("O resultado da adição é: %.2f", ad);
		}
		
		else if (s==3) {
			d=a/b;
			System.out.printf("O resultado da divisão é: %.2f", d);
		}
		
		else if (s==4) {
			sub=a-b;
			System.out.printf("O resultado da subtração é: %.2f", sub);
		}
		
		else {
			System.out.printf("Opção inválida!");
		}
		
		ler.close();

	}

}
=======
package entrada_processamento_saida;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float a, b, m, ad, d, sub;
		int s;
		
		System.out.printf("Digite o primeiro valor:");
		a = ler.nextFloat();
		
		System.out.printf("Digite o segundo valor:");
		b = ler.nextFloat();
		
		System.out.println("\nMENU\n");
		System.out.println("1.Multiplicação \n2.Adição \n3.Divisão \n4.Subtração \n5.Fim do processo");
		
		System.out.printf("Digite a opção desejada:");
		s = ler.nextInt();
		
		if (s==1) {
			m=a*b;
			System.out.printf("O resultado da multiplicação é: %.2f", m);
		}
		
		else if (s==2) {
			ad=a+b;
			System.out.printf("O resultado da adição é: %.2f", ad);
		}
		
		else if (s==3) {
			d=a/b;
			System.out.printf("O resultado da divisão é: %.2f", d);
		}
		
		else if (s==4) {
			sub=a-b;
			System.out.printf("O resultado da subtração é: %.2f", sub);
		}
		
		else {
			System.out.printf("Opção inválida!");
		}
		
		ler.close();

	}

}
>>>>>>> 1d8e80f (09-09)
