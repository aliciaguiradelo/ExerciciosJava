package ex75;

import java.util.HashMap;

public class Programa {

	public static void main(String[] args) {
		String alunosVestibular = "Jose dos Santos,7,Sao Paulo;Sandra Silva,6.5,Sao Jose do Rio Preto;Augusto Soares,8,Sao Paulo;Vanderlei Azevedo,5.65,Santos;Vanessa Ferreira,9,Sao Paulo;Natan Cruz,10,Sao Paulo";
		//Usando método String para separar os objeto por ; e depois separar os atributos por ,
		String[] listaAlunos = alunosVestibular.split(";");	
		
        HashMap <Integer, Aluno> alunosAprovados = new HashMap <Integer, Aluno>();
        int idObjeto=0;
        //ForEach para varrer o array listaAlunos
        for(String aluno : listaAlunos) {
        	String[]dadosAluno = aluno.split(",");
        	
        	if(Double.parseDouble(dadosAluno[1])<7)
        		continue;
        	
        	Aluno a = new Aluno();
        	idObjeto++;
        	a.setNome(dadosAluno[0]);
        	//Transformando uma string em double e populando o objeto
        	a.setNota(Double.parseDouble(dadosAluno[1]));
        	a.setCidade(dadosAluno[2]);
        	
        	alunosAprovados.put(idObjeto, a);
        }
        
        alunosAprovados.forEach((key,value)->{
        	System.out.println("ID: " + key + "  NOME: " + value.getNome() + "  NOTA: " + value.getNota() + "  CIDADE: " + value.getCidade());
        });

	}
}
