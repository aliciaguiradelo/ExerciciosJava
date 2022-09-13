package entrada_processamento_saida;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float a, v0, t, v;
		
		System.out.printf("Digite o valor da aceleração em m/s^2:");
		a = ler.nextFloat();
		
		System.out.printf("Digite o valor da velocidade inicial do automável em m/s:");
		v0 = ler.nextFloat();
		
		System.out.printf("Digite o valor do tempo do percurso em seg:");
		t = ler.nextFloat();
		
		v = v0 + a*t;
		
		if (v<=40) {
			System.out.printf("Veículo muito lento!");
		}
		
		else if ((40<v) && (v<=60)) {
			System.out.printf("Velocidade permitida!");
		}
		
		else if ((60<v) && (v<=80)) {
			System.out.printf("Velocidade de cruzeiro!");
		}
		
		else if ((80<v) && (v<=120)) {
			System.out.printf("Veículo rápido!");
		}
		
		else {
			System.out.printf("Veículo muito rápido!");
		}
		
		ler.close();

	}

}
