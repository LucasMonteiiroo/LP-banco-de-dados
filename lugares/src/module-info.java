public class Lugar {

	private String pais;
	private String continente;
	private String clima;
	private String idioma;
	private String dinheiro;

	public Lugar(String Pais, String Continente, String Clima, String Idioma, String Dinheiro) {
		this.pais= Pais;
		this.continente=Continente;
		this.clima=Clima;
		this.idioma=Idioma;
		this.dinheiro=Dinheiro;

	}

	public void setPais(String Pais) {
		pais = Pais;
	}

	public void setClima(String Clima) {
		clima = Clima;
	}

	public void setIdioma(String Idioma) {
		idioma = Idioma;

	}

	public void setMoeda (String Dinheiro) {
		dinheiro = Dinheiro;
	}

	public String getPais() {
		return pais;
	}

	public String getContinente() {
		return continente;
	}

	public String getClima() {
		return clima;
	}

	public String getIdioma() {
		return idioma;
	}

	public String getDinheiro () {
		return dinheiro;
	}

	public void viagem(){
		System.out.println("Destino para a viagem");
	}

	public void turismo() {
		System.out.println("Destino para visitar");
	}

}