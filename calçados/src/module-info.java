public class Calcados {

	private String estilo;
	private String marca;
	private String cor;
	private int tamanho;
	private String material;


		public Calcados(String Estilo, String Marca, int Tamanho, String Material, String Cor){

			estilo=Estilo;
			marca=Marca;
			tamanho=Tamanho;
			material=Material;
			cor= Cor;

		}

	public  void setEstilo(String Estilo) {
		estilo = Estilo;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}


	public int getTamanho() {
		return tamanho;
	}


	public String getMaterial() {
		return material;
	}

	public String getEstilo() {
		return estilo;
	}

	public String getCor() {
		return cor;
	}

	public String getMarca() {
		return marca;
	}

	public void corrida(){
	System.out.println("Este é ideal para corrida");
	}

	public void caminhar() {
	System.out.println("Este é ideal para caminhar");
		}

}
