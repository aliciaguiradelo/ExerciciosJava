package entrada_processamento_saida;

import java.util.Scanner;

public class Ex33W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String sexo;
		
		System.out.printf("Digite a inicial do seu sexo(M ou F):");
		sexo = ler.next();
		
		while ((!sexo.toUpperCase().equals("M")) && (!sexo.toUpperCase().equals("F"))) {
			System.out.printf("Digite uma inicial válida:");
			sexo = ler.next();
					
		}
		
		System.out.printf(" %s, Inicial válida!", sexo.toUpperCase());
		
		
		ler.close();

	}

}
