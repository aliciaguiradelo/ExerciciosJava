<<<<<<< HEAD
package entrada_processamento_saida;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float p1, p2;
		
		System.out.printf("Digite a nota da primeira prova:");
		p1 = ler.nextFloat();
		
		p2 = (15-p1)/2;
		
		System.out.printf("Sua nota mínima para ser aprovado deverá ser:%.2f", p2);
		
		ler.close();

	}

}
=======
package entrada_processamento_saida;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float p1, p2;
		
		System.out.printf("Digite a nota da primeira prova:");
		p1 = ler.nextFloat();
		
		p2 = (15-p1)/2;
		
		System.out.printf("Sua nota mínima para ser aprovado deverá ser:%.2f", p2);
		
		ler.close();

	}

}
>>>>>>> 1d8e80f (09-09)
