package entrada_processamento_saida;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String s, n, estado;
		
		System.out.print("Digite seu nome:");
		System.out.print("Digite seu sexo:(M/F)");
		s = ler.next();
		
		System.out.print("Digite seu estado civil:");
		estado = ler.next();
		
				
		if (s.equals("F") && estado.equals("CASADA")) {
			System.out.print("Está casada há quantos anos?");
			n = ler.next();
			
		}
		else {
			System.out.print("FIM");
		}
		
		
		
		
				
		
		ler.close();

	}

}

