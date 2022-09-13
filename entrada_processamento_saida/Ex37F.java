package entrada_processamento_saida;

import java.util.Scanner;

public class Ex37F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i, t, i2;
		
		i = 1;
		
		for (i=1;i<=20;i++){
			
		   for (i2=1;i2<=10;i2++) {
		        t = i * i2;
		        System.out.printf("%d x %d = %d\n", i, i2, t);
		        
		    }
			
		    System.out.printf("Aperte ENTER");
		    ler.nextLine();
		}
		
		ler.close();
	}

	}




