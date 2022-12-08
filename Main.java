
public class Main {
    public static void main(String[] args) {  
        
    	VetorAlunos lista = new VetorAlunos(5);
    	
    	System.out.println("Imprimindo Lista de alunos vazia");
    	lista.Imprimir();
    	
    	Aluno a1 = new Aluno(1, "Samuel", "Ciência da Computaçõa");
    	Aluno a2 = new Aluno(2, "Jonathas", "Ciência da Computaçõa");
    	Aluno a3 = new Aluno(35, "Paulo", "Ciência da Computaçõa");
    	Aluno a4 = new Aluno(4, "Carlos", "Física");
    	Aluno a5 = new Aluno(5, "Astro", "Medicina");
    	
    	lista.InserirAluno(a1);
    	lista.InserirAluno(a2);
    	lista.InserirAluno(a3);
    	lista.InserirAluno(a4);
    	lista.InserirAluno(a5);
    	
    	System.out.println(" ");
    	
    	System.out.println("Imprimindo Lista de alunos com 5 alunos");
    	
    	System.out.println(" ");
    	
    	lista.Imprimir();
    	
    	System.out.println(" ");
    	
    	System.out.println("Adiconando 1 aluno e aumentando tamanho da lista de alunos");
    	
    	System.out.println(" ");
    	
    	Aluno a6 = new Aluno(6, "Lucas", "Educação Física");
    	
    	lista.InserirAluno(a6);
    	
    	System.out.println(" ");
    	
    	System.out.println("Imprimindo Lista de alunos com 6 alunos");
    	
    	lista.Imprimir();
    	
    	System.out.println(" ");
    	
    	System.out.println(" ");
    	
    	System.out.println("Quantidade de posições vazias na lista: " + lista.quantidadePosicoesVazias());
    		
    	System.out.println(" ");
    	
    	System.out.println(" ");
    	
    	System.out.println("Removendo aluno de matrícula de número 35 da lista");
    	
    	lista.RetirarAluno(35);
    	
    	System.out.println(" ");
    	
    	System.out.println("Imprimindo Lista de alunos ");
    	
    	System.out.println(" ");
    	
    	lista.Imprimir();
    	
    	System.out.println(" ");
    	
    	System.out.println(" ");;
    	
    	System.out.println("Imprimindo Lista de alunos com 6 alunos");
    	
    	lista.Imprimir();
 
    	
        ListaEncadeadaSimplesAluno list = new ListaEncadeadaSimplesAluno();
        list.inserirAluno(list, a1);
        list.inserirAluno(list, a2);
        list.inserirAluno(list, a3);
        list.inserirAluno(list, a4);
        list.inserirAluno(list, a5);
        
    	System.out.println(" ");
    	
    	System.out.println("Imprimindo Lista de alunos ");
    	
    	System.out.println(" ");
    	
    	list.imprimirLista(list);
    	
    	System.out.println(" ");
    	
    	System.out.println(" ");
        
        System.out.println("Quantidade de alunos na lista: " + list.quantidadeAlunos(list));
    	
    	System.out.println(" ");
    	
    	System.out.println(" ");
    	
    	System.out.println("Imprimindo Lista de alunos ");
    	
    	System.out.println(" ");
    	
    	list.imprimirLista(list);
    	
    	System.out.println(" ");
    	
    	System.out.println(" ");
    	
        System.out.println(" ");
    	
    	System.out.println("Adiconando 1 aluno na primeira posição da lista");
    	
    	System.out.println(" ");
    	
    	list.inserirAlunoPrimeiraPosicao(list,a6);
    	
    	System.out.println(" ");
    	
    	System.out.println(" ");
    	
    	System.out.println("Imprimindo Lista de alunos ");
    	
    	System.out.println(" ");
    	
    	list.imprimirLista(list);
    	
    	System.out.println(" ");
    	
    	System.out.println(" ");
    	
    	System.out.println(" ");
    	
    	System.out.println(" ");
    	
    	System.out.println("Removendo aluno de matrícula de número 4 da lista");
    	
    	list.excluirPorMatricula(list,4);
    	
    	System.out.println(" ");
    	
    	System.out.println("Imprimindo Lista de alunos ");
    	
    	System.out.println(" ");
    	
    	list.imprimirLista(list);
    	
    	System.out.println(" ");
        
		
    } 
}
