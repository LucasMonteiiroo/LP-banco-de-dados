public class Instrumentos {

		private String nome;
		private String modelo;
		private String classe;
		private String cor;
		

			public Instrumentos(String Nome, String Modelo, String Classe, String Cor){

				nome= Nome;
				modelo=Modelo;
				classe=Classe;
				cor=Cor;
			
			}


			public void setNome(String Nome) {
				nome = Nome;
			}

			public void setModelo(String Modelo) {
				modelo = Modelo;
			}

			public void setClasse(String Classe) {
				classe = Classe;
			}

			public void setCor(String Cor) {
				cor = Cor;
			}


			public String getNome() {
				return nome;
			}


			public String getModelo() {
				return modelo;
			}


			public String getClasse() {
				return classe;
			}

			public String getCor() {
				return cor;
			}

		public void dedilhar() {
			System.out.println("Este instrumento é de dedilhar");
		}

		public void soprar() {
			System.out.println("Este instrumento é de soprar");	
		}

		public void bater() {
			System.out.println("Este instrumento é de bater");	
		}	

	}
