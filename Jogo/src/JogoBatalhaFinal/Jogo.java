package JogoBatalhaFinal;

public class Jogo {
	private String nivelDeDificuldade;
	private String classeDeCombate;
	private String motivacao;
	private Double modificador;
	private String seguirDesistir;
	private String acao; // Andando - Correndo - Saltando
	private String pegarArmadura;
	private String beberOuNaoBeber;
	private String atacaOuEspera;

	public Jogo(String nivelEscolhido) {
		this.nivelDeDificuldade = nivelEscolhido.toUpperCase();
		setModificador(nivelDeDificuldade);
	}

	public void setModificador(String nivelDeDificuldade) {
		if (nivelDeDificuldade.equals("FACIL")) {
			this.modificador = 0.8;
		} else if (nivelDeDificuldade.equals("NORMAL")) {
			this.modificador = 1.0;
		} else if (nivelDeDificuldade.equals("DIFICIL")) {
			this.modificador = 1.2;
		}
	}

	public String getNivelDeDificuldade() {
		return this.nivelDeDificuldade.toUpperCase();
	}

	public String getIntroducao() {
		return ("\r\n"
				+ "A noite se aproxima, a lua j� surge no c�u, estrelas v�o se acendendo, e sob a luz do crep�sculo voc� est� prestes a entrar na fase final da sua miss�o. "
				+ "\r\n"
				+ "Voc� olha para o portal � sua frente, e sabe que a partir desse ponto, sua vida mudar� para sempre."
				+ "\r\n"
				+ "Mem�rias do caminho percorrido para chegar at� aqui invadem sua mente. Voc� se lembra de todos os inimigos j� derrotados para alcan�ar o covil do l�der maligno. "
				+ "\r\n"
				+ "Olha para seu equipamento de combate, j� danificado e desgastado depois de tantas lutas. Voc� est� a um passo de encerrar para sempre esse mal."
				+ "\r\n" + "Buscando uma inje��o de �nimo, voc� se for�a a lembrar o que te trouxe at� aqui." + "\r\n");
	}

	public void setMotivacao(String motivacao) {
		this.motivacao = motivacao.toUpperCase();
	}

	public String getTexto1Motivacao() {
		if (this.motivacao.equals("VINGAN�A")) {
			return ("\r\n"
					+ "Imagens daquela noite tr�gica invadem sua mente. Voc� nem precisa se esfor�ar para lembrar, pois essas mem�rias est�o sempre presentes, "
					+ "\r\n"
					+ "mesmo que de pano de fundo, quando voc� tem outros pensamentos em foco, elas nunca o deixaram. Elas s�o o combust�vel que te fizeram chegar at� aqui. "
					+ "\r\n"
					+ "E voc� sabe que n�o ir� desistir at� ter vingado a morte daqueles que foram - e pra sempre ser�o - sua fonte de amor e desejo de continuar vivo. "
					+ "\r\n"
					+ "O maldito l�der finalmente pagar� por tanto mal causado na vida de tantos (e principalmente na sua).");
		} else {
			return ("Voc� j� consegue visualizar na sua mente o povo da cidade te recebendo de bra�os abertos, bardos criando can��es sobre seus feitos her�icos, "
					+ "\r\n"
					+ "nobres te presenteando com j�ias e diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilan�as. Desde j�, voc� sente "
					+ "\r\n"
					+ "o amor do p�blico, te louvando a cada passo que d� pelas ruas, depois de destruir o vil�o que tanto assombrou a paz de todos. Por�m, voc� sabe que "
					+ "\r\n"
					+ "ainda falta o �ltimo ato dessa hist�ria. Voc� se concentra na miss�o. A gl�ria o aguarda, mas n�o antes da �ltima batalha.");
		}
	}

	public String getTextoSeguirDesistir() {
		return ("Inspirado pelo motivo que te trouxe at� aqui, voc� sente seu cora��o ardendo em chamas, suas m�os formigarem em volta da sua arma. "
				+ "\r\n" + "Voc� a segura com firmeza. Seu foco est� renovado. Voc� avan�a pelo portal.\r\n" + "\r\n"
				+ "A escurid�o te envolve. Uma ilumina��o muito fraca entra pelo portal �s suas costas. � sua frente, s� � poss�vel perceber que "
				+ "\r\n" + "voc� se encontra em um corredor extenso. Voc� s� pode ir � frente, ou desistir.\r\n" + "");
	}

	public String setSeguirDesistir(String acao) {
		this.seguirDesistir = acao.toUpperCase();
		if (this.seguirDesistir.equals("DESISTIR")) {
			return ("o medo invade o seu cora��o e voc� sente que ainda n�o est� � altura do desafio. Voc� se volta para a noite l� fora e corre em dire��o � seguran�a.");
		} else {
			return ("voc� caminha, atento a todos os seus sentidos, por v�rios metros, at� visualizar a frente uma fonte de luz, que voc� imagina ser a chama de "
					+ "uma tocha, vindo de dentro de uma porta aberta.\r\n" + "\r\n"
					+ "Voc� se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como passar pela porta.\r\n"
					+ "\r\n" + "[andando cuidadosamente, correndo, saltando]\r\n" + "");
		}
	}

