package entrada_processamento_saida;

import java.util.Scanner;

public class Ex31DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a;
		
		do {
            System.out.printf("Digite um número positivo: ");
            a = ler.nextInt();
        }
        while(a <= 0);
		
		System.out.printf("Numero positivo valido!");
		
		
		ler.close();

	}

}
