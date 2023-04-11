package ex74;

import java.util.HashMap;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		HashMap<Integer, Tecnologia> listaTecnologias = new HashMap<Integer, Tecnologia>();
		
		int opcao;
		int opcaoTec=0;
		int id;
		Tecnologia tec;
		int id_tecnologia=0;
		
		do {
			System.out.println("Digite a opção desejada: ");
			opcao=ler.nextInt();
			
			System.out.println("Tecnologias ");
			System.out.println("1 - Frontend ");
			System.out.println("2 - Backend");
			System.out.println("Qual o tipo de tecnologia? ");
			opcaoTec=ler.nextInt();
			
			if (opcao == 1) {
				id_tecnologia++;
				
				System.out.println("Digite a linguagem de programação");
				String linguagemProgramacao = ler.next();
				
				System.out.println("Digite a linguagem de programação");
				String principalFramework = ler.next();
				
				System.out.println("Digite a linguagem de programação");
				String descricaoLinguagem = ler.next();
				
				System.out.println("Digite a linguagem de programação");
				String descricaoFramework = ler.next();
				
				if (opcaoTec == 1) {
					Backend b = new Backend ();
					
					b.setLinguagemProgramacao(linguagemProgramacao);
					b.setPrincipalFramework(principalFramework);
					b.setDescricaoLinguagem(descricaoLinguagem);
					b.setDescricaoFramework(descricaoFramework);
					
					System.out.println("É possível containerizar? (S/N): ");
					b.setPossivelContainerizar("S".equals(ler.next().toUpperCase()));
					
					listaTecnologias.put(id_tecnologia, b);
					
				}
				else {
					Frontend f = new Frontend ();
					
					f.setLinguagemProgramacao(linguagemProgramacao);
					f.setPrincipalFramework(principalFramework);
					f.setDescricaoLinguagem(descricaoLinguagem);
					f.setDescricaoFramework(descricaoFramework);
				}
				
				
				
			}
			
			
			
			
			
		
		
		
		
		
		ler.close();
	}

}
