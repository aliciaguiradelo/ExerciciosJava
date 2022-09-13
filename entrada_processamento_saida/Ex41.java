package entrada_processamento_saida;

import java.util.Scanner;

public class Ex41 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, an, sn;
		System.out.printf("Digite o valor para os primeiros N numeros da sequência:");
		n = ler.nextInt();
		
		while ((n<=0) && (n>=100)) {
			System.out.printf("Valor N digitado não é valido. Digite novamente:");
			n = ler.nextInt();
		}
		an = (n*n) + 1;
		sn = ((2+ (n*n)+1)*n)/2;
		System.out.printf("O %d elemento é: %d\n", n, an);
		System.out.printf("A soma dos %d elementos é: %d", n, sn);
		
		ler.close();

	}

}
