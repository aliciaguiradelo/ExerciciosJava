package entrada_processamento_saida;

import java.util.Scanner;

public class Ex47DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String r="s";
		
		
		do {
			int n, i=1,f=0;				
			
			System.out.printf("Digite o numero que deseja fazer o fatorial:");
			n = ler.nextInt();
			while(n<0) {
				System.out.printf("Digite outro numero:");
				n = ler.nextInt();
				
			}
			i=n-1;
			do {
				f=n*i;
				n=f;
				i--;
			}while(i>0);
			System.out.println(n);
			System.out.println("Deseja realizar uma nova consulta?(S/N):");
			r=ler.next();
		} while(r.equals("s"));
		do {
			System.out.println("Digite uma resposta válida?(S/N):");
			r=ler.next();
		}while(r!="s" && r!="n");
		ler.close();

	}

}
