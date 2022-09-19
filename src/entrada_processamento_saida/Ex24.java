package entrada_processamento_saida;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String s, n, estado;
		
		System.out.print("Digite seu nome:");
		n=ler.next().toUpperCase();
		System.out.print("Digite seu sexo:(M/F)");
		s = ler.next();
		
		System.out.print("Digite seu estado civil:");
		estado = ler.next();
		
				
		if (s.toUpperCase().equals("F") && estado.toUpperCase().equals("CASADA")) {
			System.out.printf("%s, você está casada há quantos anos?",n);
			n = ler.next();
			
		}
		else {
			System.out.print("FIM");
		}
		
		
		
		
				
		
		ler.close();

	}

}