	public String setSaltandoAndandoCorrendo(String acao) {
		this.acao = acao.toUpperCase();
		if (this.acao.equals("ANDANDO")) {
			return ("Voc� toma cuidado e vai caminhando vagarosamente em dire��o � luz. Quando voc� pisa exatamente embaixo da porta, voc� sente o ch�o ceder levemente, "
					+ "\r\n"
					+ "como se tivesse pisado em uma pedra solta. Voc� ouve um ru�do de mecanismos se movimentando, e uma escotilha se abre no teto atr�s de voc�, no corredor. "
					+ "\r\n"
					+ "Flechas voam da escotilha em sua dire��o, e voc� salta para dentro da sala, por�m uma delas te acerta na perna.");
		} else if (this.acao.equals("CORRENDO")) {
			return ("Voc� respira fundo e desata a correr em dire��o � sala. Quando passa pela porta, sente que pisou em uma pedra solta, mas n�o d� muita import�ncia "
					+ "\r\n"
					+ "e segue para dentro da sala, olhando ao redor � procura de inimigos. N�o tem ningu�m, mas voc� ouve sons de flechas batendo na pedra atr�s de voc�, "
					+ "\r\n"
					+ "e quando se vira, v� v�rias flechas no ch�o. Espiando pela porta, voc� entende que pisou em uma armadilha que soltou flechas de uma escotilha "
					+ "\r\n"
					+ "aberta no teto, mas por sorte voc� entrou correndo e conseguiu escapar desse ataque surpresa.");
		} else {
			return ("Voc� se concentra e pula em dire��o � luz, saltando de antes da porta at� o interior da sala.");
		}
	}

	public String getTextoPortaDireita() {
		return ("Voc� se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma delas foi aquela pela qual voc� entrou, que estava aberta, "
				+ "\r\n"
				+ "e as outras tr�s est�o fechadas. A porta � sua frente � a maior das quatro, com inscri��es em seu entorno em uma l�ngua que voc� n�o sabe ler, "
				+ "\r\n"
				+ "mas reconhece como sendo a l�ngua antiga utilizada pelo inimigo. Voc� se aproxima da porta e percebe que ela est� trancada por duas fechaduras "
				+ "\r\n"
				+ "douradas, e voc� entende que precisar� primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir enfrentar o l�der.\r\n"
				+ "\r\n" + "Voc� se dirige para a porta � direita.\r\n" + "\r\n"
				+ "PORTA DIREITA: Voc� se aproxima, tentando ouvir o que acontece porta adentro, mas n�o escuta nada. Segura com mais for�a sua arma com uma m�o, "
				+ "\r\n"
				+ "enquanto empurra a porta com a outra. Ao entrar, voc� se depara com uma sala espa�osa, com v�rios equipamentos de batalha pendurados nas paredes "
				+ "\r\n"
				+ "e dispostos em arm�rios e mesas. Voc� imagina que este seja o arsenal do inimigo, onde est�o guardados os equipamentos que seus soldados utilizam "
				+ "\r\n" + "quando saem para espalhar o terror nas cidades e vilas da regi�o.\r\n" + "\r\n"
				+ "Enquanto seu olhar percorre a sala, voc� ouve a porta se fechando e gira rapidamente para olhar para tr�s. Ali, de p� entre voc� e a porta fechada, "
				+ "\r\n"
				+ "bloqueando o caminho do seu destino, est� um dos capit�es do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em posi��o de "
				+ "\r\n" + "combate. Ele avan�a em sua dire��o.\r\n" + "");
	}

	public String getTextoPegarOuNaoArmadura() {
		return ("Ap�s derrotar o Armeiro, voc� percebe que seus equipamentos est�o muito danificados, e olha em volta, encarando todas aquelas pe�as de armaduras "
				+ "\r\n" + "resistentes e em �timo estado.\r\n" + "voc� escolhe [pegar ou n�o] as armaduras novas?\r\n"
				+ "");
	}

	public String setPegarOuNaoPegar(String pegarOuNaoPegar) {
		this.pegarArmadura = pegarOuNaoPegar.toUpperCase();
		if (this.pegarArmadura.equals("PEGAR")) {
			return ("Voc� resolve usar os equipamentos do inimigo contra ele, e trocar algumas pe�as suas, que estavam danificadas, pelas pe�as de "
					+ "\r\n"
					+ "armaduras existentes na sala. De armadura nova, voc� se sente mais protegido para os desafios � sua frente.");
		} else {
			return ("Voc� decide que n�o precisa utilizar nada que venha das m�os do inimigo.");
		}
	}

