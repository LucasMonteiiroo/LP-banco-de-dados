import javax.swing.JOptionPane;

public class TesteObjetos {

	public static void main(String[] args) {


		Pessoa [] Pessoa =new Pessoa [5];

		Pessoa[0]=new Pessoa("joao", 12, "M", "Campinas", 991344955);
		Pessoa[1]=new Pessoa("andre", 24 "M", "Caçapava", 991314459);
		Pessoa[2]=new Pessoa("julia", 16, "F", "Taubate", 981276438);
		Pessoa[3]=new Pessoa("lucas", 57, "M", "Taubate", 991844689);
		Pessoa[4]=new Pessoa("maria", 39, "F", "Cunha", 997233801);


		for(int i=0;i <5;i++)
		{

			System.out.println("Pessoa" + "\t" + Pessoa[i].getNome() + "\t" + Pessoa[i].getIdade() + "\t" + Pessoa[i].getGenero() + "\t" + Pessoa[i].getCidade() + "\t" + Pessoa[i].getTelefone());

		}

		Lugar[] Lugar=new Lugar[5];

		Lugar[1]=new Lugar("França", "Europa", "Continental", "Frances", "Euro");
		Lugar[2]=new Lugar("Japão", "Asia", "Subtropical", "Mandarim", "Renminbi");
		Lugar[3]=new Lugar("EUA", "America do Norte", "Tropical", "Inglês", "Dólar");
		Lugar[4]=new Lugar("Russia", "Asia", "Continental", "Russo", "Rublo Russo");
		Lugar[0]=new Lugar("Brasil","America do Sul", "Equatorial", "Português", "Moeda");
		
		for(int i=0;i <5;i++)
		{
			System.out.println("Lugar" + "\t" + Lugar[i].getPais() + "\t" + Lugar[i].getContinente() + "\t" + Lugar[i].getClima() + "\t" + Lugar[i].getMoeda() + "\t" + Lugar[i].getIdioma());
		}
		
		

		Calcado [] Calcado =new Calcado [5];

		Calcado[0]=new Calcado("treino","adidas", 40, "preto", "Dry-fit");
		Calcado[1]=new Calcado("dia a dia","nike", 41, "branco", "borracha");
		Calcado[2]=new Calcado("bota","cavalera", 39, "Preto", "Couro");
		Calcado[3]=new Calcado("chuteira","mizuno", 41, "amarela", "borracha");
		Calcado[4]=new Calcado("sapatilha","melissa", 35, "Branco", "borracha");

		for(int i=0;i <5;i++)
		{

			System.out.println("Calçados" + "\t" + Calcado[i].getModelo() + "\t" + Calcado[i].getMarca() + "\t" + Calcado[i].getTamanho() + "\t" + Calcado[i].getCor() + "\t" + Calcado[i].getMaterial());

		}

		Alunos [] Aluno = new Alunos [5];

		Aluno[0]=new Alunos(JOptionPane.showInputDialog("Digite seu nome:"), 12512732, 24, "Banco de Dados", "2020");
		Aluno[1]=new Alunos(JOptionPane.showInputDialog("Digite seu nome:"), 184128832, 33, "Logistica", "2023");
		Aluno[2]=new Alunos(JOptionPane.showInputDialog("Digite seu nome:"), 55436677, 51, "Logistica", "2022");
		Aluno[3]=new Alunos(JOptionPane.showInputDialog("Digite seu nome:"), 11332211, 23, "ADS", "2022");
		Aluno[4]=new Alunos(JOptionPane.showInputDialog("Digite seu nome:"), 44998877, 19, "Banco de Dados", "2023");

		for(int i=0;i <5;i++)
		{

			System.out.println("Alunos" + "\t" + Aluno[i].getNome() + "\t" + Aluno[i].getRa() + "\t" + Aluno[i].getIdade() + "\t" + Aluno[i].getCurso() + "\t" + Aluno[i].getConclusao());

		}
		
		Profissoes [] Profi=new Profissoes [5];

		Profi[0]=new Profissoes("Lucas","policial",21,"Homem",3.000);
		Profi[1]=new Profissoes("jair","Enfermeiro",43,"Homem",2.500);
		Profi[2]=new Profissoes("Flavio","Desenvolvedor",25,"Homem",4.000);
		Profi[3]=new Profissoes("Ana","Policial",22,"Mulher",3.000);
		Profi[4]=new Profissoes("Carla","Bombeiro",35,"Mulher",2.500);

		for(int i=0;i <5;i++)
		{

			System.out.println("Profissional" + "\t" + Profi[i].getNome() + "\t" + Profi[i].getProfissao() + "\t" + Profi[i].getIdade() + "\t" + Profi[i].getGenero() + "\t" + Profi[i].getSalario());
		}

		Instrumentos [] Instru=new Instrumentos [5];

		Instru[0]=new Instrumentos("Violão","Acustico","Corda","Preto");
		Instru[1]=new Instrumentos("Saxofone","Sopro","Sopro","Prata");
		Instru[2]=new Instrumentos("Flauta","Sopro","Sopro","Prata");
		Instru[3]=new Instrumentos("Bateria","Tambor","Percussão","Verde");
		Instru[4]=new Instrumentos("Violino","Acustico","Corda","Marrom");

		for(int i=0;i <5;i++)
		{

			System.out.println("Instrumentos" + "\t" + Instru[i].getNome() + "\t" + Instru[i].getModelo() + "\t" + Instru[i].getClasse() + "\t" + Instru[i].getCor());

		}	


	}		

}