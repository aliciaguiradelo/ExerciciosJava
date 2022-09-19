package entrada_processamento_saida;

import java.util.Scanner;

public class Ex33DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String sexo;
		do {
			System.out.printf("Digite a inicial do seu sexo:");
			sexo = ler.next();
		}
		while ((!sexo.toUpperCase().equals("M")) && (!sexo.toUpperCase().equals("F")));
		
		System.out.printf(" %s, Inicial válida!", sexo.toUpperCase());
		
		ler.close();

	}

}
