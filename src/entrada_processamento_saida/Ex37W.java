package entrada_processamento_saida;

import java.util.Scanner;

public class Ex37W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		

		int i, t, i2;
		
		i = 1;
		
		while (i <= 20){
			i2 = 1;
		    while (i2 <= 10) {
		        t = i * i2;
		        System.out.printf("%d x %d = %d\n", i, i2, t);
		        i2++;
		    }
			i++;
		    System.out.printf("Aperte ENTER");
		    ler.nextLine();
		}
		
		ler.close();
	}

}
