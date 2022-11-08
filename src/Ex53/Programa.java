package Ex53;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*Criando um arraylist para guardar os objetos do tipo Aluno*/
		Aluno[] listaaluno = new Aluno [3];
		
		/*Criando estrutura de repitição (FOR) para instanciar e popular os objetos 
		*e ir guardando no arraylist nas posições corretas, de acordo com o índice i
		*/
		for(int i = 0; i<3; i++) {
			/*Criando(Instanciando) um novo objeto do tipo cliente.Qaundo atribuo valor 
			 * para os atributos de uma classe eu estou populando um objeto
			 * */
			Aluno a = new Aluno();
			System.out.println("Digite o RA do "+ (i+1) + " aluno");
			a.ra=ler.next();
			System.out.println("Digite o nome do "+ (i+1) + " aluno");
			a.nome=ler.next();
			System.out.println("Digite o periodo do "+ (i+1) + " aluno");
			a.periodo=ler.next();
			
			/*Para guardar as 3 matérias, eu vou criar um arraylist de String listamateria*/
			String[] listamateria = new String[3];
			/*Para ir criando os objetos do tipo String, populando e guardando no arraylist, 
			 * eu vou criar uma estrutura de repetição(FOR)*/
			for(int j=0; j<3; j++) {
				System.out.println("Digite a sigla da" + (j+1) + "materia");
				listamateria[j] = ler.next();		
				listamateria[i] = a.materia;
			}
			listaaluno[i]=a;
		}
		for(int i=0; i<3; i++) {
			if(listaaluno[i].periodo == "noturno") {
				System.out.println("ID :" + listaaluno[i].ra);
				System.out.println("NOME :" + listaaluno[i].nome);
				System.out.println("PERIODO :" + listaaluno[i].periodo);
				System.out.println("MATERIAS :" + listaaluno[i].materia);
			}
		}
		ler.close();

	}

}
