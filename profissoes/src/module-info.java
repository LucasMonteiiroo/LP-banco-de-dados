  
public class Profissoes {

	private String nome;
	private String profissao;
	private String genero;
	private int idade;
	private double salario;

	public Profissoes(String Nome, String Profissao, String Genero, int Idade, double Salario){

		nome= Nome;
		profissao=Profissao;
		idade=Idade;
		genero=Genero;
		salario=Salario;

	}


	public  void setNome(String Nome) {
		nome = Nome;
	}

	public void setProfissao(String Profissao) {
		profissao = Profissao;
	}

	public void setIdade(int Idade) {
		idade = Idade;
	}

	public void setSalario(float Salario) {
		salario = Salario;
	}
	

	public  String getNome() {
		return nome;
	}


	public String getProfissao() {
		return profissao;
	}


	public int getIdade() {
		return idade;
	}


	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getSalario() {
		return salario;
	}
	

	public void saude(){
		System.out.println("Este é um profissional da saúde");
	}


	public void lei() {
		System.out.println("Este é um profissional da lei");
	}


}