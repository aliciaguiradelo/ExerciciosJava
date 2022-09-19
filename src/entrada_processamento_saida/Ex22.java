package entrada_processamento_saida;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int s, a, b , c, d, l, r;
		float area1, area2, area3, area4;
		
		System.out.println("\nMENU\n");
		
		System.out.println("1.Triângulo \n2.Quadrado \n3.Retângulo \n4.Círculo \n5.Fim do processo.");
		
		System.out.printf("digite a opção desejada:");
		s = ler.nextInt();
		
		if (s==1) {
			System.out.printf("Digite a altura do triângulo:");
			a = ler.nextInt();
			System.out.printf("Digite a base do triângulo:");
			b = ler.nextInt();
			area1 = (a*b);
			
			System.out.printf("A área do triângulo é: %.2f", area1);
		}
		
		else if (s==2) {
			System.out.printf("Digite o lado do quadrado:");
			l = ler.nextInt();
			
			area2 = (l*l);
			
			System.out.printf("A área do quadrado é: %.2f", area2);
		}
		
		else if (s==3) {
			System.out.printf("Digite a altura do retângulo:");
			c = ler.nextInt();
			
			System.out.printf("Digite a base do retângulo:");
			d = ler.nextInt();
			
			area3 = (c*d);
			
			System.out.printf("A área do retângulo é: %.2f", area3);
		}
		
		else if (s==4) {
			System.out.printf("Digite o raio do círculo:");
			r = ler.nextInt();
			
			area4 = 3 * r;
			
			System.out.printf("A área do círculo é: %.2f", area4);
			
		}
		
		else if (s==5) {
			System.out.printf("Fim do processo.");
		}
		
		else {
			System.out.printf("Opção inválida!");
		}
		
		ler.close();
		
	}

}

