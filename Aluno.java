public class Aluno {

	private String nome;
	private int matricula;
	private String curso;
	
	public Aluno() {

	}

	

	public Aluno(int matricula, String nome, String curso) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Aluno: matricula=" + matricula + ", nome=" + nome + ", curso=" + curso + "";
	}

	

	

}
