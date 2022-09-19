package entrada_processamento_saida;

import java.util.Scanner;

public class Ex47F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
String r="s";
		
		
		while(r.equals("s")) {
			int n, i,f=0;				
			
			System.out.printf("Digite o numero que deseja fazer o fatorial:");
			n = ler.nextInt();
			while(n<0) {
				System.out.printf("Digite outro numero:");
				n = ler.nextInt();
				
			}
			;
			for(i=n-1;i>0;i--) {
				f=n*i;
				n=f;
				
			}
			System.out.println(n);
			System.out.println("Deseja realizar uma nova consulta?(S/N):");
			r=ler.next();
		}
		while(r!="s" && r!="n") {
			System.out.println("Digite uma resposta válida?(S/N):");
			r=ler.next();
		}
		ler.close();
		

	}

}
