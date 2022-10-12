package poo;

import java.util.Scanner;

public class Ex53 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		@SuppressWarnings("unused")
		Ex53_Aluno [] listaaluno = new Ex53_Aluno[5];
		System.out.println("..::CADASTRO DE ALUNOS::..");
		for(int i = 0; i<=4;i++) {
			Ex53_Aluno a = new Ex53_Aluno();
			System.out.println("Digite o RA do aluno:");
			a.ra = ler.next();
			System.out.println("Digite o nome do aluno:");
			a.nome = ler.next();
			System.out.println("Digite o período do curso:");
			a.periodo=ler.next();
			String[] listamateria = new String[6];
			for(int m=0; m<=5;m++) {
				System.out.println("Digite a sigla da" + (m+1) + "materia");
				listamateria[m] = ler.next();
				
			}
			a.materia = listamateria;
		}

	}

}
