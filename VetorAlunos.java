import java.util.ArrayList;

public class VetorAlunos {
	int primeiro = 0;

	int ultimo = 0;

	private Aluno[] Lista_Alunos;


	public VetorAlunos(int max) {
		Lista_Alunos = new Aluno[max];
	}


	public boolean vazio() {
		return (this.primeiro == this.ultimo);
	}


	public void InserirAluno(Aluno p) {
		if (!vazio() && this.ultimo == this.Lista_Alunos.length) {
			System.out.println("Lista Cheia....Aumentando tamanho da lista de " + Lista_Alunos.length + " para " + (Lista_Alunos.length + 5));
			Aluno[] novoVetor = new Aluno[Lista_Alunos.length + 5];
			System.arraycopy(Lista_Alunos, 0, novoVetor, 0, Lista_Alunos.length);
			Lista_Alunos = novoVetor;
		} 
	
		if(buscarAluno(p.getMatricula()) == null) {
			this.Lista_Alunos[this.ultimo] = p;
			this.ultimo = this.ultimo + 1;
			System.out.println("Aluno inserido com sucesso");
		}
		else {
			System.out.println("Aluno com mátricula informada já cadastrado");
		}
		
	}
		
	public void RetirarAluno(int matricula) {
		Integer posicao = retornaPosicaoAluno(matricula);
		if(posicao != null) {
			System.out.println("Removendo ITEM: " +  this.Lista_Alunos[posicao]);
			this.Lista_Alunos[posicao] = null;
			for(int i = posicao; i < Lista_Alunos.length; i++) {
				if(i < (Lista_Alunos.length - 1)) {
					this.Lista_Alunos[i] = this.Lista_Alunos[i+1];
					this.Lista_Alunos[i+1] = null;
				}
			}	
		}
		else {
			System.out.println("Aluno não encontrado com matrícula informada");
		}
	}
	
	public Aluno buscarAluno(int matricula) {
		for(Aluno aluno : Lista_Alunos) {
			if(aluno != null && (aluno.getMatricula() == matricula)) {
				return aluno;
			}
		}		
		return null;
	}
	
	public Integer retornaPosicaoAluno(int matricula) {
		for(int i = 0; i < Lista_Alunos.length; i++) {
			if(Lista_Alunos[i] != null && (Lista_Alunos[i].getMatricula() == matricula)) {
				return i;
			}
		}		
		return null;
	}
	
	public void Imprimir() {
		System.out.println("##### IMPRIMINDO LISTA #####");
		for(Aluno item : Lista_Alunos) {
			System.out.println(item);
		}
	}
	
	public int quantidadePosicoesVazias() {
		int qtd = 0;
		for(int i = 0; i < Lista_Alunos.length; i++) {
			if(Lista_Alunos[i] == null) {
				qtd++;
			}
		}
		
		return qtd;
	}
}
