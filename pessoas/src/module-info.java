public class Pessoas {

	private String nome;
	private int idade;
	private String genero;
	private String cidade;
	private int celular;

		public Pessoas(String Nome, int Idade, String Genero, String Cidade, int Celular) {
			this.nome= Nome;
			this.idade=Idade;
			this.genero=Genero;
			this.cidade=Cidade;
			this.celular=Celular;

		}

		public void setGenero(String Genero) {
			genero = Genero;
		}

		public void setCidade(String Cidade) {
			cidade = Cidade;

		}

		public void setCelular (int Celular) {
			celular = Celular;
		}
		

		public String getNome() {
			return nome;
		}

		public int getIdade() {
			return idade;
		}

		public String getCidade() {
			return cidade;
		}

		public int getCelular() {
			return celular;
		}

		public String getGenero() {
			return genero;
		}

		public void caminhar() {
			System.out.println("A pessoa esta caminhando");
		}

		public void treinar() {
			System.out.println("A pessoa esta treinando");
		}
		
}	