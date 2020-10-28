public class Alunos {

	private String nome;
	private int idade;
	private int ra;
	private String curso;
	private String formacao;

	
	public Alunos(String Nome, int Ra, int Idade, String Curso, String Formacao){
		nome= Nome;
		this.idade=Idade;
		this.ra=Ra;
		this.curso=Curso;
		this.formacao=Formacao;

	}

	public void setNome(String Nome) {
		nome = Nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getCurso() {
		return curso;
	}


	public String getFormacao() {
		return formacao;
	}

	public int getRa() {
		return ra;
	}


	public void estudar() {
		System.out.println("O aluno ainda estuda");
	}


		public void formar() {
			System.out.println("O aluno se formou");
		}
		

		public void cursar() {
			System.out.println("O aluno está cursando");
		}		
