package JogoBatalhaFinal;

public class Personagem {
	private String nome;
	private String sexo;
	private String classe;
	private String arma;
	private int energia;
	private int ataquePersonagem;
	private int ataqueArma;

	public Personagem() {

	}

	// vilao
	public Personagem(String nome, String arma, int energia, int ataque) {
		this.nome = nome;
		this.arma = arma;
		this.energia = energia;
		this.ataquePersonagem = ataque;
	}

	// heroi
	public Personagem(String nome, String sexo, String classe, int ataque) {
		this.nome = nome;
		this.sexo = sexo;
		this.classe = classe;
		this.ataquePersonagem = ataque;
	}

	public int getEnergia() {
		return this.energia;
	}

	public String getArma() {
		return this.arma;
	}

	public int getAtaquePersonagem() {
		return this.ataquePersonagem;
	}

	public int getAtaqueArma() {
		return this.ataqueArma;
	}

	public void setArma(String classe) {
		switch (this.classe) {
		case "GUERREIRO":
			this.arma = "ESPADA";
			this.ataqueArma = 10;
			break;
		case "MAGO":
			this.arma = "CAJADO";
			this.ataqueArma = 5;
			break;
		default:// ARQUEIRO
			this.arma = "ARCO E FLECHA";
			this.ataqueArma = 7;
			break;
		}
		System.out.println("A sua arma será: " + this.arma);
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public void setAtualizaEnergia(int pontos) {
		this.energia -= pontos;
		
	}
	
	public int setAtaca(Personagem personagem) {
		System.out.println(personagem.nome + " Você aplicou um ataque");
		int pontos = personagem.getAtaquePersonagem() + personagem.getAtaqueArma() + 5;// dado
		return (pontos);
	}

	
}