	public String getTextoPortaEsquerda() {
		return ("Em uma mesa, voc� encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras da porta do l�der inimigo. Voc� pega a chave e guarda "
				+ "\r\n" + "numa pequena bolsa que leva presa ao cinto.\r\n" + "\r\n"
				+ "PORTA ESQUERDA: Voc� retorna � sala anterior e se dirige � porta da esquerda. Voc� se aproxima, tentando ouvir o que acontece porta adentro, "
				+ "\r\n"
				+ "mas n�o escuta nada. Segura com mais for�a sua arma com uma m�o, enquanto empurra a porta com a outra. Ao entrar, voc� se depara com uma sala "
				+ "\r\n"
				+ "parecida com a do arsenal, mas em vez de armaduras, existem v�rios potes e garrafas de vidro com conte�dos misteriosos e de cores diversas, "
				+ "\r\n"
				+ "e voc� entende que o capit�o que vive ali, realiza experimentos com diversos ingredientes, criando po��es utilizadas pelos soldados "
				+ "\r\n" + "para aterrorizar a regi�o.\r\n" + "\r\n"
				+ "No fundo da sala, olhando em sua dire��o, est� outro dos capit�es do inimigo. Um orque horrendo, de armadura, cajado em punho, em posi��o de combate."
				+ "Ele avan�a em sua dire��o.\r\n" + "");
	}

	public String getTextoDaPocao() {
		return ("Ap�s derrotar o Alquimista, voc� olha em volta, tentando reconhecer alguma po��o do estoque do inimigo. Em uma mesa, voc� reconhece uma pequena garrafa"
				+ "\r\n"
				+ " de vidro contendo um l�quido levemente rosado, pega a garrafa e pondera se deve beber um gole."
				+ "\r\n" + "voc� escolhe [beber ou n�o] a po��o?\r\n" + "");
	}

	public String setBeberOuNaoBeber(String beberOuNaoBeber) {
		this.beberOuNaoBeber = beberOuNaoBeber.toUpperCase();
		if (this.beberOuNaoBeber.equals("BEBER")) {
			return ("Voc� se sente revigorado para seguir adiante!");
		} else {
			return ("Voc� fica receoso de beber algo produzido pelo inimigo");
		}
	}

	public String getTextoDaPortaFinal() {
		return ("Ao lado da porta, voc� v� uma chave dourada em cima de uma mesa, e sabe que aquela chave abre a outra fechadura da porta do l�der inimigo. "
				+ "\r\n" + "Voc� pega a chave e guarda na pequena bolsa que leva presa ao cinto.\r\n" + "\r\n"
				+ "De volta � sala das portas, voc� se dirige � porta final. Coloca as chaves nas fechaduras, e a porta se abre. Seu cora��o acelera, mem�rias "
				+ "\r\n"
				+ "de toda a sua vida passam pela sua mente, e voc� percebe que est� muito pr�ximo do seu objetivo final. Segura sua arma com mais firmeza, "
				+ "\r\n" + "foca no combate que voc� sabe que ir� se seguir, e adentra a porta.\r\n" + "\r\n"
				+ "L� dentro, voc� v� o l�der sentado em uma poltrona dourada, com duas fogueiras de cada lado, e prisioneiros acorrentados �s paredes.\r\n"
				+ "\r\n"
				+ "Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de l�mina dupla.\r\n"
				+ "\r\n" + "voc� deseja [ataca ou espera]?\r\n" + "");
	}

	public String setAtacaOuEspera(String atacaOuEspera) {
		this.atacaOuEspera = atacaOuEspera.toUpperCase();
		if (this.atacaOuEspera.equals("ATACA")) {
			return ("Ataca");
		} else {
			return ("Espera");
		}
	}

	public String getMensagemVitoria() {
		if (this.motivacao.equals("VINGANCA")) {
			return ("Voc� conseguiu!" + "\r\n"
					+ "Voc� obteve sua vingan�a. Voc� se ajoelha e cai no choro, invadido por uma sensa��o de al�vio e felicidade. "
					+ "\r\n" + "Voc� se vingou, tudo que sempre quis, est� feito. Agora voc� pode seguir sua vida.");
		} else {
			return ("Voc� conseguiu!" + "\r\n"
					+ "O �xtase em que voc� se encontra n�o cabe dentro de si. Voc� se ajoelha e grita de alegria. "
					+ "\r\n" + "A gl�ria o aguarda, voc� a conquistou.");
		}
	}

	public String getMensagemTextoFinal() {
		return ("Voc� se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos voc�s saem em dire��o � noite, retornando � cidade. "
				+ "\r\n" + "Seu dever est� cumprido.\r\n" + "\r\n" + "FIM\r\n" + "");
	}

	public void Combate(Personagem heroi, Personagem vilao) {

		System.out.println("Pontos de Vida do Heroi: " + heroi.getEnergia());
		System.out.println("Pontos de Vida do Vilao: " + vilao.getEnergia());

		if ((vilao.getEnergia() > 0) && (heroi.getEnergia() > 0)) {
			// heroi ataca
			int pontos = heroi.setAtaca(heroi);
			vilao.setAtualizaEnergia(pontos);

			System.out.println("Pontos de Vida do Heroi: " + heroi.getEnergia());
			System.out.println("Pontos de Vida do Vilao: " + vilao.getEnergia());

			if (vilao.getEnergia() > 0) {
				// vilao ataca
				pontos = vilao.setAtaca(vilao);
				heroi.setAtualizaEnergia(pontos);
			} else {
				System.out.println("Inimigo derrotado!");
			}
		}

	}

}