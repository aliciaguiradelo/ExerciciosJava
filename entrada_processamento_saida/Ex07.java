package entrada_processamento_saida;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float a, b, c, d, e, total, pagamento, troco;
		
		System.out.printf("Digite o valor do primeiro produto: ");
		a = scn.nextFloat();
		System.out.printf("Digite o valor do segundo produto: ");
		b = scn.nextFloat();
		System.out.printf("Digite o valor do terceiro produto: ");
		c = scn.nextFloat();
		System.out.printf("Digite o valor do quarto produto: ");
		d = scn.nextFloat();
		System.out.printf("Digite o valor do quinto produto: ");
		e = scn.nextFloat();
		
		total = a + b + c + d + e;
		
		System.out.printf("**************************************\n");
		System.out.printf("O valor total foi de R$%.2f\n", total);
		
		System.out.printf("Pagamento: ");
		pagamento = scn.nextFloat();
		
		troco = pagamento - total;
		
		System.out.printf("**************************************\n");
		System.out.printf("Seu troco é de R$%.2f", troco);
				
		scn.close();
	}

}
